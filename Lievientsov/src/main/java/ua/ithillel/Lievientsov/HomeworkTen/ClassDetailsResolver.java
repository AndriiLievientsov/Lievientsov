package ua.ithillel.Lievientsov.HomeworkTen;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

/*
* Создать класс `ClassDetailsResolver`.
В этом классе создать метод `resolve`, который принимает один аргумент типа `Class`и возвращает `String`.
Этот метод должен собрать всю информацию о классе:
-  Список полей
-  Список конструкторов
-  Список методов (будет плюсом если вывести список в отсортированном виде: `static`, `public`, `package-private`,
* `protected` и `private`)
-  Вывести информацию об особенностях класса: `static` ли, `abstract` ли, `final` ли, `interface` ли.
-  Есть ли внутри класса внутренние/вложенные классы.
-  Показать родителей, если таковы имеются. (всю цепочку)
-  Показать какие интерфейсы имплементирует класс.
-  Показать какие аннотации есть у класса.
* */
public class ClassDetailsResolver {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Box> boxClass = Box.class;
        Class<BoxDescription> secondBox = BoxDescription.class;
        System.out.println(resolve(boxClass, secondBox));
    }

    public static String resolve(Class boxClass, Class secondBox) {
        StringBuilder boxInfo = new StringBuilder();
        System.out.println("======= Class Details=======");
        //получаю пакет
        System.out.println("Package:\n" + boxClass.getPackage() + "\n");
        System.out.println("Class:\n" + boxClass + "\n" + "\n" + "Fields:");
        //получаю перечень полей
        Field[] declaredFields = boxClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        System.out.println();
        //получаю методы
        System.out.println("Methods:");
        Method[] methods = boxClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println();
        //получаю конструктора
        System.out.println("Constructors:");
        Constructor[] constructor = boxClass.getConstructors();
        for (Constructor ctr : constructor) {
            System.out.println(ctr);
        }
        System.out.println();
        //Вывести информацию об особенностях класса
        System.out.println("Class features:");
        int mods = boxClass.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
        System.out.println();
        //Показать внутрений класс
        System.out.println("Inner class:");
        Arrays.stream(boxClass.getDeclaredClasses()).forEach(System.out::println);
        System.out.println();
        //Показать имя родителя.
        System.out.println("Show parents:");
        Class<?> childClass = secondBox.getSuperclass();
        System.out.println(childClass + "\n");
        //Показать интерфейс
        System.out.println("Show interface:");
        Class<?>[] interfaces = boxClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces) + "\n");
        //Показать антонации
        System.out.println("Show Annotation:");
        for (var contAnnotation : constructor) {
            Annotation[] annotations = contAnnotation.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("Constructor have annotation: " + annotation);
            }
        }
        return boxInfo.toString();
    }
}
