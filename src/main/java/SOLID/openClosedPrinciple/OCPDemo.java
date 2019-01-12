package SOLID.openClosedPrinciple;

import SOLID.openClosedPrinciple.enums.Color;
import SOLID.openClosedPrinciple.enums.Size;
import SOLID.openClosedPrinciple.filters.*;
import openClosedPrinciple.filters.*;

import java.util.List;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class OCPDemo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        Product car = new Product("Car", Color.RED, Size.MEDIUM);

        List<Product> productList = List.of(apple, tree, house, car);

        // BEFORE
        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products (old):");
        productFilter.filterByColor(productList, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p));

        System.out.println("Green and Large products (old):");
        productFilter.filterByColorAndSize(productList, Color.GREEN, Size.LARGE)
                .forEach(p -> System.out.println(" - " + p));

        // AFTER
        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green products (new):");
        betterFilter.filter(productList, new ColorFilter(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p));

        System.out.println("Green and Large products (new):");
        betterFilter.filter(productList, new AndFilter<>(new ColorFilter(Color.GREEN),
                                                         new SizeFilter(Size.LARGE)))
                .forEach(p -> System.out.println(" - " + p));

    }

}
