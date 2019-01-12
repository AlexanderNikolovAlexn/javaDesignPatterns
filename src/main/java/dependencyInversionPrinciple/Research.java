package dependencyInversionPrinciple;

import org.javatuples.Triplet;

import java.util.List;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
// high level class - exposed to end user(has the business logic)
public class Research {

    // Old implementation - highly depends on Low level implementation
//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//        relations.stream()
//                .filter(x -> x.getValue0().getName().equals("John")
//                        && x.getValue1() == Relationship.PARENT)
//                .forEach(ch -> System.out.println("John has a child called " + ch.getValue2().getName()));
//    }

    // New implementation - depends on abstraction, so low-level implementation can be changed any time and we don`t care
    public Research(RelationshipBrowser browser)
    {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
            System.out.println("John has a child called " + child.getName());
    }

}
