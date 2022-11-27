package Day6Logical;

import java.util.Scanner;

public class TemperatureConversion {
    /**
     *To the Util Class add temperatureConversion static function, given the temperature
     * in fahrenheit as input outputs the temperature in Celsius or vice versa using the formula
     * Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
     * Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
     */
    static double celsius(double f) {
        return (f - 32) * 5 / 9;
    }
    static double fahrenheit(double c){
        return (c *9/5)+32;
    }

    public static void main(String[] args) {
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit to Convert in celsius = ");
        fahrenheit = scanner.nextDouble();
        System.out.println("After Converting = " + celsius(fahrenheit) + " degree Celsius");

        double celsius;
        System.out.println("Enter Temperature in celsius to Convert in Fahrenheit = ");
        celsius = scanner.nextDouble();
        System.out.println("After Converting = " + fahrenheit(celsius));

    }
}
