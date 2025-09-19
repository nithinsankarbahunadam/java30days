public class Array {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers); // This will print the reference, not the contents
        System.out.println("Array length: " + numbers.length);

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