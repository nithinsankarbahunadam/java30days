public class Oops {
    int a;
    int b;
    int c;

    void sumnumbers() {
        System.out.println("Sum of numbers: " + (a + b + c));
    }
}

class OopsExample {
    public static void main(String[] args) {
        Oops obj = new Oops();   // default no-arg constructor
        obj.a = 10;
        obj.b = 20;
        obj.c = 30;
        obj.sumnumbers();
    }
}