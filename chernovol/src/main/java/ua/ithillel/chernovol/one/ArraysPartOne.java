package ua.ithillel.chernovol.one;
import java.util.Arrays;

/**
 * @author Chernovol Alexander
 */
public class ArraysPartOne {
    public static void main(String[] args) {
        // 1. Создайте массив интов без указания значений элементов при создании объекта.
        int[] arrayOne = new int[6];

        // 2. Создайте массив интов с указанием значений элементов при создании объекта.
        int[] arrayTwo = {1, 2, 3, 4, 5, 6};

        // 3. Создайте пустой массив интов. Заполните его любыми значениями.
        System.out.println("3. Создайте пустой массив интов. Заполните его любыми значениями.");
        int[] intArrayRandom = createIntArrWithRandomValues(12, -15, 15);
        System.out.println(Arrays.toString(intArrayRandom));
        System.out.println("---------------------------");

        // 4. Создайте пустой массив даблов. Заполните его любыми значениями и выведите в консоль содержимое.
        System.out.println("4. Создайте пустой массив даблов. Заполните его любыми значениями и " +
                "выведите в консоль содержимое.");
        double[] doubleArrayRandom = createDoubleArrWithRandomElement(5, -10, 10);
        System.out.println(Arrays.toString(doubleArrayRandom));
        System.out.println("---------------------------");

        // 5. Создайте пустой массив на 10 элементов. Заполните значения элементов. Расширьте массив на 5 элементов
        System.out.println("5. Создайте пустой массив на 10 элементов. Заполните значения элементов. " +
                "Расширьте массив на 5 элементов");
        intArrayRandom = addSizeToArr(intArrayRandom, 5);
        System.out.println(Arrays.toString(intArrayRandom));
        System.out.println("---------------------------");

        // 6. Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом
        // массиве максимальным и сообщите индекс его последнего вхождения в массив.
        System.out.println("""
                6. Создайте массив из 12 случайных целых чисел из отрезка [-15;15].\s
                Определите какой элемент является в этом массиве максимальным и сообщите\s
                индекс его последнего вхождения в массив.""");
        System.out.println(Arrays.toString(intArrayRandom));
        int indexOfMaxValue = findLastIndexOfMaxValue(intArrayRandom);
        System.out.println("Индекс последнего вхождения: " + indexOfMaxValue);
        System.out.println("---------------------------");

        // 7 .Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
        // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
        System.out.println("""
                7 .Создайте массив из 8 случайных целых чисел из отрезка [1;10].
                 Выведите массив на экран в строку Замените каждый элемент с нечётным индексом на ноль.
                 Снова выведете массив на экран на отдельной строке.""");
        int[] arrayWithZero = createIntArrWithRandomValues(8, 1, 10);
        showArrReplaceIndex(arrayWithZero);
        System.out.println("---------------------------");

        // 8. Создайте массив из 4 случайных целых чисел из отрезка [10;99]. Выведите его на экран в строку.
        // Далее определите и выведите на экран сообщение о том,
        // является ли массив строго возрастающей последовательностью.
        System.out.println("""
                8. Создайте массив из 4 случайных целых чисел из отрезка [10;99].
                 Выведите его на экран в строку. Далее определите и выведите на экран сообщение о том,
                 является ли массив строго возрастающей последовательностью\s""");
        int[] increaseArray = createIntArrWithRandomValues(4, 1, 99);
        System.out.println(increasingArray(increaseArray));
        System.out.println("---------------------------");

        // 9. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый.
        // Выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого
        // массива и сообщите, для какого из массивов это значение оказалось больше
        // (либо сообщите, что их средние арифметические равны).
        System.out.println("""
                9. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый.
                Выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого
                массива и сообщите, для какого из массивов это значение оказалось больше
                (либо сообщите, что их средние арифметические равны).
                """);
        int[] firstArray = createIntArrWithRandomValues(5, 0, 5);
        int[] secondArray = createIntArrWithRandomValues(5, 0, 5);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        averageEachArray(firstArray, secondArray);
        System.out.println("---------------------------");

        // 10. Создать массив из 50 случайных целых чисел из отрезка [0;1000] и вывести его на экран.
        // Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        System.out.println("""
                10. Создать массив из 50 случайных целых чисел из отрезка [0;1000] и вывести его на экран.
                Создать второй массив только из чётных элементов первого массива,
                если они там есть, и вывести его на экран.
                """);
        int[] randomArray = createIntArrWithRandomValues(50, 0, 1000);
        evenNumbersInArray(randomArray);
        System.out.println("---------------------------");

        // 11. Создайте массив a, заполните его. Создайте массив b, заполните его. Создайте массив c,
        // размер которого будет равен размер массива a + размер массива b. Заполнить массив c следующим образом:
        // взять элемент с массива a, следом элемент из массива b и т.д.
        System.out.println("""
                11. Создайте массив a, заполните его. Создайте массив b, заполните его. Создайте массив c,
                размер которого будет равен размер массива a + размер массива b. Заполнить массив c следующим образом:
                взять элемент с массива a, следом элемент из массива b и т.д.
                """);
        int[] arrayToUniteFirst = createIntArrWithRandomValues(5, 0, 10);
        int[] arrayToUniteSecond = createIntArrWithRandomValues(5, 0, 10);
        System.out.println(Arrays.toString(uniteTwoArrays(arrayToUniteFirst, arrayToUniteSecond)));
    }

    //Метод для создание целочисленного массива заданого размена со случайными элементами в заданом диапазоне
    private static int[] createIntArrWithRandomValues(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((max + 1) - min) + min);
        }
        return array;
    }

    //Метод для создание вещественного массива заданого размена со случайными элементами в заданом диапазоне
    private static double[] createDoubleArrWithRandomElement(int size, int min, int max) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * ((max + 1) - min) + min);
        }
        return array;
    }

    //Метод для увеличения массива на заданый размер
    private static int[] addSizeToArr(int[] array, int addSize) {
        int currentSize = array.length;
        int newSize = currentSize + addSize;
        int[] newArray = new int[newSize];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0;
            }
        }
        return newArray;
    }

    //Метод для поиска последнего индекса максимального  числа в массиве
    private static int findLastIndexOfMaxValue(int[] array) {
        int maxValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue <= array[i]) {
                index = i;
                maxValue = array[i];
            }
        }
        return index;
    }

    //Метод вывода массива в строку и замена значений на 0 при нечётном индексе и повторный вывод
    private static void showArrReplaceIndex(int[] array) {
        String normalArr = "";
        String replaceArr = "";
        for (int i = 0; i < array.length; i++) {
            normalArr += array[i] + " ";
            if (i % 2 == 0) {
                replaceArr += array[i] + " ";
            } else {
                replaceArr += 0 + " ";
            }
        }
        System.out.println(normalArr);
        System.out.println(replaceArr);
    }

    //Метод для проверки возрастающий массив или нет
    private static String increasingArray(int[] array) {
        System.out.println(Arrays.toString(array));
        int value = array[0];
        for (int j : array) {
            if (value > j)
                return "Массив не возрастающий";
            value = j;
        }
        return "Массив возрастающий";
    }

    //Метод для вычесления среднего арифметического числа каждого массива
    //и вывод у какого массива оно больше
    private static void averageEachArray(int[] first, int[] second) {
        if (first.length != second.length) {
            System.out.println("Длина массивов не равна!");
            return;
        }
        double averageFirst = 0;
        double averageSecond = 0;
        for (int i = 0; i < first.length; i++) {
            averageFirst += first[i];
            averageSecond += second[i];
        }
        averageFirst = averageFirst / first.length;
        averageSecond = averageSecond / second.length;
        if (averageFirst > averageSecond) {
            System.out.println("Среднее арифметическое первого массива больше: " + averageFirst);
        } else if (averageFirst < averageSecond) {
            System.out.println("Среднее арифметическое второго массива больше: " + averageSecond);
        } else {
            System.out.printf("Среднее арифметическое массивов равны: '%.1f' = %.1f \n", averageFirst, averageSecond);
        }
    }

    // Метод выводит новый массив состоящий из чётных чисел передаваемого массива
    private static void evenNumbersInArray(int[] array) {
        int size = 0;
        System.out.println(Arrays.toString(array));
        for (int j : array) {
            if (j % 2 == 0)
                size++;
        }
        int[] evenArray = new int[size];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evenArray));
    }

    //Метод для обьеденения двух массивов в один. Элементы добавляются поочерёдно
    private static int[] uniteTwoArrays(int[] first, int[] second) {
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        int[] uniteArray = new int[first.length + second.length];
        for (int i = 0, j = 0; i < first.length; i++) {
            uniteArray[j++] = first[i];
            uniteArray[j++] = second[i];
        }
        return uniteArray;
    }
}
