package openClosedPrinciple.filters;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public interface Condition<T> {

    boolean isSatisfied(T item);

}
