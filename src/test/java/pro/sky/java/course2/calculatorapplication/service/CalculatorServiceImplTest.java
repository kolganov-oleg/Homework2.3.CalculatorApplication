package pro.sky.java.course2.calculatorapplication.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculatorapplication.service.Constants.*;


class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        double result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);

    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        double result = calculatorService.plus(TWO, ONE);
        assertEquals(TWO + ONE, result);

    }

    @Test
    public void shouldReturnOneWhenMinusTwoAndOne() {
        double result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);

    }

    @Test
    public void shouldReturnZeroWhenMinusOneAndOne() {
        double result = calculatorService.minus(ONE, ONE);
        assertEquals(ONE - ONE, result);

    }

    @Test
    public void shouldReturnTwoWhenMultipleTwoAndOne() {
        double result = calculatorService.multiple(TWO, ONE);
        assertEquals(TWO * ONE, result);

    }

    @Test
    public void shouldReturnOneWhenMultipleOneAndOne() {
        double result = calculatorService.multiple(ONE, ONE);
        assertEquals(ONE * ONE, result);

    }

    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {
        double result = calculatorService.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);

    }

    @Test
    public void shouldReturnOneWhenDivideOneAndOne() {
        double result = calculatorService.divide(ONE, ONE);
        assertEquals(ONE / ONE, result);
    }
    @Test
    public void shouldReturnOneWhenDivideOneAndZero() {
        double result = calculatorService.divide(ONE, ZERO);
        assertEquals(ONE / ZERO, result);
    }



}