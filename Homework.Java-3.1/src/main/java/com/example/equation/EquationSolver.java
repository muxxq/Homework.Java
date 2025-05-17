
package com.example.equation;

public class EquationSolver {
    private final double a;
    private final double b;

    public EquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public EquationResult solve() {
        if (a == 0 && b == 0) {
            return new EquationResult("Infinite solutions", null);
        } else if (a == 0) {
            return new EquationResult("No solution", null);
        } else {
            double x = -b / a;
            return new EquationResult("Unique solution", x);
        }
    }
}
