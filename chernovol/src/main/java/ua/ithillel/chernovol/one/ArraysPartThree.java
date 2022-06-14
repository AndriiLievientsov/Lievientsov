package ua.ithillel.chernovol.one;
/**
 * @author Chernovol Alexander
 */

public class ArraysPartThree {
    public static void main(String[] args) {
        System.out.println("1. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.");
        // 1.Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        fibonacciSequence(20);
        System.out.println("-------------------------------------------");


        // 2. Написать код, который заполнит массив произвольного размера числами по возрастанию,
        // начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5]
        System.out.println("2. Написать код, который заполнит массив произвольного размера числами по возрастанию,\n" +
                "начиная с центра массива, например, [5,4,3,2,1,0,1,2,3,4,5]");
        showArray(middleZero(11));
        System.out.println("-------------------------------------------");

        // 3.Найти в массиве число, которое повторяется наибольшее количество раз.
        System.out.println("3.Найти в массиве число, которое повторяется наибольшее количество раз.");
        int[] repeatValues = createIntArrWithRandomValues(12, 0, 10);
        showArray(repeatValues);
        mostRepeatValue(repeatValues);
        System.out.println("-------------------------------------------");

        // 4.Написать код для зеркального переворота элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).

        System.out.println("4.Написать код для зеркального переворота элементов в массиве " +
                "([1, 2, 3, 4] -> [4, 3, 2, 1]).");
        int[] turnOver = {1, 2, 3, 4};
        showArray(turnOver);
        turnOver = turnOverArray(turnOver);
        showArray(turnOver);
        System.out.println("-------------------------------------------");

        // 5.Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых
        // чисел из отрезка [10;99]. Вывести массив на экран.

        System.out.println("5.Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых\n" +
                " чисел из отрезка [10;99]. Вывести массив на экран.");
        int[][] matrixArray = createTwoDimensionalArray(8, 5, 10, 99);
        showArray(matrixArray);
        System.out.println("-------------------------------------------");


        // 6.Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
        // Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её
        // наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в
        // рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить только одну
        // перестановку, а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.
        System.out.println("""
                Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел
                из отрезка [0;9]. Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом
                месте в каждой строке стоял её наибольший элемент. При этом изменять состав массива нельзя,
                а можно только переставлять элементы в рамках одной строки. Порядок остальных элементов строки
                не важен (т.е. можно соврешить только однуперестановку, а можно отсортировать по убыванию каждую строку).
                Вывести преобразованный массив на экран.
                """);
        int[][] maxToHead = createTwoDimensionalArray(6, 7, 0, 9);
        showArray(maxToHead);
        System.out.println("-------------------------------------------");
        maxValueToFirstIndex(maxToHead);
        System.out.println("-------------------------------------------");

        // Дан массив с числами 5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4.
        // Переместить все нули в начало массива.
        // Дан массив с числами 5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4.
        // Переместить все нули в конец массива.
        System.out.println("""
                Дан массив с числами 5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4.
                Переместить все нули в начало массива.
                Переместить все нули в конец массива.
                """);
        int[] zeroToHead = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        showArray(zeroToHead);
        zeroToHead(zeroToHead);
        int[] zeroToTail = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        zeroToTail(zeroToTail);
        System.out.println("-------------------------------------------");

        // 9.Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
        // чтобы отрицательных и положительных элементов там было поровну и не было нулей.
        // При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве
        // постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы
        // постоянно чередуются через один и пр.). Вывести полученный массив на экран.

        System.out.println("""
                9.Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
                чтобы отрицательных и положительных элементов там было поровну и не было нулей.
                При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве
                постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы
                постоянно чередуются через один и пр.). Вывести полученный массив на экран.
                """);
        equalNegativePositive();
        System.out.println("-------------------------------------------");

    }

    //Метод для создание целочисленного массива заданого размена со случайными элементами в заданом диапазоне
    private static int[] createIntArrWithRandomValues(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((max + 1) - min) + min);
        }
        return array;
    }

    //Метод для вычесления чисел Фибоначи
    private static void fibonacciSequence(int value) {
        int[] array = new int[value];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ":" + array[i]);
        }
    }

    //Метод для заполнения массива по возрастания начиная от центра массива
    private static int[] middleZero(int value) {
        int[] returnArray = new int[value];
        int startValue = value / 2 * -1;
        for (int i = 0; i < returnArray.length; i++)
            returnArray[i] = startValue++;
        return returnArray;
    }

    //Метод для нахождения наиболее повторяемого значения в массиве
    private static void mostRepeatValue(int[] array) {
        int value = 0;
        int counterOne = 0;
        int counterTwo = 0;
        for (int k : array) {
            for (int i : array) {
                if (k == i) {
                    counterOne++;
                }
            }
            if (counterOne > counterTwo) {
                counterTwo = counterOne;
                value = k;
                counterOne = 0;
            } else
                counterOne = 0;
        }
        System.out.println("Чаще всего встречается: " + value + ": " + counterTwo + " раз(а)");
    }

    //Метод для переворота массива
    private static int[] turnOverArray(int[] array) {
        int[] returnArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < returnArray.length; i++, j--) {
            returnArray[i] = array[j];
        }
        return returnArray;
    }

    //Метод для создания двумерного массива
    private static int[][] createTwoDimensionalArray(int line, int column, int min, int max) {
        int[][] returnArray = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                returnArray[i][j] = (int) (Math.random() * ((max + 1) - min) + min);
            }
        }
        return returnArray;
    }

    //Метод перемещает наибольшее значение в начало массива (Двухмерный)
    private static void maxValueToFirstIndex(int[][] array) {
        int indexMaxValue = 0;
        int maxValue = 0;
        for (int i = 0, k = 0; i < array.length; i++) {
            maxValue = array[i][0];
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    indexMaxValue = j;
                }
            }
            k = array[i][0];
            array[i][0] = maxValue;
            array[i][indexMaxValue] = k;
        }
        showArray(array);
    }

    //Метод перемещает все 0 в начало массива
    private static void zeroToHead(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = 0, value = 0; j < array.length; j++) {
                    if (array[j] != 0) {
                        value = array[j];
                        array[j] = array[i];
                        array[i] = value;
                        break;
                    }
                }
            }
        }
        showArray(array);
    }

    //Метод перемещает все 0 в конец массива
    private static void zeroToTail(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                for (int j = array.length - 1, value = 0; j >= 0; j--) {
                    if (array[j] != 0) {
                        value = array[j];
                        array[j] = array[i];
                        array[i] = value;
                        break;
                    }
                }
            }
        }
        showArray(array);
    }

    //Метод заполняет массив из 12 элементов равным колличеством отрицательных и положительных случайных чисел
    private static void equalNegativePositive() {
        int[] array = new int[12];
        int negative = 0;
        int positive = 0;
        int value = 0;
        for (int i = 0; i < array.length; ) {
            value = (int) (Math.random() * ((10 + 1) - (-10)) + (-10));
            if (value > 0 && positive < 6) {
                positive++;
                array[i++] = value;
            } else if (value < 0 && negative < 6) {
                negative++;
                array[i++] = value;
            }
        }
        showArray(array);
    }

    //Метод вывода массива
    private static void showArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%-5s", array[i][j]);
            }
            System.out.println();
        }
    }

    //Метод вывода двумерного массива
    private static void showArray(int[] array) {
        for (int j : array) {
            System.out.printf("%-3s", j);
        }
        System.out.println();
    }
}

