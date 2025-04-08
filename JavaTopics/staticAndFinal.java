package JavaTopics;
class staticExample{
    static int counter = 0;

    public staticExample(){
        counter++;
    }

    public static void greet(){
        System.out.println("Inside static method");
    }
}

class Parent {
    // Declaring a final method
    public final void display() {
        System.out.println("Display from Parent class");
    }
}

// class Child extends Parent {
//     Uncommenting this method would result in a compile-time error
//     public void display() {
//         System.out.println("Display from Child class"); //cannot override final method
//     }


final class A{
    public void greet() {
        System.out.println("Hello from FinalClass");
    }
}

class AnotherClass {
    // Uncommenting this line would result in a compile-time error
    // class SubClass extends FinalClass {}  // Error: Cannot subclass final class 'FinalClass'
}


public class staticAndFinal {
    public static void main(String[] args) {
        staticExample obj1 = new staticExample();
        System.out.println(staticExample.counter);
        staticExample obj2 = new staticExample();
        System.out.println(staticExample.counter);
        staticExample obj3 = new staticExample();
        System.out.println(staticExample.counter);

        staticExample.greet();

        //final example

        //final variable
        final int MAX_VALUE = 100;    
        // MAX_VALUE = 200 -> GIVE ERROR : Error: Cannot assign a value to final variable 'MAX_VALUE'


        

    }
    
}
