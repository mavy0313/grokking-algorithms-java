package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class QuickSortStreams {
    public List<Integer> evaluate(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);

            List<Integer> listCopy = new ArrayList<>(list);
            listCopy.remove(pivot);
            List<Integer> less = listCopy.stream()
                    .filter(e -> e <= pivot)
                    .collect(toList());
            List<Integer> greater = listCopy.stream()
                    .filter(e -> e > pivot)
                    .collect(toList());

            List<Integer> result = new ArrayList<>(evaluate(less));
            result.add(pivot);
            result.addAll(evaluate(greater));
            return result;
        }
    }
}
