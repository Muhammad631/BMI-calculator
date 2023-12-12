import java.util.Date;
public class Main {
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
