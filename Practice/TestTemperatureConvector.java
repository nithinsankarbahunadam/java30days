package Practice;
import java.util.Scanner;
public class TestTemperatureConvector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        TemperatureConvector tempConv = new TemperatureConvector(celsius); // 25 degrees Celsius
        System.out.println("Temperature in Celsius: " + tempConv.celsius);
        System.out.println("Temperature in Fahrenheit: " + tempConv.toFahrenheit());
        System.out.println("Temperature in Kelvin: " + tempConv.toKelvin());
        scanner.close();
    }
    
}
