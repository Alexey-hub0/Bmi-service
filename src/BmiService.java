public class BmiService {
    public int calculate(int kilograms, double meters) {
        double bmi = kilograms / (meters * meters);
        return (int) bmi;
    }
}