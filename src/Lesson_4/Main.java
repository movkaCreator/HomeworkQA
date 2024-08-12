package Lesson_4;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] incorrectValueArray = {
                {"1", "2", "3", "X"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        processArray(correctArray);
        processArray(incorrectValueArray);
        processArray(wrongSizeArray);
    }

    public static void processArray(String[][] array) {
        try {
            int result = sumArrayElements(array);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Неверный размер массива. Ожидается массив 4x4.");
        }
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("Неверный размер массива. Ожидается массив 4x4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке: [" + i + "][" + j + "], значение: " + arr[i][j]);
                }
            }
        }
        return sum;
    }
}