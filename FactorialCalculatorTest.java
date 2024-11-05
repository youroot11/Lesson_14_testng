package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialForPositiveNumber() {
        Assert.assertEquals(calculator.factorial(5), 120);
    }

    @Test
    public void testFactorialForZero() {
        Assert.assertEquals(calculator.factorial(0), 1);
    }

    @Test
    public void testFactorialForNegativeNumber() {
        try {
            calculator.factorial(-1);
            Assert.fail("Невозможно для отрицательных чисел");
        } catch (IllegalArgumentException e) {
        }
    }
}
