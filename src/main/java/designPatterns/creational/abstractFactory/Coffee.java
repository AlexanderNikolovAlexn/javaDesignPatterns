package designPatterns.creational.abstractFactory;

/**
 * Created by Alexander Nikolov on 9.2.2019 г..
 */
public class Coffee implements HotDrink {

    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }

}
