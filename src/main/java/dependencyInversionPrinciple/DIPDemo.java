package dependencyInversionPrinciple;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
public class DIPDemo {

    public static void main(String[] args) {

        Person parent = new Person("John");
        Person child1 = new Person("Danny");
        Person child2 = new Person("Samantha");

        Relationships relations = new Relationships();
        relations.addParentAndChild(parent, child1);
        relations.addParentAndChild(parent, child2);

        new Research(relations);


    }

}
