package geometry;

/**
 * Square shape respecting SRP.
 */
public class Square implements Shape {
    private final double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("Side must be positive");
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}