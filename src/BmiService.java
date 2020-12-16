public class BmiService {
    public double calculate (int weight, int height) {
        double heightInMeters = (double) height / 100;
        return weight / Math.pow(heightInMeters, 2);
    }
}
