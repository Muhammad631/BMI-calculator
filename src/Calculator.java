/**
 * Calculator class with methods to calculate BMI and provide conversion functions.
 *
 */
public abstract class Calculator {
    /**
     * Abstract method to calculate BMI based on weight and height.
     *
     * @param weight Weight in pounds.
     * @param height Height in inches.
     * @return Calculated BMI.
     */
    protected abstract double calculateBMI(double weight, double height);
    /**
     * Convert weight from pounds to kilograms.
     *
     * @param pounds Weight in pounds.
     * @return Weight in kilograms.
     */

    protected double convertToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    /**
     * Convert height from inches to meters.
     *
     * @param inches Height in inches.
     * @return Height in meters.
     */

    protected double convertToMeters(double inches) {
        return inches * 0.0254;
    }
}

