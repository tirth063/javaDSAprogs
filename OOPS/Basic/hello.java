package OOPS.Basic;

public class hello {
    enum  Hello1 {
        HELLO,WORLD, JAVA, PROGRAMMING, LANGUAGE, HELLO_WORLD, JAVA_PROGRAMMING, LANGUAGE_PROGRAMMING, HELLO_WORLD_PROGRAMMING, JAVA_PROGRAMMING_LANGUAGE, HELLO_WORLD_PROGRAMMING_LANGUAGE
    }

    public static void main(String[] args) {
        Animal animal;
        Dog dog = new Dog("Dog", 2, "Labrador");
        Cat cat = new Cat();
        animal = dog;
        animal.makeSound();
        dog.makeSound();
        cat.play();
        Address address = new Address("123 Main St", "Anytown", "CA");
        Employee employee = new Employee("John Doe", address, 1001);
        employee.displayEmployeeDetails();

        // Enums
        System.out.println(Hello1.HELLO);
        Hello1 h;
        h = Hello1.HELLO;
        h = Hello1.WORLD;
        h = Hello1.JAVA;
        h = Hello1.PROGRAMMING;
        h = Hello1.LANGUAGE;
        h = Hello1.HELLO_WORLD;
        h = Hello1.JAVA_PROGRAMMING;
        h = Hello1.LANGUAGE_PROGRAMMING;
        h = Hello1.HELLO_WORLD_PROGRAMMING;
        h = Hello1.JAVA_PROGRAMMING_LANGUAGE;
        h = Hello1.HELLO_WORLD_PROGRAMMING_LANGUAGE;
        h = Hello1.HELLO_WORLD_PROGRAMMING_LANGUAGE;
    }
}
// Class declaration
abstract class Animal {
    // Member variables
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Inheritance
}

// Inheritance
class Dog extends Animal {
    // Encapsulation
    private final String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Polymorphism
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Abstraction
}

// Interface
interface Playful {
    void play();
}

// Interface implementation
class Cat implements Playful {
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}

// Aggregation
class Address {
    private String street;
    private String city;
    private String state;

    // Constructor
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    // Getter methods
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}

class Person {
    private String name;
    private Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Method using 'this' keyword
    public void displayPersonDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address.getStreet() + ", " + this.address.getCity() + ", " + this.address.getState());
    }
}

class Employee extends Person {
    private int employeeId;

    // Constructor using 'super' keyword
    public Employee(String name, Address address, int employeeId) {
        super(name, address);
        this.employeeId = employeeId;
    }

    // Method
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + this.employeeId);
        super.displayPersonDetails(); // Calling method from the superclass using 'super'
    }
}






