package SOLID.openClosedPrinciple.filters;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public class AndFilter<T> implements Condition<T> {

    private Condition<T> first;
    private Condition<T> second;

    public AndFilter(Condition<T> first, Condition<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
