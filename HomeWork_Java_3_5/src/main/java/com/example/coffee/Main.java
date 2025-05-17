
package com.example.coffee;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Coffee Lover With Own Machines ===");
        CoffeLoverOwn ownLover = new CoffeLoverOwn();
        ownLover.makeCoffee();

        System.out.println("\n=== Coffee Lover With Injected Machines ===");
        List<CoffeMachine> machines = Arrays.asList(new SimpleCoffeMachine(), new ComplexCoffeMachine());
        CoffeLoverInjected injectedLover = new CoffeLoverInjected(machines);
        injectedLover.makeCoffee();
    }
}
