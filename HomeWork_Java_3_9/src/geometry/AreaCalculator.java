package geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * High‑level module that depends on abstraction Shape.
 * Single responsibility: compute total area for injected shapes.
 */
public class AreaCalculator {

    private final List<Shape> shapes = new ArrayList<>();

    // Dependency injection via public method
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double totalArea() {
        return shapes.stream()
                     .mapToDouble(Shape::area)
                     .sum();
    }

    // Demo
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        calc.addShape(new Circle(2));
        calc.addShape(new Square(3));
        calc.addShape(new Rectangle(2,5));

        System.out.printf("Total area = %.2f%n", calc.totalArea());
    }
}