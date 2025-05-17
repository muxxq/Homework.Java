package coffee;

public class SimpleCoffeMachine implements CoffeMachine {
    @Override
    public void start() {
        System.out.println("Simple Coffee Machine started brewing!");
    }
}