package chapter2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortWithSwapTest {

    @Test
    public void manyElements() {
        //given
        int[] array = {2, 1, 5, 9, 7};
        int[] expectedArray = {1, 2, 5, 7, 9};
        SelectionSortWithSwap selectionSort = new SelectionSortWithSwap();

        //when
        int[] result = selectionSort.sort(array);

        //then
        assertArrayEquals(expectedArray, result);
    }
}