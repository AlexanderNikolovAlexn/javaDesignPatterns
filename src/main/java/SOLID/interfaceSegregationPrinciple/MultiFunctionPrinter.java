package SOLID.interfaceSegregationPrinciple;

import SOLID.interfaceSegregationPrinciple.interfaces.Machine;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
// it is ok if you need a multifunction machine
public class MultiFunctionPrinter implements Machine {

    @Override
    public void print(Document d) {
        // do something
    }

    @Override
    public void scan(Document d) {
        // do something
    }

    @Override
    public void fax(Document d) {
        // do something
    }

}
