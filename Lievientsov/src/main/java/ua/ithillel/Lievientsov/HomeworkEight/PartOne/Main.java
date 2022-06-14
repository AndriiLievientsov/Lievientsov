package ua.ithillel.Lievientsov.HomeworkEight.PartOne;
/*
1. Создать объект `map`. Тип ключа и значения выбрать самостоятельно.
2. Добавить в мапу `map` 10-ть любых пар `key=value`.
3. Вывести в консоль содержание мапы в виде `key = value`. Новая пара ключа и значения на каждой строке.
(Попробовть все возможные варианты)
4. Вывести в консоль размер объекта `map`.
5. Создать объект `map2` согласно SOLID принципам. Тип ключа и значения должны быть как у объекта `map`.
6. Добавить все значения из `map` в `map2`.
7. Вывести в консоль размер объекта `map2`.
8. Удалить все значения из объекта `map2`.
9. Вывести в консоль пуст ли объект `map2`.
10. Вывести в консоль существует ли в `map` ключ. Какой - выбор за Вам.
11. Вывести в консоль существует ли в `map` значение. Какое - выбор за Вам.
12. Вывести в консоль существует ли в `map2` ключ. Какой - выбор за Вам.
13. Вывести в консоль существует ли в `map2` значение. Какое - выбор за Вам.
14. Получить значение из `map` по ключу.  (Нужно получить заведомо существующее значение по ключу).
15. Получить значение из `map` по ключу.  (Нужно получить заведомо не существующее значение по ключу).
*/

import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        //Создал и заполнил мапу
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Canada");
        myMap.put(2, "Albania");
        myMap.put(3, "Barbados");
        myMap.put(4, "Benin");
        myMap.put(5, "Cuba");
        myMap.put(6, "China");
        myMap.put(7, "Finland");
        myMap.put(8, "Haiti");
        myMap.put(9, "Kenya");
        myMap.put(10, "Japan");
        //Примеры вариантов вывода ключ+значение
        System.out.println("Print HashMap examples: ");
        System.out.println("=========1============");
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("=========2============");
        for (Integer name : myMap.keySet()) {
            String key = name.toString();
            String value = myMap.get(name);
            System.out.println(key + " - " + value);
        }
        System.out.println("=========3============");
        myMap.forEach((key, value) -> System.out.println(key + " - " + value));
        System.out.println("=========4============");
        for (Integer key : myMap.keySet()) {
            System.out.println(key + " = " + myMap.get(key));
        }
        System.out.println("=========5============");
        myMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });
        System.out.println("=========6============");
        BiConsumer<Integer, String> biconsumer = (key, val) ->
                System.out.println(key + " = " + val);
        myMap.forEach(biconsumer);
        //Узнал размер мапы
        System.out.println("=====================");
        System.out.println("The size of Map is " + myMap.size() + " elements");
        //Скопировал содержимое из myMap в новосозданную myMap2 и вывел мап 2
        System.out.println("=====================");
        HashMap<Integer, String> myMap2 = new HashMap<>(myMap);
        System.out.println(myMap2);
        //Узнал размер мапы 2
        System.out.println("The size of Map-2 is " + myMap2.size() + " elements");
        //Проверка есть ли ключ в myMap
        System.out.println("=====================");
        System.out.println("Is the key '5' present? " + myMap.containsKey(5));
        System.out.println("Is the key '20' present? " + myMap.containsKey(20));
        //Проверка есть ли значение в myMap
        System.out.println("=====================");
        System.out.println("Is the values \"Japan\" present in myMap ? - " + myMap.containsValue("Japan"));
        System.out.println("Is the values \"London\" present in myMap ? - " + myMap.containsValue("London"));
        //Проверка есть ли ключ в myMap2
        System.out.println("=====================");
        System.out.println("Is the key '1' present? " + myMap2.containsKey(1));
        System.out.println("Is the key '44' present? " + myMap2.containsKey(44));
        //Проверка есть ли значение в myMap2
        System.out.println("=====================");
        System.out.println("Is the values \"Paris\" present in myMap2 ? - " + myMap2.containsValue("Paris"));
        System.out.println("Is the values \"Barbados\" present in myMap2 ? - " + myMap2.containsValue("Barbados"));
        //Получение существующего значение по ключу
        System.out.println("=====================");
        System.out.println("Existing value - " + myMap.get(2));
        //Получение заведомо не существующее значение по ключу
        System.out.println("=====================");
        System.out.println("A value that does not exist - " + myMap.get(40));
        //Удалил все содержимое из myMap2 и проверил
        System.out.println("=====================");
        myMap2.clear();
        System.out.println("Map after removing all the elements - " + myMap2);

    }
}
