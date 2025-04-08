package JavaTopics.basics;

public interface controlStatements {
   public static void main(String[] args) {
        //if-else
        int number = 10;
        
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        //switch case
        int day = 2;
        String dayname;
        switch (day){
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            default:
                dayname = "Today";
                break;
        }
        System.out.println(dayname);

        //for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration number: " + i);
        }

        //while
        int num = 6;
        while (num <= 10) {
            System.out.println("Iteration number: " + num);
            num++;
        }

        //do-while
        int i = 1;
        do {
            System.out.println("Iteration number: " + i);
            i++;
        } while (i <= 5);

   }
    
}
