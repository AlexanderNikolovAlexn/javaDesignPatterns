package designPatterns.creational.abstractFactory;

/**
 * Created by Alexander Nikolov on 9.2.2019 г..
 */
public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour "
                        + amount + "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}
