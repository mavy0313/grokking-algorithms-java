package chapter1;

import chapter1.BinarySearch;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        //given
        BinarySearch binarySearch = new BinarySearch();

        //when
        int index = binarySearch.search(Arrays.asList(0, 1, 2), 2);

        //then
        assertEquals(2, index);
    }

    @Test
    public void binarySearch2() {
        //given
        BinarySearch binarySearch = new BinarySearch();

        //when
        int index = binarySearch.search(Arrays.asList(0, 1, 2), 0);

        //then
        assertEquals(0, index);
    }

    @Test
    public void binarySearch3() {
        //given
        BinarySearch binarySearch = new BinarySearch();

        //when
        int index = binarySearch.search(Arrays.asList(0, 1, 2, 3, 4, 5), 4);

        //then
        assertEquals(4, index);
    }

    @Test
    public void binarySearch4() {
        //given
        BinarySearch binarySearch = new BinarySearch();

        //when
        int index = binarySearch.search(Arrays.asList(0, 1, 2, 3, 4, 5), 7);

        //then
        assertEquals(-1, index);
    }
}
