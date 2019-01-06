package openClosedPrinciple.filters;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Alexander Nikolov on 6.1.2019 г..
 */
public interface Filter<T> {

    Stream<T> filter(List<T> items, Condition<T> condition);

}
