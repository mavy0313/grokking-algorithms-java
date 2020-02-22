package chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void factorialOf1ShouldReturn1() {
        //given
        Factorial factorial = new Factorial();

        //when
        int result = factorial.evaluate(1);

        //then
        assertEquals(1, result);
    }

    @Test
    public void factorialOf3ShouldReturn6() {
        //given
        Factorial factorial = new Factorial();

        //when
        int result = factorial.evaluate(3);

        //then
        assertEquals(6, result);
    }

    @Test
    public void factorialOf4ShouldReturn24() {
        //given
        Factorial factorial = new Factorial();

        //when
        int result = factorial.evaluate(4);

        //then
        assertEquals(24, result);
    }
}
