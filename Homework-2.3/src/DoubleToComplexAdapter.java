public class DoubleToComplexAdapter {
    public static ComplexNumber convert(Double value) {

        return new ComplexNumber(value, 0);
    }
}
