import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Ecuatie ecuatie1 = new Ecuatie(2, 4); // 2x + 4 = 0
        Ecuatie ecuatie2 = new Ecuatie(0, 0); // 0x + 0 = 0
        Ecuatie ecuatie3 = new Ecuatie(0, 5); // 0x + 5 = 0

        try {
            Optional<Double> solutie1 = ecuatie1.rezolva();
            if (solutie1.isPresent()) {
                System.out.println("Solutie ecuatie 1: " + solutie1.get());
            } else {
                System.out.println("Ecuatie 1 nedeterminata");
            }

            Optional<Double> solutie2 = ecuatie2.rezolva();
            if (solutie2.isPresent()) {
                System.out.println("Solutie ecuatie 2: " + solutie2.get());
            } else {
                System.out.println("Ecuatie 2 nedeterminata");
            }

            Optional<Double> solutie3 = ecuatie3.rezolva();
            if (solutie3.isPresent()) {
                System.out.println("Solutie ecuatie 3: " + solutie3.get());
            } else {
                System.out.println("Ecuatie 3 nedeterminata");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}