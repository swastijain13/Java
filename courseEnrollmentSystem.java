import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class CourseException extends Exception {
    public CourseException(String message) {
        super(message);
    }
}

class Student {
    private String studentName;
    private int studentId;
    private List<Course> enrolledCourses;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void removeCourse(Course course) {
        enrolledCourses.remove(course);
    }

    public boolean isEnrolledIn(Course course) {
        return enrolledCourses.contains(course);
    }

    public void viewEnrolledCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println(studentName + " is enrolled in the following courses:");
            for (Course course : enrolledCourses) {
                System.out.println(course.getCourseName());
            }
        }
    }
}

interface CourseOperations {
    void enroll(Student student) throws CourseException;
    void removeEnrollment(Student student) throws CourseException;
    String viewCourseDetails();
}

class Course implements CourseOperations {
    private String courseName;
    private String courseDescription;
    private int courseId;

    public Course(int courseId, String courseName, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    @Override
    public void enroll(Student student) throws CourseException {
        if (student.isEnrolledIn(this)) {
            throw new CourseException("Student is already enrolled in this course.");
        }
        student.addCourse(this);
        System.out.println("Student enrolled in " + this.courseName);
    }

    @Override
    public void removeEnrollment(Student student) throws CourseException {
        if (!student.isEnrolledIn(this)) {
            throw new CourseException("Student is not enrolled in this course.");
        }
        student.removeCourse(this);
        System.out.println("Student removed from " + this.courseName);
    }

    @Override
    public String viewCourseDetails() {
        return "Course Name: " + this.courseName + "\nDescription: " + this.courseDescription;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class EnrollmentSystem {
    private Map<Integer, Course> courseCatalog;  // Maps courseId to Course object

    public EnrollmentSystem() {
        courseCatalog = new HashMap<>();
    }

    public void addCourse(Course course) {
        courseCatalog.put(course.getCourseId(), course);
    }

    public Course getCourseById(int courseId) throws CourseException {
        Course course = courseCatalog.get(courseId);
        if (course == null) {
            throw new CourseException("No such course exists.");
        }
        return course;
    }

    public void displayCourseDetails(int courseId) {
        try {
            Course course = getCourseById(courseId);
            System.out.println(course.viewCourseDetails());
        } catch (CourseException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class courseEnrollmentSystem {
    public static void main(String[] args) {
        EnrollmentSystem system = new EnrollmentSystem();

        // Creating some courses
        Course javaCourse = new Course(1, "Java Programming", "Learn the basics of Java programming.");
        Course pythonCourse = new Course(2, "Python Programming", "Learn Python programming and data science.");
        
        // Adding courses to the system
        system.addCourse(javaCourse);
        system.addCourse(pythonCourse);

        // Creating a student
        Student student = new Student(101, "Swasti Jain");

        try {
            // Enrolling student in courses
            javaCourse.enroll(student);
            pythonCourse.enroll(student);

            // Viewing student details
            student.viewEnrolledCourses();

            // Displaying course details
            system.displayCourseDetails(1); // Java course details
            system.displayCourseDetails(2); // Python course details

            // Trying to enroll again in Java course
            javaCourse.enroll(student);  // Should throw exception

            // Removing enrollment
            pythonCourse.removeEnrollment(student);
            student.viewEnrolledCourses();
            
            // Trying to remove enrollment from a course not enrolled in
            pythonCourse.removeEnrollment(student);  // Should throw exception
            
        } catch (CourseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

