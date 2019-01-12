package SOLID.interfaceSegregationPrinciple;

import SOLID.interfaceSegregationPrinciple.interfaces.Scanner;
import SOLID.interfaceSegregationPrinciple.interfaces.Printer;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
public class PhotoCopier implements Printer, Scanner {

    @Override
    public void print(Document d) {
        // do something
    }

    @Override
    public void scan(Document d) {
        // do something
    }

}
