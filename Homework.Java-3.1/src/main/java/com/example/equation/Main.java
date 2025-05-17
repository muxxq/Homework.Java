
package com.example.equation;

public class Main {
    public static void main(String[] args) {
        EquationSolver solver = new EquationSolver(2, -4); // exemplu: 2x - 4 = 0
        EquationResult result = solver.solve();

        String outputPath = "solution.json";
        JsonWriter.writeResultToJson(result, outputPath);

        System.out.println("Rezultat salvat in " + outputPath);
    }
}
