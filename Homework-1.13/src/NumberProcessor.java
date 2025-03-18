import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class NumberProcessor {
    private int x;

    public NumberProcessor() {
        this.x = 1; // Default value
    }

    public void readFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Using default value: " + x);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Using default value: " + x);
        }
    }

    public int calculate() {
        return 2 * x;
    }

    public void displayResult() {
        System.out.println("Calculated value: " + calculate());
    }
}