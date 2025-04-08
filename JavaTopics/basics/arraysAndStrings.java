package JavaTopics.basics;

public class arraysAndStrings {
    public static void main(String[] args) {
        //arrays
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Accessing elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        //strings
        String str1 = "Hello";
        String str2 = "World";

        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);


        System.out.println("Length of str1: " + str1.length());

        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        String sub = result.substring(0, 5);
        System.out.println("Substring: " + sub);

    }
}
