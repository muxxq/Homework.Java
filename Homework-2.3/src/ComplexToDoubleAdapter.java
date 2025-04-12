public class ComplexToDoubleAdapter {
    public static Double convert(ComplexNumber complex) {
        return Math.sqrt(
            complex.getReal() * complex.getReal() +
            complex.getImaginary() * complex.getImaginary()
        );
    }
}
