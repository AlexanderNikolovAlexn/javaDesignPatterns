package openClosedPrinciple.filters;

import openClosedPrinciple.Product;
import openClosedPrinciple.enums.Color;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class ColorFilter implements Condition<Product> {

    private Color color;

    public ColorFilter(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
