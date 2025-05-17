
package com.example.coffee;

public class SimpleCoffeMachine implements CoffeMachine {
    @Override
    public void start() {
        System.out.println("Simple coffee machine: Making a simple coffee...");
    }
}
