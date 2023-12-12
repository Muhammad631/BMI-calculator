import java.util.Scanner;


public class UserInput {
    private Scanner scanner;


    public UserInput() {
        scanner = new Scanner(System.in);
    }


    public double getWeight() {
        System.out.print("Enter your weight in pounds: ");
        return scanner.nextDouble();
    }


    public double getHeight() {
        System.out.print("Enter your height in inches: ");
        return scanner.nextDouble();
    }


    public char getGender() {
        System.out.print("Enter your gender (M/F): ");
        return scanner.next().charAt(0);
    }


    public int getAge() {
        System.out.print("Enter your age: ");
        return scanner.nextInt();
    }


    public String getActivityLevel() {
        System.out.print("How active are you throughout the day? (sedentary/moderate/active): ");
        return scanner.next();
    }


    public void displayActivityLevels() {
        String[] activityLevels = {"sedentary", "moderate", "active"};
        System.out.println("Activity levels:");
        for (int i = 0; i < activityLevels.length; i++) {
            System.out.println((i + 1) + ". " + activityLevels[i]);
        }
    }
}
