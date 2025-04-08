package JavaTopics;

interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void speak();  // Abstract method
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}

class Duck extends Animal implements Swimmer, Flyer {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Quack!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }
}


abstract class Vehicle {
    String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void start();
    
    public void stop() {
        System.out.println(model + " is stopping.");
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}


public class oops {
    public static void main(String[] args) {
        // Encapsulation example
        Person person = new Person("Alice", 25);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");

        // Inheritance and Polymorphism example
        Animal animal = new Dog("Buddy");
        animal.speak();  
        Animal duck = new Duck("Diamond");
        duck.speak();  
        ((Duck) duck).swim(); 
        ((Duck) duck).fly();   

        // Abstract class and method
        Vehicle car = new Car("Tesla");
        car.start();  
        car.stop();   
    }
}

