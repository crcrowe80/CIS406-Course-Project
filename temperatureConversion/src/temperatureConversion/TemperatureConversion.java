
package temperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Converter");
		System.out.print("Enter degrees in Fahrenheit: ");
		double fahrInput = input.nextDouble();
		double celsiusResult = (fahrInput - 32) * 5 / 9;
		System.out.println("Degrees in Celsius: " + (int)celsiusResult);
		System.out.println();
		
		System.out.print("Enter degrees in Celsius: ");
		double celsiusInput = input.nextDouble();
		double fahrResult = (celsiusInput * 9 / 5) + 32;
		System.out.println("Degrees in Fahrenheit: " + (int)fahrResult);
		System.out.println("\nBye!");
		
		input.close();
	}

}
