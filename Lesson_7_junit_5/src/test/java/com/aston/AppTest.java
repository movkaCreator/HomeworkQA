package com.aston;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AppTest {
    @DisplayName("Тестирование положительных чисел")
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720"
    })
    public void testFactorial(int input, int expected) {
        assertEquals(expected, App.factorial(input));
    }

    @DisplayName("Тестирование нуля")
    @Test
    void testZero() {
        assertEquals(1, App.factorial(0));
    }

    @DisplayName("Проверка выброса исключения для отрицательного числа")
    @Test
    public void testFactorialWithNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-1));
    }
}