package ua.ithillel.Lievientsov.HomeworkTen;

import ua.ithillel.Lievientsov.HomeworkSix.PartThree.Rectangle;
import ua.ithillel.Lievientsov.HomeworkSix.PartTwo.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClassDetailsResolver {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Box> boxClass = Box.class;
        Class<BoxDescription> secondBox = BoxDescription.class;
        System.out.println("======= Class Details=======");
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
        if (Modifier.isPublic (mods)){
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)){
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)){
            System.out.println("final");
        }
        System.out.println();
        //Показать внутрений класс
        System.out.println("Inner class:");
        Arrays.stream(boxClass.getDeclaredClasses()).forEach(System.out::println);
        System.out.println();
        //Показать имя родителя
        System.out.println("Show parents:");
        Class<?> childClass = secondBox.getSuperclass();
        System.out.println(childClass + "\n");
        //Показать интерфейс
        System.out.println("Show interface:");
        Class<?>[] interfaces = boxClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces) + "\n");
        //Показать антонации


    }


 }


