package interfaceSegregationPrinciple;

import interfaceSegregationPrinciple.interfaces.Printer;
import interfaceSegregationPrinciple.interfaces.Scanner;

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
