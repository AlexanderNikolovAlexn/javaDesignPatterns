package SOLID.openClosedPrinciple.filters;

import SOLID.openClosedPrinciple.Product;
import SOLID.openClosedPrinciple.enums.Color;

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
