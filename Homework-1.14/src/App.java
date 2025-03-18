import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public int readNumber() {
        while (true) {
            try {
                System.out.print("Introduceti un numar intreg: ");
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Eroare: Introduceti un numar intreg valid!");
                in.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        App app1 = new App();
        int nr1, nr2, sum;
        nr1 = app1.readNumber();
        nr2 = app1.readNumber();
        sum = nr1 + nr2;

        System.out.println("Suma: " + sum);
    }
}
