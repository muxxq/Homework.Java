public class Main {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        processor.readFromFile("input.txt");
        processor.displayResult();
    }
}