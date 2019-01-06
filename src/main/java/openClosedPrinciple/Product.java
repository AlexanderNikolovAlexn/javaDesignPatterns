package openClosedPrinciple;

import openClosedPrinciple.enums.Color;
import openClosedPrinciple.enums.Size;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class Product {

    private String name;
    private Color color;
    private Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
