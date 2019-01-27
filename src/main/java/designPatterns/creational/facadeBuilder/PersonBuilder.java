package designPatterns.creational.facadeBuilder;

/**
 * Created by Alexander Nikolov on 27.1.2019 г..
 */
public class PersonBuilder {

    // the object we're going to build
    protected Person person = new Person(); // reference!

    public PersonJobBuilder works()
    {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives()
    {
        return new PersonAddressBuilder(person);
    }

    public Person build()
    {
        return person;
    }

}
