package ua.ithillel.Lievientsov.HomeworkEight.PartTwo;

import java.util.*;

/*
* **Часть 1:**

1.1 Создать объект `list` коллекции строк.
1.2 Добавить в коллекцию `list` любую строку.
1.3 Добавить в коллекцию `list` еще одну произвольную строку.
1.4 Создать еще один объект `list1` коллекции строк.
1.5 Добавить 10 произвольных строк в коллекцию `list1`.
1.6 Добавить все элементы из коллекции `list1` в коллекцию `list`. Сделать все возможные варианты.
1.7 Заменить строку с индексом `3` в коллекции `list` на строку `qwerty`.
1.8 Проверить находится ли строка `qwerty` в коллекции `list`.
1.9 Отсортировать коллекцию `list` в алфавитном порядке.
1.10 Вывести содержимое коллекции в консоль.
1.11 Удалить элементы в которых находиться буква `a`.
1.12 Создать объект коллекции чисел `list2`.
1.13 Наполнить коллекцию `list2` случайными числами.
1.14 Отсортировать числа в порядке возрастания коллекции `list2`.
1.15 Отсортировать числа в порядке убывания коллекции `list2`.
1.15 Убрать дубликаты цифр коллекции `list2`.
*/
public class ListOne {
    public static void main(String[] args) {
        //Создал лист
        ArrayList<String> list = new ArrayList<>();
        //Добавил в лист строку
        list.add("element one to ArrayList!");
        //Добавил еще строку в лист
        list.add("element two to ArrayList!");
        //Создал второй лист
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("apricot");
        list1.add("peach");
        list1.add("melon");
        list1.add("coconut ");
        list1.add("persimmon");
        list1.add("avocado");
        list1.add("watermelon");
        list1.add("lime");
        list1.add("nectarine");
        //Добаление элементов из list1  в list
        list.addAll(list1);
        //Заменил строку по индексу
        System.out.println("Print List: ");
        System.out.println("==========1===========");
        list.add(3, "qwerty");
        System.out.println("Contents of the line with index 3: " + list.get(3));
        //Проверка есть ли "qwerty" в list
        System.out.println("==========2===========");
        System.out.println("Does the list contain \"qwerty\"? - " + list.contains("qwerty"));
        //Сортировка по алфавиту
        System.out.println("""
                ==========3===========
                Alphabetically sorted collection:\s
                """);
        Collections.sort(list);
        //Вывести содержимое коллекции в консоль
        for (String s : list) {
            System.out.println(s);
        }
        //Удаление элементов в которых находиться буква `a`.
        System.out.println("==========4===========");
        list.removeIf(s -> s.contains("a"));
        System.out.println("Elements with the letter 'a' are removed from the list: \n");
        for (String s : list) {
            System.out.println(s);
        }
        //Создал третий лист
        System.out.println("==========5===========");
        ArrayList<Integer> list2 = new ArrayList<>();
        //Заполнил случайными числами
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(0, 9));
        }
        System.out.print("List: ");
        for (Integer s : list2) {
            System.out.print(s + " ");
        }
        //остортировал
        System.out.println("\n==========6===========");
        Collections.sort(list2);
        System.out.print("Sorted list: ");
        for (Integer s : list2) {
            System.out.print(s + " ");
        }
        //отсортировал в порядке убывания
        System.out.println("\n==========7===========");
        list2.sort(Collections.reverseOrder());
        System.out.print("Sorted 2 list: ");
        for (Integer s : list2) {
            System.out.print(s + " ");
        }
        //Удалил дубликаты в листе
        System.out.println("\n==========8===========");
        Collections.sort(list2);
        Set<Integer> listWithoutDuplicate = new LinkedHashSet<>(list2);
        System.out.println("List without duplicate: " + listWithoutDuplicate);


    }
}
