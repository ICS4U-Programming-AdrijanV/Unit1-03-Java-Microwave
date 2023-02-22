// Importing
import java.util.Scanner;
/**
* Calculate the time to microwave the users food.
*
* @author  Adrijan Vranjkovic
* @version 1.0
* @since   2023-02-22
*/

// Making class
public final class Microwave {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Microwave() {
        throw new IllegalStateException("Utility class.");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {


        final Scanner scanner = new Scanner(System.in);
        
        try {
            // Using scanner to get the food.
            System.out.println("Are you heating pizza, sub, or soup?");
            
            final String userFood = scanner.nextLine();

            // Using scanner to get the number of food.
            System.out.println("how many " + userFood + "(s) are you heating up (1, 2, 3)?");
            String foodNum = scanner.nextLine();

            // Make user input a double.
            int foodNumInt = Integer.parseInt(foodNum);

            // setting constants.
            final int PIZZA_TIME = 45;
            final int SUB_TIME = 60;
            final int SOUP_TIME = 105;
            final String SOUP = "soup";
            final String PIZZA = "pizza";
            final String SUB = "sub";

            // finding out what food and the number of food they chose.
            if (PIZZA.equals(userFood)) {
                if (foodNumDouble == 1) {
                    //calculate the time
                    double totalTime = PIZZA_TIME;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else if (foodNumDouble == 2) {
                    //calculate the time
                    double totalTime = PIZZA_TIME * 1.5;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else if (foodNumDouble == 3) {
                    //calculate the time
                    double totalTime = PIZZA_TIME * 2;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else {
                    // Print this if the user enter an invalid input.
                    System.out.println("This in not a valid input.");
                }
            } else if (SUB.equals(userFood)) {
                if (foodNumDouble == 1) {
                    //calculate the time
                    double totalTime = SUB_TIME;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else if (foodNumDouble == 2) {
                    //calculate the time
                    double totalTime = SUB_TIME * 1.5;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else if (foodNumDouble == 3) {
                    //calculate the time
                    double totalTime = SUB_TIME * 2;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else {
                    // Print this if the user enter an invalid input.
                    System.out.println("This in not a valid input.");
                }
            } else if (userFood.equals(SOUP)) {
                if (foodNumDouble == 1) {
                    //calculate the time
                    double totalTime = SOUP_TIME;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else if (foodNumDouble == 2) {
                    //calculate the time
                    double totalTime = SOUP_TIME * 1.5;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else if (foodNumDouble == 3) {
                    //calculate the time
                    double totalTime = SOUP_TIME * 2;
                    // Print the total time..
                    System.out.println("The total time to heat it up is " + totalTime + " seconds.");
                } else {
                    // Print this if the user enter an invalid input.
                    System.out.println("This in not a valid input.");
                }
            } else {
                // Print this if the user enter an invalid input.
                System.out.println("This in not a valid input.");
            }

        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid option!"
                + error.getMessage());
        }
        // Close scanner.
        scanner.close();
    }
}
