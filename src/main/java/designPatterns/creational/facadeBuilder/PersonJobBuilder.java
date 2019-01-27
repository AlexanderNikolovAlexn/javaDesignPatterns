package designPatterns.creational.facadeBuilder;

/**
 * Created by Alexander Nikolov on 27.1.2019 г..
 */
public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person)
    {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName)
    {
        person.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder asA(String position)
    {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder earning(int annualIncome)
    {
        person.setAnnualIncome(annualIncome);
        return this;
    }

}
