package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    public void testSimpleSumWithoutCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(3, 4))
        );
        assertEquals(Arrays.asList(4, 6), result);
    }

    @Test
    public void testSumWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9)),
                new ArrayList<>(Arrays.asList(2))
        );
        assertEquals(Arrays.asList(1, 1), result);
    }

    @Test
    public void testDifferentSizes() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(Arrays.asList(9, 9))
        );
        assertEquals(Arrays.asList(1, 0, 0), result);
    }

    @Test
    public void testCarryAtEnd() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9)),
                new ArrayList<>(Arrays.asList(1))
        );
        assertEquals(Arrays.asList(1, 0, 0), result);
    }

    @Test
    public void testZeros() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(0)),
                new ArrayList<>(Arrays.asList(0))
        );
        assertEquals(Arrays.asList(0), result);
    }
}
