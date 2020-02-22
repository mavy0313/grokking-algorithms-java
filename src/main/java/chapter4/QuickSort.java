package chapter4;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> evaluate(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);
            List<Integer> less = getLess(pivot, list);
            List<Integer> greater = getGreater(pivot, list);

            List<Integer> result = new ArrayList<>(evaluate(less));
            result.add(pivot);
            result.addAll(evaluate(greater));
            return result;
        }
    }

    private List<Integer> getLess(Integer pivot, List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);
        listCopy.remove(pivot);
        List<Integer> result = new ArrayList<>();
        for (Integer element : listCopy) {
            if (element <= pivot) {
                result.add(element);
            }
        }
        return result;
    }

    private List<Integer> getGreater(Integer pivot, List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);
        listCopy.remove(pivot);
        List<Integer> result = new ArrayList<>();
        for (Integer element : listCopy) {
            if (element > pivot) {
                result.add(element);
            }
        }
        return result;
    }
}
