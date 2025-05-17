
package com.example.coffee;

import java.util.List;

public class CoffeLoverInjected {
    private List<CoffeMachine> coffeMachines;

    public CoffeLoverInjected(List<CoffeMachine> coffeMachines) {
        this.coffeMachines = coffeMachines;
    }

    public void makeCoffee() {
        coffeMachines.forEach(CoffeMachine::start);
    }
}
