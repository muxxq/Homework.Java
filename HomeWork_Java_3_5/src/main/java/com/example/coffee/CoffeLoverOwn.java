
package com.example.coffee;

public class CoffeLoverOwn {
    private SimpleCoffeMachine simple;
    private ComplexCoffeMachine complex;

    public CoffeLoverOwn() {
        this.simple = new SimpleCoffeMachine();
        this.complex = new ComplexCoffeMachine();
    }

    public void makeCoffee() {
        simple.start();
        complex.start();
    }
}
