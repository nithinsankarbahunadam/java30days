public class Inheritance {
    // Base class (parent class)
    static class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    //using child class to inherit the properties of parent class so we can reuse the code and add more features to it
    // Derived class (child class)
    static class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    //another child class Cat that also inherits from Animal
    static class Cat extends Animal {
        void meow() {
            System.out.println("The cat meows.");
        }
    }

    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        //methodoverriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already defined in its superclass or parent class
        //example of method overriding
        //how this works is that we create an anonymous subclass of Animal and override the eat() method to provide a new implementation
        //this is useful when we want to create a one-time use subclass without formally defining a new class
        //here we create an anonymous subclass of Animal and override the eat() method
        Animal myAnimal = new Animal() {
            @Override
            void eat() {
                System.out.println("This animal eats plants.");
            }
        };


        // Call methods from both the Dog class and the Animal class
        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method from Dog class

        myCat.eat();  // Inherited method from Animal class
        myCat.meow(); // Method from Cat class

        myAnimal.eat(); // Calls the overridden method in the anonymous subclass
    }

    // Note: In Java, a class can only inherit from one superclass (single inheritance).
    // However, a class can implement multiple interfaces (multiple inheritance of type).
    //there is a concept called hierarchical inheritance where multiple classes inherit from a single parent class
    // Example: Dog and Cat classes both inherit from the Animal class


    // Output:
    // This animal eats food.
    // The dog barks.
}
