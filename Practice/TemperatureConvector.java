package Practice;

public class TemperatureConvector {
    double celsius;

    // Constructor to initialize the temperature in Celsius
    public TemperatureConvector(double celsius) {
        this.celsius = celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public double toKelvin() {
        return celsius + 273.15;
    }
    
}
