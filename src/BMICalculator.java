public class BMICalculator extends Calculator {
    private static final int MALE_CALORIE_BASE = 2000;
    private static final int FEMALE_CALORIE_BASE = 1800;
    private static final double SEDENTARY_MULTIPLIER = 1.2;
    private static final double MODERATE_MULTIPLIER = 1.5;
    private static final double ACTIVE_MULTIPLIER = 1.7;


    @Override
    public double calculateBMI(double weightInPounds, double heightInInches) {
        double weightInKilograms = this.convertToKilograms(weightInPounds);
        double heightInMeters = super.convertToMeters(heightInInches);
        return weightInKilograms / (Math.pow(heightInMeters, 2) != 0 ? Math.pow(heightInMeters, 2) : 1);
    }


    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Healthy weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }


    public double calculateMaintenanceCalories(double weightInPounds, double heightInInches, char gender, int age, String activityLevel) {
        double weightInKilograms = this.convertToKilograms(weightInPounds);
        double heightInMeters = this.convertToMeters(heightInInches);
        double bmr;


        if (gender == 'M' || gender == 'm') {
            bmr = 10 * weightInKilograms + 6.25 * heightInMeters * 100 - 5 * age + MALE_CALORIE_BASE;
        } else {
            bmr = 10 * weightInKilograms + 6.25 * heightInMeters * 100 - 5 * age + FEMALE_CALORIE_BASE;
        }


        double maintenanceCalories;
        switch (activityLevel.toLowerCase()) {
            case "sedentary":
                maintenanceCalories = bmr * SEDENTARY_MULTIPLIER;
                break;
            case "moderate":
                maintenanceCalories = bmr * MODERATE_MULTIPLIER;
                break;
            case "active":
                maintenanceCalories = bmr * ACTIVE_MULTIPLIER;
                break;
            default:
                maintenanceCalories = bmr;
        }


        return maintenanceCalories;
    }
}
