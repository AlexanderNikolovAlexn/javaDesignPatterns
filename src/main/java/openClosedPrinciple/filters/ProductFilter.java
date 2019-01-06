package openClosedPrinciple.filters;

import openClosedPrinciple.Product;
import openClosedPrinciple.enums.Color;
import openClosedPrinciple.enums.Size;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> items, Color color) {
        return items.stream().filter(p -> p.getColor() == color);
    }

    // Problem is that we are modifying already existing class and we can break old behaviour
    public Stream<Product> filterBySize(List<Product> items, Size size) {
        return items.stream().filter(p -> p.getSize() == size);
    }

    // Imagine if we have to combine a lot of filters here, this will go out of control soon
    public Stream<Product> filterByColorAndSize(List<Product> items,
                                                       Color color,
                                                       Size size) {
        return items.stream().filter(p -> p.getColor() == color && p.getSize() == size);
    }

}
