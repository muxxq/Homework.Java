import java.util.Optional;

public class Ecuatie {
    private double a;
    private double b;

    public Ecuatie(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Optional<Double> rezolva() throws IllegalArgumentException {
        if (a == 0) {
            if (b == 0) {
                // Ecuație nedeterminata (0x + 0 = 0)
                return Optional.empty(); // Sau throw new IllegalArgumentException("Ecuatie nedeterminata");
            } else {
                // Ecuatie imposibila (0x + b = 0, b != 0)
                throw new IllegalArgumentException("Ecuatie imposibila");
            }
        } else {
            // Ecuatie determinata (ax + b = 0)
            return Optional.of(-b / a);
        }
    }
}