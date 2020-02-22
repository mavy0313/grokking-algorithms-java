package chapter4;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.*;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class QuickSortTest {

    @Test
    public void sortLessThen2Elements() {
        //given
        QuickSort quickSort = new QuickSort();

        //when
        List<Integer> result = quickSort.evaluate(singletonList(1));

        //then
        assertEquals(singletonList(1), result);
    }

    @Test
    public void sortManyElements() {
        //given
//        QuickSort quickSort = new QuickSort();
//        QuickSortPredicates quickSort = new QuickSortPredicates();
        QuickSortStreams quickSort = new QuickSortStreams();

        //when
        List<Integer> result = quickSort.evaluate(asList(2, 1, 9, 5, 3));

        //then
        assertEquals(asList(1, 2, 3, 5, 9), result);
    }
}
