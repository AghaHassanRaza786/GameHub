//AghaHassanRaza
//2021F-BSE-050
package LAB12;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        try {
	            // Get input from the user
	            System.out.print("Enter the dividend (numerator): ");
	            int numerator = scanner.nextInt();

	            System.out.print("Enter the divisor (non-zero denominator): ");
	            int divisor = scanner.nextInt();

	            // Check for division by zero
	            if (divisor == 0) {
	                throw new ArithmeticException("Division by zero is not allowed");
	            }

	            // Check for decimal input
	            if (numerator % divisor != 0) {
	                throw new InputMismatchException("Invalid input. Please enter integer numbers.");
	            }

	            // Perform division and display the result
	            int result = numerator / divisor;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (InputMismatchException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Unexpected error: " + e.getMessage());
	        } finally {
	            // Close the scanner
	            scanner.close();
	}
}
}
