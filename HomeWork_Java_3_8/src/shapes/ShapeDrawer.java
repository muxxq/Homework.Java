package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * High‑level module that depends on abstraction (Shape), not on concrete classes.
 * Shapes can be injected after creation (Dependency Injection via method).
 */
public class ShapeDrawer {

    private final List<Shape> shapes = new ArrayList<>();

    // Dependency Injection via public method
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        shapes.forEach(Shape::draw);
    }

    // Demo
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.addShape(new Circle());
        drawer.addShape(new Rectangle());

        drawer.drawAll();
    }
}