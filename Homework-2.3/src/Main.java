public class Main {
    public static void main(String[] args) {
        // Double -> ComplexNumber
        ComplexNumber c1 = DoubleToComplexAdapter.convert(5.0);
        System.out.println("From Double to ComplexNumber: " + c1);

        // ComplexNumber -> Double (modul)
        ComplexNumber c2 = new ComplexNumber(3, 4); // Modul = 5
        Double mod = ComplexToDoubleAdapter.convert(c2);
        System.out.println("From ComplexNumber to Double (modul): " + mod);
    }
}
