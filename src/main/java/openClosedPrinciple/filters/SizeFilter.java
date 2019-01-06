package openClosedPrinciple.filters;

import openClosedPrinciple.Product;
import openClosedPrinciple.enums.Size;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class SizeFilter implements Condition<Product> {

    private Size size;

    public SizeFilter(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
