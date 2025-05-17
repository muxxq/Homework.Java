
package com.example.shapes;

import java.util.List;

public class AreaCalculator {
    public static double sumAreas(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::area).sum();
    }
}
