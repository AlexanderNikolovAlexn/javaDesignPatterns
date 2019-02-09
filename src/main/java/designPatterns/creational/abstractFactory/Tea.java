package designPatterns.creational.abstractFactory;

/**
 * Created by Alexander Nikolov on 9.2.2019 г..
 */
public class Tea implements HotDrink {

    @Override
    public void consume() {
        System.out.println("This tea is nice but I'd prefer it with milk.");
    }
}
