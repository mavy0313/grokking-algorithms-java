package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class QuickSortPredicates {
    public List<Integer> evaluate(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);

            List<Integer> less = getLessOrGreater(pivot, list, (e, p) -> e <= p);
            List<Integer> greater = getLessOrGreater(pivot, list, (e, p) -> e > p);

            List<Integer> result = new ArrayList<>(evaluate(less));
            result.add(pivot);
            result.addAll(evaluate(greater));
            return result;
        }
    }

    private List<Integer> getLessOrGreater(
            Integer pivot,
            List<Integer> list,
            BiPredicate<Integer, Integer> predicate) {
        List<Integer> listCopy = new ArrayList<>(list);
        listCopy.remove(pivot);
        List<Integer> result = new ArrayList<>();
        for (Integer element : listCopy) {
            if (predicate.test(element, pivot)) {
                result.add(element);
            }
        }
        return result;
    }
}
