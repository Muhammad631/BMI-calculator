public abstract class Calculator {
    protected abstract double calculateBMI(double weight, double height);


    protected double convertToKilograms(double pounds) {
        return pounds * 0.453592;
    }


    protected double convertToMeters(double inches) {
        return inches * 0.0254;
    }
}

