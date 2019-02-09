package designPatterns.creational.factory;

/**
 * Created by Alexander Nikolov on 9.2.2019 г..
 */
public class factoryDemo {

    public static void main(String[] args) {
        Point pointFactoryMethod = Point.newCartesianPoint(3, 2);

        Point pointFactory = Point.Factory.newCartesianPoint(3, 2);
    }

}
