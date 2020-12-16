public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(72, 180);
        System.out.printf("Your BMI is " + "%.1f", bmi);
    }
}
