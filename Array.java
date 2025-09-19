public class Array {

    public static void main(String[] args) {
    // Allocate an array with space for 30 ints (optional)
    int[] arrayobject = new int[30];
    arrayobject[0] = 1;
    arrayobject[1] = 2;
    arrayobject[2] = 3;
    arrayobject[3] = 4;

    for(arrayobject[4] = 5; arrayobject[4] < 30; arrayobject[4]++) {
        System.out.println("Array element at index " + arrayobject[4] + ": " + arrayobject[arrayobject[4]]);

    }

    // Declare and initialize another array of integers
    int[] numbers = {10, 20, 30, 40, 50};

    // Print the array reference (not useful) and the contents using Arrays.toString
    System.out.println(numbers); // prints reference
    System.out.println("Array length: " + numbers.length);
    System.out.println("Array contents: " + java.util.Arrays.toString(numbers));

        // Print the elements of the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Calculate and print the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}