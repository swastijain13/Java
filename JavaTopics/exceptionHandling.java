package JavaTopics;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class exceptionHandling {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        else{
            System.out.println("Valid age " + age);
        }
    }

    
    public static void main(String[] args) {

        //try catch finally
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Finally block executed.");
        }


        //custom exception
        try{
            validateAge(16);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }


        try{
            validateAge(20);
        }
        catch(InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
