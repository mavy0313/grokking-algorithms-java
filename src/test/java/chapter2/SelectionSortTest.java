package chapter2;

import org.junit.Test;
import java.util.List;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    @Test
    public void oneElement() {
        //given
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> array = singletonList(1);
        List<Integer> expectedArray = singletonList(1);

        //when
        List<Integer> result = selectionSort.sort(array);

        //then
        assertEquals(expectedArray, result);
    }

    @Test
    public void twoElements() {
        //given
        List<Integer> list = asList(2, 1);
        List<Integer> expectedList = asList(1, 2);
        SelectionSort selectionSort = new SelectionSort();

        //when
        List<Integer> result = selectionSort.sort(list);

        //then
        assertEquals(expectedList, result);
    }

    @Test
    public void manyElements() {
        //given
        List<Integer> list = asList(2, 1, 5, 7, 3, 6);
        List<Integer> expectedList = asList(1, 2, 3, 5, 6, 7);
        SelectionSort selectionSort = new SelectionSort();

        //when
        List<Integer> result = selectionSort.sort(list);

        //then
        assertEquals(expectedList, result);
    }
}
