package coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines = new ArrayList<>();

    // Inject coffee machines via public method
    public void addCoffeMachine(CoffeMachine coffeMachine) {
        this.coffeMachines.add(coffeMachine);
    }

    public void makeCoffe() {
        coffeMachines.forEach(CoffeMachine::start);
    }

    // Optional: for testing/demo
    public static void main(String[] args) {
        CoffeLover lover = new CoffeLover();
        lover.addCoffeMachine(new SimpleCoffeMachine());
        lover.addCoffeMachine(new ComplexCoffeMachine());

        lover.makeCoffe();
    }
}