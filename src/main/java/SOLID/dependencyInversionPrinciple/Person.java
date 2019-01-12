package SOLID.dependencyInversionPrinciple;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
public class Person {

    private String name;
    // add some properties maybe -> birthDate, country, town, etc.

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
