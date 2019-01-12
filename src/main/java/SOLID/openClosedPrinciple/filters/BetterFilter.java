package SOLID.openClosedPrinciple.filters;

import SOLID.openClosedPrinciple.Product;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Condition<Product> condition) {
        return items.stream().filter(p -> condition.isSatisfied(p));
    }
}
