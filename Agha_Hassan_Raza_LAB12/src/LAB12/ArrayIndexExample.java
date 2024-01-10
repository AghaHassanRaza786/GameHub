//AghaHassanRaza
//2021F-BSE-050
package LAB12;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an array with 10 randomly chosen integers
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Generating random integers between 0 and 99
        }

        // Prompt the user to enter the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array (0 to 9): ");
        
        try {
            // Get the user input and display the corresponding element value
            int index = scanner.nextInt();
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException if the index is out of bounds
            System.out.println("Out of Bounds (ArrayIndexOutOfBoundsException)");
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();        
    }
	}
}
