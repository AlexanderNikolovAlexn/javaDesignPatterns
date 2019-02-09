package designPatterns.creational.abstractFactory;

/**
 * Created by Alexander Nikolov on 9.2.2019 г..
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink tea = machine.makeDrink(HotDrinkMachine.AvailableDrink.TEA, 200);
        tea.consume();

        // interactive
        HotDrink drink = machine.makeDrink();
        drink.consume();
    }

}
