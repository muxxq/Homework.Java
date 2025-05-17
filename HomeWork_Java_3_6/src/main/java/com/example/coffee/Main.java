
package com.example.coffee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Coffee Lover With Injected Machines ===");
        List<CoffeMachine> machines = Arrays.asList(new SimpleCoffeMachine(), new ComplexCoffeMachine());
        CoffeLover lover = new CoffeLover(machines);
        lover.makeCoffee();
    }
}
