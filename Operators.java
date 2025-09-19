public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println("!y: " + (!y));

        // Unary Operators
        int c = 5;
        System.out.println("c: " + c);
        System.out.println("++c: " + (++c));
        System.out.println("c++: " + (c++));
        System.out.println("c: " + c);
        System.out.println("--c: " + (--c));
        System.out.println("c--: " + (c--));
        System.out.println("c: " + c);

        // Ternary Operator
        int max = (a > b) ? a : b; // if a > b then max = a else max = b
        System.out.println("Max of a and b: " + max);

        // Assignment Operators
        int d = 15;
        d += 5; // d = d + 5
        System.out.println("d after d += 5: " + d);
        d -= 3; // d = d - 3
        System.out.println("d after d -= 3: " + d);
        d *= 2; // d = d * 2
        System.out.println("d after d *= 2: " + d);
        d /= 4; // d = d / 4
        System.out.println("d after d /= 4: " + d);
        d %= 3; // d = d % 3
        System.out.println("d after d %= 3: " + d);

        // Bitwise Operators
        //Bitwise AND, OR, XOR, NOT, Left Shift, Right Shift, Unsigned Right Shift
        int e = 5;  // 0101 in binary
        int f = 3;  // 0011 in binary
        System.out.println("e & f: " + (e & f)); // 0001
        System.out.println("e | f: " + (e | f)); // 0111
        System.out.println("e ^ f: " + (e ^ f)); // 0110
        System.out.println("~e: " + (~e));       // 1010 (in 32-bit representation)
        System.out.println("e << 1: " + (e << 1)); // 1010
        System.out.println("e >> 1: " + (e >> 1)); // 0010
        System.out.println("e >>> 1: " + (e >>> 1)); // 0010 This is same as e >> 1 for positive numbers

        // Instanceof Operator
        String str = "Hello"; // str is an instance of String
        System.out.println("str instanceof String: " + (str instanceof String)); // true
        System.out.println("str instanceof Object: " + (str instanceof Object)); // true

        // Type Cast Operator
        double g = 9.78;
        int h = (int) g; // Explicit casting
        System.out.println("g: " + g);
        System.out.println("h (after casting g to int): " + h);

        // String Concatenation Operator
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        
        // Conditional Operator
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
        System.out.println("Voting Eligibility: " + eligibility);

        // Null Coalescing Operator (Java 8 and above)
        String nullableString = null;
        String result = (nullableString != null) ? nullableString : "Default Value";
        System.out.println("Result: " + result);

        // Lambda Operator (Java 8 and above)
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.println("Number: " + n));

        // Method Reference Operator (Java 8 and above)
        numbers.forEach(System.out::println);


    }
}
