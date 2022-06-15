package ua.ithillel.Lievientsov.HomeworkEight.PartTwo;

import java.util.*;
import java.util.function.BiFunction;

/*
**Часть 2:**

2.1 Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
2.2 Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод,
* который выбирает из заполненного списка элемент наугад 100000 раз. Замерьте время, которое потрачено на это.
* Сравните результаты и предположите, почему они именно такие.
2.3 Напишите метод, который получает на вход коллекцию типа `К` (Generic) и возвращает `Map<K, Integer>`,
* где `K` — значение из массива, а `Integer` — количество вхождений в массив.
* То есть сигнатура метода выглядит так: `<K> Map<K, Integer> arrayToMap(K[] ks)`;
* */
public class ListTwo {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Dog3");
        list1.add("Dog1");
        list1.add("Dog5");
        list1.add("Dog5");
        list1.add("Dog1");
        list1.add("Dog110");
        list1.add("Dog7");
        list1.add("Dog110");
        list1.add("Dog5");
        list1.add("Dog3");
        System.out.println("List without duplicates: " +
                removeDuplicates(list1) +
                "\n=========================");
        String[] seasons = new String[8];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";
        seasons[4] = "Winter";
        seasons[5] = "Autumn";
        seasons[6] = "Summer";
        seasons[7] = "Autumn";
        Map<String, Integer> nameCounter = countValues(seasons);
        System.out.println("Number of occurrences in the array: " + nameCounter);
        System.out.println("=========================");
        compare2Lists();
    }

    //Метод убирает дубликат
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    //Метод, который добавляет 1000000 элементов в ArrayList и LinkedList
    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.print("Time to select items from ArrayList in milliseconds: ");
        System.out.print(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.print("\nTime to select items from the LinkedList in milliseconds: ");
        System.out.println(System.currentTimeMillis() - startTime);
    }

    //Метод вхождения в массив
    public static <K> Map<K, Integer> countValues(K[] ks) {
        Map<K, Integer> someMap = new HashMap<>();
        for (K k : ks) {
            someMap.compute(k, (k1, count) -> count == null ? 1 : count + 1);
        }
        return someMap;
    }

}
