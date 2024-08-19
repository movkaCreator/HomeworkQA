package com.aston;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest {

    @DataProvider(name = "positiveNumbers")
    public Object[][] dataProvider() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
    }

    @Test(dataProvider = "positiveNumbers", description = "Тестирование положительных чисел")
    public void testFactorial(int input, int expected) {
        Assert.assertEquals(App.factorial(input), expected);
    }

    @Test(description = "Тестирование нуля")
    public void testZero() {
        Assert.assertEquals(App.factorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            description = "Проверка выброса исключения для отрицательного числа")
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void testFactorialWithNegativeNumbers() {
        App.factorial(-1);
    }
}
