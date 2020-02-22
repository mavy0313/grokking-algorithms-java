package chapter4;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class MaximumTest {

    @Test
    public void maxForOneElement() {
        //given
        Maximum maximum = new Maximum();

        //when
        int result = maximum.evaluate(singletonList(1));

        //then
        assertEquals(1, result);
    }

    @Test
    public void maxForManyElements() {
        //given
        Maximum maximum = new Maximum();

        //when
        int result = maximum.evaluate(Arrays.asList(7, 2, 1, 3, 9));

        //then
        assertEquals(9, result);
    }
}
