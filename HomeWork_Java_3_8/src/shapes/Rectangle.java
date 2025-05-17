package shapes;

/**
 * Rectangle shape — has single responsibility: knowing how to draw a rectangle.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("▭ Drawing a rectangle");
    }
}