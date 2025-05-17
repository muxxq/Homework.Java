
package com.example.shapes;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(6, 2);

        List<Shape> shapes = Arrays.asList(circle, rectangle, triangle);
        double totalArea = AreaCalculator.sumAreas(shapes);

        System.out.println("Total area: " + totalArea);
    }
}
