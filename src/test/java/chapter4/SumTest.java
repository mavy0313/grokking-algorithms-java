package chapter4;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void sumForOneElement() {
        //given
        Sum sum = new Sum();

        //when
        int result = sum.evaluate(singletonList(1));

        //then
        assertEquals(1, result);
    }

    @Test
    public void sumForNoElements() {
        //given
        Sum sum = new Sum();

        //when
        int result = sum.evaluate(emptyList());

        //then
        assertEquals(0, result);
    }

    @Test
    public void sumForManyElements() {
        //given
        Sum sum = new Sum();

        //when
        int result = sum.evaluate(Arrays.asList(1, 2, 3, 4));

        //then
        assertEquals(10, result);
    }
}
