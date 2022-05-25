package ua.ithillel.chernovol.one;

import java.util.Arrays;

/**
 * @author Chernovol Alexander
 */
public class ArraysPartTwo {
    public static void main(String[] args) {
        // 1. Посчитать среднее арифметическое массива чисел.
        System.out.println("1. Посчитать среднее арифметическое массива чисел.");
        int[] firstArray = createIntArrWithRandomValue(6, 0, 10);
        int[] secondArray = createIntArrWithRandomValue(8, 0, 10);
        double average = averageValue(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.printf("Среднее арифметическое: %.1f \n", average);
        System.out.println("---------------------------");

        // 2.Найти максимальный и минимальный элементы массива.
        System.out.println("2. Найти максимальный и минимальный элементы массива.");
        int minValue = minValue(firstArray);
        int maxValue = maxValue(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("---------------------------");

        //3. Найти повторяющиеся элементы в массиве
        System.out.println("3. Найти повторяющиеся элементы в массиве");
        System.out.println(Arrays.toString(firstArray));
        int[] repeatArray = equalValues(firstArray);
        System.out.println("Повторяющиеся значения: " + Arrays.toString(repeatArray));
        System.out.println("---------------------------");

        // 4. Найти второе наибольшее значение в массиве
        // 5. Найти второе наименьшее значение в массиве.
        System.out.println("4. Найти второе наибольшее значение в массиве\n" +
                "5. Найти второе наименьшее значение в массиве.");
        int secondMinValue = secondMinValue(firstArray);
        int secondMaxValue = secondMaxValue(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Второе наименьшее число в массиве: " + secondMinValue);
        System.out.println("Второе наибольшее число в массиве: " + secondMaxValue);
        System.out.println("---------------------------");

        // 6. Найти повторяющиеся значения в двух массивах.
        // 7. Найти не повторяющиеся значения в двух массивах.
        System.out.println("6. Найти повторяющиеся значения в двух массивах.\n" +
                "7. Найти не повторяющиеся значения в двух массивах.");
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        repeatArray = equalValues(firstArray, secondArray);
        System.out.println("Повторяющиеся значения: " + Arrays.toString(repeatArray));
        repeatArray = notEqualValues(firstArray, secondArray);
        System.out.println("Не повторяющиеся значения: " + Arrays.toString(repeatArray));


    }

    //Метод для создание целочисленного массива заданого размена со случайными элементами в заданом диапазоне
    private static int[] createIntArrWithRandomValue(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((max + 1) - min) + min);
        }
        return array;
    }

    //Метод для нахождения среднего арифметического в массиве
    private static double averageValue(int[] array) {
        double average = 0;
        for (int j : array) {
            average += j;
        }
        return average / array.length;
    }

    // Метод поиска минимального значения в массиве
    private static int minValue(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (minValue > value)
                minValue = value;
        }
        return minValue;
    }

    // Метод поиска максимального значения в массиве
    private static int maxValue(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (maxValue < value)
                maxValue = value;
        }
        return maxValue;
    }

    // Метод для поиска дублирующихся элементов в массиве
    private static int[] equalValues(int[] array) {
        int[] arrEqualValues = new int[array.length];
        int indexEqualValues = 0;
        boolean equal = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j != i && array[i] == array[j]) {
                    for (int k = 0; k < indexEqualValues; k++) {
                        if (arrEqualValues[k] == array[j]) {
                            equal = true;
                            break;
                        }
                    }
                    if (!equal) {
                        arrEqualValues[indexEqualValues++] = array[i];
                    } else {
                        equal = false;
                    }
                }
            }
        }
        int[] returnArray = new int[indexEqualValues];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = arrEqualValues[i];
        }
        return returnArray;
    }

    // Метод для нахождения второго наибольшего числа в массиве
    private static int secondMaxValue(int[] array) {
        int maxValue = maxValue(array);
        int secondMaxValue = array[0];
        for (int value : array) {
            if (value > secondMaxValue && value != maxValue) {
                secondMaxValue = value;
            } else if (secondMaxValue == maxValue) {
                secondMaxValue = value;
            }
        }
        return secondMaxValue;
    }

    // Метод для нахождения второго наименьшего числа в массиве
    private static int secondMinValue(int[] array) {
        int minValue = minValue(array);
        int secondMinValue = array[0];
        for (int value : array) {
            if (secondMinValue > value && value != minValue) {
                secondMinValue = value;
            } else if (secondMinValue == minValue) {
                secondMinValue = value;
            }
        }
        return secondMinValue;
    }

    //Метод для нахождения одинаковых значения в двух массивах
    private static int[] equalValues(int[] first, int[] second) {
        int[] arrEqualValues = new int[first.length];
        int indexEqualValues = 0;
        boolean equal = false;
        for (int valueFirst : first) {
            for (int valueSecond : second) {
                if (valueFirst == valueSecond) {
                    for (int valueEqual : arrEqualValues) {
                        if (valueEqual == valueSecond) {
                            equal = true;
                            break;
                        }
                    }
                    if (!equal)
                        arrEqualValues[indexEqualValues++] = valueSecond;
                    else
                        equal = false;
                }
            }
        }
        int[] returnArray = new int[indexEqualValues];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = arrEqualValues[i];
        }
        return returnArray;
    }

    //Метод для нахождения не повторяющихся значений в двух массивах
    private static int[] notEqualValues(int[] first, int[] second) {
        int[] arrEqualValues = equalValues(first, second);
        int[] tempArray = new int[first.length + second.length];
        int newSize = 0;
        boolean equal = false;
        for (int value : first) {
            for (int i : arrEqualValues)
                if (value == i) {
                    equal = true;
                    break;
                }
            if (!equal)
                tempArray[newSize++] = value;
            else
                equal = false;
        }
        for (int value : second) {
            for (int i : arrEqualValues)
                if (value == i) {
                    equal = true;
                    break;
                }
            if (!equal)
                tempArray[newSize++] = value;
            else
                equal = false;
        }
        int[] returnArray = new int[newSize];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = tempArray[i];
        }
        return deleteEqualValues(returnArray);
    }

    //Метод для удаления повторяющихся значений в массиве (Создан  для корректного отображения информации)
    private static int[] deleteEqualValues(int[] array) {
        int[] tempArray = new int[array.length];
        int newSize = 0;
        boolean repeat = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    repeat = true;
                    break;
                } else if (array[i] == array[j]) {
                    repeat = false;
                    break;
                }
            }
            if (repeat)
                tempArray[newSize++] = array[i];
        }
        int[] returnArray = new int[newSize];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = tempArray[i];
        }
        return returnArray;
    }
}