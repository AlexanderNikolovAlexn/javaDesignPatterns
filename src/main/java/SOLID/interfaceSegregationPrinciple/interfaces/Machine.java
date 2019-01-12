package SOLID.interfaceSegregationPrinciple.interfaces;

import SOLID.interfaceSegregationPrinciple.Document;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
public interface Machine {

    void print(Document d);
    void scan(Document d);
    void fax(Document d);

}
