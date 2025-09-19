import java.util.Scanner;
public class Arrayexample {
    public static void main(String[] args) {
        
        int[] arrayobject = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        for(int i = 0; i < arrayobject.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arrayobject[i] = s.nextInt();
        }

        for(int i = 0; i < arrayobject.length; i++) {
            System.out.println("Array element at index " + i + ": " + arrayobject[i]);
        }
    }
    
}
