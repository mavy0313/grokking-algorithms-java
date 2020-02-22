package chapter2;

import java.util.ArrayList;
import java.util.List;

public class SelectionSortWithSwap {
//    public int[] sort(int[] array) {
//        int out;
//        int in;
//        int min;
//        for (out = 0; out < array.length - 1; out++) {
//            min = array[out];
//            for (in = out + 1; in < array.length; in++) {
//                if (array[in] < min) {
//                    int temp = array[in];
//                    array[in] = array[out];
//                    array[out] = temp;
//                }
//            }
//        }
//        return array;
//    }

    public int[] sort(int[] array) {
        int out;
        int in;
        int min;
        for (out = 0; out < array.length - 1; out++) {
            min = out;
            for (in = out + 1; in < array.length; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            swap(array, out, min);
        }
        return array;
    }

    private void swap(int[] array, int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

//    private int findSmallestIndex(int list) {
//        int smallestIndex = 0;
//        int smallest = list.get(smallestIndex);
//
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < smallest) {
//                smallestIndex = i;
//                smallest = list.get(i);
//            }
//        }
//        return smallestIndex;
//    }
}
