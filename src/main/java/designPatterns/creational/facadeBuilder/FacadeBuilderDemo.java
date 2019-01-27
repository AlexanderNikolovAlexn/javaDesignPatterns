package designPatterns.creational.facadeBuilder;

/**
 * Created by Alexander Nikolov on 27.1.2019 г..
 */
public class FacadeBuilderDemo {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .lives()
                .at("123 London Road")
                .in("London")
                .withPostcode("SW12BC")
                .works()
                .at("Fabrikam")
                .asA("Engineer")
                .earning(123000)
                .build();

        Person person2 = new PersonBuilder()
                .lives()
                .at("Tzarigradsko Road 123")
                .in("Sofia")
                .withPostcode("1680")
                .works()
                .at("Google")
                .asA("Software Engineer")
                .earning(77000)
                .build();

        // We have a problem with public setters in Person -> object can be changed
        System.out.println(person);
        System.out.println(person2);
    }

}
