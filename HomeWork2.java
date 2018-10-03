import java.util.Arrays;

/**
 * Java1 Homework2
 * Alexey Gastev
 * 03/10/2018
 * только 4 из 8 сделано
 */

public class HomeWork2 {
    public static void main(String[] args) {
        int[] result1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(result1);
        System.out.println("result invertArray: " + Arrays.toString(result1));
        int[] result2 = new int[8];
        fillArray(result2);
        System.out.println("result fillArray: " + Arrays.toString(result2));
        int[] result3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(result3);
        System.out.println("result changeArray: " + Arrays.toString(result3));
        int[] result4 = {5, 3, 4, 6, 2, 2};
        searchMin(result4);
        searchMax(result4);
        // 5-ю задачу не удалось сделать, выдает ошибки.
        // int[][] result5 = new  int[4][4];
        // fillDiagonal(result5);
    }
    // 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод,
    // заменяющий в принятом массиве 0 на 1, 1 на 0;

    public static void invertArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    // 2 Задать пустой целочисленный массив размером 8. Написать метод,
    // который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22

    public static void fillArray(int[] arr) {
        int helper = 1;
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            helper = helper + 3;
            arr[i] = helper;
        }
    }

    // 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
    // принимающий на вход массив и умножающий числа меньше 6 на 2

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    // 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента

    public static void searchMin(int[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        System.out.println("result searchMin: " + arr[indexMin]);
    }
    public static void searchMax(int[] arr) {
        int max = arr[0];
        int indexMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println("result searchMax: " + arr[indexMax]);
    }

    // 5 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // заполнить его диагональные элементы единицами, используя цикл(ы)
    // не работает

    /* public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; i++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
    */
}
