package chapter1;

import java.util.List;

public class BinarySearch {
    public int search(List<Integer> numbers, int numberToFind) {
        int low = 0;
        int high = numbers.size() - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (numberToFind == numbers.get(mid)) {
                return mid;
            }
            if (numberToFind < numbers.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
