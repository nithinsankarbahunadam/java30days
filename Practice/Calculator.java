package Practice;

public class Calculator {

    int a;
    int b;

    public Calculator(){
        System.out.println("Default Constructor called");
    }

    public Calculator(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Parameterized Constructor called");
    }

    public int add(){
        return (a+b);
    }

    public int multiply(){
        return (a*b);
    }

    public int substract(){
        if(a>b){
            return (a-b);
        }else{
            return (b-a);
        }
    }

    public int divide(){
        if(b!=0){
            return (a/b);
        }else{
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
    
}

class AdvancedCalculator extends Calculator {
    
    public AdvancedCalculator(int a, int b) {
        super(a, b); // Call the constructor of the parent class
    }

    public int power() {
        return (int) Math.pow(a, b);
    }

    public int modulus() {
        if (b != 0) {
            return (a % b);
        } else {
            System.out.println("Modulus by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        AdvancedCalculator advCalc = new AdvancedCalculator(10, 2);
        System.out.println("Addition: " + advCalc.add());
        System.out.println("Subtraction: " + advCalc.substract());
        System.out.println("Multiplication: " + advCalc.multiply());
        System.out.println("Division: " + advCalc.divide());
        System.out.println("Power: " + advCalc.power());
        System.out.println("Modulus: " + advCalc.modulus());
    }
}

