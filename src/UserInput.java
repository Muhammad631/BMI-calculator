import java.util.Scanner;

/**
 * A class responsible for handling user input
 */
public class UserInput {
    private Scanner scanner;

    /**
     * Constructor to initialize the scanner for user input.
     */
    public UserInput() {
        scanner = new Scanner(System.in);
    }
    /**
     * Prompt the user to enter their weight and return the entered value.
     *
     * @return User's weight in pounds.
     */


    public double getWeight() {
        System.out.print("Enter your weight in pounds: ");
        return scanner.nextDouble();
    }
    /**
     * Prompt the user to enter their height and return the entered value.
     *
     * @return User's height in inches.
     */

    public double getHeight() {
        System.out.print("Enter your height in inches: ");
        return scanner.nextDouble();
    }
    /**
     * Prompt the user to enter their gender and return the entered value.
     *
     * @return User's gender (M/F).
     */

    public char getGender() {
        System.out.print("Enter your gender (M/F): ");
        return scanner.next().charAt(0);
    }
    /**
     * Prompt the user to enter their age and return the entered value.
     *
     * @return User's age.
     */

    public int getAge() {
        System.out.print("Enter your age: ");
        return scanner.nextInt();
    }
    /**
     * Prompt the user to enter their activity level and return the entered value.
     *
     * @return User's activity level (sedentary/moderate/active).
     */


    public String getActivityLevel() {
        System.out.print("How active are you throughout the day? (sedentary/moderate/active): ");
        return scanner.next();
    }
    /**
     * Display the available activity levels to the user.
     */


    public void displayActivityLevels() {
        String[] activityLevels = {"sedentary", "moderate", "active"};
        System.out.println("Activity levels:");
        for (int i = 0; i < activityLevels.length; i++) {
            System.out.println((i + 1) + ". " + activityLevels[i]);
        }
    }
}
