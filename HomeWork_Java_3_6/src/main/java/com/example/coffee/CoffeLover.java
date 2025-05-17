
package com.example.coffee;

import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines;

    public CoffeLover(List<CoffeMachine> coffeMachines) {
        this.coffeMachines = coffeMachines;
    }

    public void makeCoffee() {
        coffeMachines.forEach(CoffeMachine::start);
    }
}
