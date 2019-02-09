package designPatterns.creational.abstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import org.javatuples.Pair;
import org.reflections.Reflections;

/**
 * Created by Alexander Nikolov on 9.2.2019 г..
 */
public class HotDrinkMachine {

    public enum AvailableDrink
    {
        COFFEE, TEA
    }

    private Dictionary<AvailableDrink, HotDrinkFactory> factories =
            new Hashtable<>();

    private List<Pair<String, HotDrinkFactory>> namedFactories =
            new ArrayList<>();

    public HotDrinkMachine() throws Exception
    {
        // option 1: use an enum
        for (AvailableDrink drink : AvailableDrink.values())
        {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("designPatterns.creational.abstractFactory." + factoryName + "Factory");
            factories.put(drink, (HotDrinkFactory) factory.getDeclaredConstructor().newInstance());
        }

        // option 2: find all implementors of IHotDrinkFactory
        Set<Class<? extends HotDrinkFactory>> types =
                new Reflections("designPatterns.creational.abstractFactory") // ""
                        .getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type : types)
        {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws IOException
    {
        System.out.println("Available drinks");
        for (int index = 0; index < namedFactories.size(); ++index)
        {
            Pair<String, HotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getValue0());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size())
            {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null
                        && (amount = Integer.parseInt(s)) > 0)
                {
                    return namedFactories.get(i).getValue1().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }

    public HotDrink makeDrink(AvailableDrink drink, int amount)
    {
        return factories.get(drink).prepare(amount);
    }

}
