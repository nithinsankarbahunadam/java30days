public class Constructors {
    int a;
    int b;
    int c;

    Constructors() { //even if you don't define a constructor, java compiler provides a default no-arg constructor
        // Default constructor
        System.out.println("Default constructor called");
    }

    //new constructor with parameters two
    Constructors(int a, int b) {
        System.out.println("Constructor with two parameters called");
        this.a = a;
        this.b=b;
    }

    // Parameterized constructor to initialize the variables
    Constructors(int a, int b, int c) {
        System.out.println("Parameterized constructor called");
        this.a = a; //this keyword is used to refer to the current object's instance variable
        this.b = b;
        this.c = c;
    }

    void sumtwonumbers() {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    void sumnumbers() {
        System.out.println("Sum of numbers: " + (a + b + c));
    }

    void sayHello() {
        System.out.println("Hello from Constructors class!");
    }

    public static void main(String[] args) {

        // Create an object of the Constructors class using the parameterized constructor
        Constructors obj = new Constructors(10, 20, 30); // Calls the parameterized constructor

        // Call the method to display the sum
        obj.sumnumbers();

        // Create another object using the two-parameter constructor
        Constructors obj1 = new Constructors(15, 25); // Calls the constructor with two parameters

        // Call the method to display the sum of two numbers
        obj1.sumtwonumbers();

        Constructors obj2 = new Constructors(); // Calls the default constructor

        // Call the method to say hello
        obj2.sayHello();
    }
    
}
