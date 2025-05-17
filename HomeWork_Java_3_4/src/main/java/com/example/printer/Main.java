
package com.example.printer;

public class Main {
    public static void main(String[] args) {
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print();

        MultifunctionalPrinter fullPrinter = new FullMultifunctionPrinter();
        fullPrinter.print();
        fullPrinter.scan();
        fullPrinter.fax();
    }
}
