package convert;
import java.util.Scanner;
public class WeatherConverter {

	 public static void main(String[] args) {
	        // Create a scanner object for user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for input
	        System.out.println("Enter temperature in Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();
	        
	        // Convert Fahrenheit to Celsius
	        double celsius = (fahrenheit - 32) * 5 / 9;
	        
	        // Display the result
	        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
	        
	        // Close the scanner
	        scanner.close();
	    }
	}