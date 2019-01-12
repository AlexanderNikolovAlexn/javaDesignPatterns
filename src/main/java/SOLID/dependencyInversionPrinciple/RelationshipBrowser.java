package SOLID.dependencyInversionPrinciple;

import java.util.List;

/**
 * Created by Alexander Nikolov on 12.1.2019 г..
 */
public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);

}
