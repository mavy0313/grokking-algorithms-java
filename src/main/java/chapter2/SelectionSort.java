package chapter2;

import java.util.*;

public class SelectionSort {
    public List<Integer> sort(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        List<Integer> sortedList = new ArrayList<>();
        while (copyList.iterator().hasNext()) {
            int smallestIndex = findSmallestIndex(copyList);
            sortedList.add(copyList.get(smallestIndex));
            copyList.remove(smallestIndex);
        }
        return sortedList;
    }

    private int findSmallestIndex(List<Integer> list) {
        int smallestIndex = 0;
        int smallest = list.get(smallestIndex);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallestIndex = i;
                smallest = list.get(i);
            }
        }
        return smallestIndex;
    }
}
