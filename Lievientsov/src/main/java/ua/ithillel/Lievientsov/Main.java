package ua.ithillel.Lievientsov;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {

//        2.1 Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);

        List<String> strings = new ArrayList<>();
        strings.add("John Rambo");
        strings.add("Arnie");
        strings.add("Norris");
        strings.add("John Rambo");

        List<Person> persons = new ArrayList<>();
        Person jack = new Person("Jack", 83);
        Person john = new Person("John", 38);
        persons.add(jack);
        persons.add(john);
        persons.add(jack);
        persons.add(john);

        System.out.println(duplicateRemove(list));
        System.out.println(duplicateRemove(strings));
        System.out.println(duplicateRemove(persons));


//        2.2 Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//        Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
//        Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();

        listsFiller(listArray);
        listsFiller(listLinked);

//        System.out.println("ArrayList handling time");
//        listsElementFinder(listArray, 100000);
//        System.out.println("LinkedList handling time");
//        listsElementFinder(listLinked, 100000);

//  на обработку ArrayList ушло 16 секунд, а LinkedList 187626 секунд. Потому что в ArrayList обращаемся напрямую к индексу,
//  а в LinkedList каждую итерацию  проходимся по всему списку пока не дойдем до искомого случайного номера.

//        2.3 Напишите метод, который получает на вход коллекцию типа `К` (Generic) и возвращает `Map<K, Integer>`,
//        где `K` — значение из массива, а `Integer` — количество вхождений в массив.
//        То есть сигнатура метода выглядит так: `<K> Map<K, Integer> arrayToMap(K[] ks)`;

        String [] names = {"John", "Ben", "Stan", "Jack", "Karl", "John", "Karl", "Stan","Karl"};

        Map<String, Integer> nameCounter = fromArrayToMap(names);

        System.out.println("TEST      " + nameCounter);


    }
    public static <T> Collection<T> duplicateRemove(Collection<T> list){
        Set<T> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public static void listsFiller(List <Integer> list){
        for (int i = 0; i <=1000000; i++){
            list.add((int)(Math.random()*1001));
        }
    }

    public static void listsElementFinder(List<Integer> list ,int frequency){
        int counter = 0;
        long start = currentTimeMillis();
        for(int i = 0; i <= frequency-1; i++){
            list.get((int)(Math.random()*list.size()));
            counter ++ ;
        }
        long end = currentTimeMillis();
        System.out.println(counter);
        System.out.println((end - start) + "seconds");
    }

    public static <K> Map <K, Integer> fromArrayToMap(K[] array){
        Map<K, Integer> map = new HashMap<>();

        for (int i = 0; i< array.length; i++){
            if(!map.containsKey(array[i])){
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i])+1);
            }
        }
        return map;
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return this.name + "/ " + this.age + "y.o.";
        }
    }

}
