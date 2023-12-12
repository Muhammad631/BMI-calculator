import java.util.Date;
/**
 * The main class to execute our BMI calculator program
 */
public class Main {
    /**
     * main method that initializes user input, calculates BMI and maintenance calories,
     * and displays the results along with the current date.
     */
    public static void main(String[] args) {
        UserInput userInputHandler = new UserInput();
        userInputHandler.displayActivityLevels();
        double weightInPounds = userInputHandler.getWeight();
        double heightInInches = userInputHandler.getHeight();
        char gender = userInputHandler.getGender();
        int age = userInputHandler.getAge();
        String activityLevel = userInputHandler.getActivityLevel();


        BMICalculator calculatorLogic = new BMICalculator();
        double bmi = calculatorLogic.calculateBMI(weightInPounds, heightInInches);
        String bmiCategory = calculatorLogic.getBMICategory(bmi);
        double maintenanceCalories = calculatorLogic.calculateMaintenanceCalories(weightInPounds, heightInInches, gender, age, activityLevel);

        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("BMI Category: " + bmiCategory);
        System.out.printf("Maintenance Calories: %.2f\n", maintenanceCalories);


        Date date = new Date();
        System.out.println("Current Date: " + date.toString());
    }
}
