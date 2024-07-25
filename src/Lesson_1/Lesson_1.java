package Lesson_1;

import java.util.Arrays;

public class Lesson_1 {
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 120;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void invertBinaryArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void processArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void createDiagonalArray() {
        int size = 5;
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            arr[i][size - 1 - i] = 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] initializeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(5,10));
        printPositiveOrNegative(-2);
        System.out.println(isNegative(5));
        printString("Хорошего вам дня, Евгений! :)", 3);
        System.out.println(isLeapYear(2000));
        invertBinaryArray();
        fillArray();
        processArray();
        createDiagonalArray();
        System.out.println(Arrays.toString(initializeArray(10, 5)));
    }
}