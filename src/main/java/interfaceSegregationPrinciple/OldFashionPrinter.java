package interfaceSegregationPrinciple;

import interfaceSegregationPrinciple.interfaces.Machine;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
//YAGNI = You ain`t going to need it
public class OldFashionPrinter implements Machine {

    @Override
    public void print(Document d) {
        // do something
    }

    @Override
    public void scan(Document d) {
        // not support, so probably we need to throw an Exception
        throw new UnsupportedOperationException();
    }

    @Override
    public void fax(Document d) {
        // not support, so probably we need to throw an Exception
        throw new UnsupportedOperationException();
    }
}
