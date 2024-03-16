/**
 * This Java program checks if a number entered by the user is even or odd,
 * using arithmetic operations instead of conditionals.
 * 
 * If the number is Even, the Output data will be Even
 * If the number is Odd, the Output data will be Odd
 * 
 */

import java.util.Scanner; // Importing the Scanner class to read user input
public class OddEvenChecker {
    /**
     * The main method that starts the execution of the program.
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input and storing the data in the Scanner variable

        System.out.print("Enter an integer: "); // Asking the user to enter a number
        int number = scanner.nextInt(); // Reading the number entered by the user

        String[] results = {"even", "odd"}; // Creating an array of strings to indicate if the number is even or odd, respectively.
        System.out.println(number + " is " + results[Math.abs(number % 2)]); 
        /** 
         * Using arithmetic operations to determine if it is even or odd
         * It calculates the remainder of dividing number by 2 and takes the absolute value of that remainder.
         * If number is even, the remainder will be 0, so results[0] will be "even".
         * If number is odd, the remainder will be 1 (or -1 if it's negative), so results[1] will be "odd".
         * Finally, concatenating the number entered by the user with the corresponding string (even or odd)
         * and printing it to the standard output.
         */
         

        scanner.close(); 
        /**
         * Closing the Scanner object to release resources
         * This line closes the Scanner object to release the resources associated with the standard input of the user.
         * It is a good practice to close the Scanner once we no longer need it to avoid potential resource leaks.
         */
    }
}