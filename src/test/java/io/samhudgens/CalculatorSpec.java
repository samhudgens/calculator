package io.samhudgens;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by samhudgens on 4/27/16.
 */
public class CalculatorSpec {

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 4;
        int actualSum = calculator.sum(2,2);
        assertEquals("The expected value should be 2", expectedSum, actualSum);
    }

    @Test
    public void differenceTest(){
        Calculator calculator = new Calculator();
        int expectedDifference = 4;
        int actualDifference = calculator.difference(8,4);
        assertEquals("The expected value should be 4", expectedDifference, actualDifference);
    }

    @Test
    public void productTest() {
        Calculator calculator = new Calculator();
        int expectedProduct = 6;
        int actualProduct = calculator.product(2,3);
        assertEquals("The expected value should be 6", expectedProduct, actualProduct);
    }

    @Test
    public void quotientTest() {
        Calculator calculator = new Calculator();
        int expectedQuotient = 4;
        int actualQuotient = calculator.quotient(8,2);
        assertEquals("The expected value should be 4", expectedQuotient, actualQuotient);
    }

}
