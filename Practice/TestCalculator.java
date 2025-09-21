package Practice;

public class TestCalculator {
    public static void main(String[] args) {
        // Using the default constructor
        Calculator calc1 = new Calculator();
        calc1.a = 15;
        calc1.b = 5;
        System.out.println("Addition: " + calc1.add());
        System.out.println("Subtraction: " + calc1.substract());
        System.out.println("Multiplication: " + calc1.multiply());
        System.out.println("Division: " + calc1.divide());

        // Using the parameterized constructor
        Calculator calc2 = new Calculator(20, 4);
        System.out.println("Addition: " + calc2.add());
        System.out.println("Subtraction: " + calc2.substract());
        System.out.println("Multiplication: " + calc2.multiply());
        System.out.println("Division: " + calc2.divide());

        // Using the AdvancedCalculator which extends Calculator
        AdvancedCalculator advCalc = new AdvancedCalculator(2, 3);
        System.out.println("Power: " + advCalc.power());
        System.out.println("Modulus: " + advCalc.modulus());
    }
}
