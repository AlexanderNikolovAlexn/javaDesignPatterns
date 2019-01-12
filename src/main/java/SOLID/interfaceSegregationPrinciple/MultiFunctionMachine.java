package SOLID.interfaceSegregationPrinciple;

import SOLID.interfaceSegregationPrinciple.interfaces.MultiFunctionDevice;
import SOLID.interfaceSegregationPrinciple.interfaces.Printer;
import SOLID.interfaceSegregationPrinciple.interfaces.Scanner;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
public class MultiFunctionMachine implements MultiFunctionDevice {

    // Decorator pattern - compose this out of several modules
    private Printer printer;
    private Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document d) {
        // do something
    }

    @Override
    public void scan(Document d) {
        // do something
    }

}
