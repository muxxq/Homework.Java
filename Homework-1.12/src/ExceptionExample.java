public class ExceptionExample {
    public static int divide10(int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException("Impartire la zero!");
        }
        return 10 / x;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Rezultat: " + divide10(2)); // 5
            System.out.println("Rezultat: " + divide10(0)); // Arunca excepție
        } catch (ArithmeticException e) {
            System.out.println("Eroare capturata: " + e.getMessage());
        }
    }
}
