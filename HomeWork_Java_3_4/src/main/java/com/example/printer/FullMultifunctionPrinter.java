
package com.example.printer;

public class FullMultifunctionPrinter implements MultifunctionalPrinter {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Sending fax...");
    }
}
