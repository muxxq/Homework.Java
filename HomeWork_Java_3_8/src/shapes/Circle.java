package shapes;

/**
 * Circle shape — has single responsibility: knowing how to draw a circle.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("◯ Drawing a circle");
    }
}