package Test;



import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/*
Создать класс `ClassDetailsResolver`.

В этом классе создать метод `resolve`, который принимает один аргумент типа `Class`и возвращает `String`.

Этот метод должен собрать всю информацию о классе:
-  Список полей
-  Список конструкторов
-  Список методов (будет плюсом если вывести список в отсортированном виде: `static`, `public`, `package-private`,
 `protected` и `private`)
-  Вывести информацию об особенностях класса: `static` ли, `abstract` ли, `final` ли, `interface` ли.
-  Есть ли внутри класса внутренние/вложенные классы.
-  Показать родителей, если таковы имеются. (всю цепочку)
-  Показать какие интерфейсы имплементирует класс.
-  Показать какие аннотации есть у класса.
 */
public class ClassDetailsResolver extends List1 implements SomeInterface {
    private String name;
    private int number;
    @MyAnotation
    protected String surName;
    short size;

    public double postCode;

    private ClassDetailsResolver(String name) {
        this.name = name;
    }

    @MyAnotation
    protected ClassDetailsResolver(String name, int number) {
        this.name = name;
        this.number = number;
    }

    ClassDetailsResolver(String name, int number, String surName, double postCode) {
        this.name = name;
        this.number = number;
        this.surName = surName;
        this.postCode = postCode;
    }

    public ClassDetailsResolver(String name, int number, String surName, short size, double postCode) {
        this.name = name;
        this.number = number;
        this.surName = surName;
        this.size = size;
        this.postCode = postCode;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    protected String getSurName() {
        return surName;
    }

    protected void setSurName(String surName) {
        this.surName = surName;
    }

    public short getSize() {
        return size;
    }

    public void setSize(short size) {
        this.size = size;
    }

    public double getPostCode() {
        return postCode;
    }

    public void setPostCode(double postCode) {
        this.postCode = postCode;
    }

    @Override
    public void run() {

    }

    @MyAnotation
    public class Class1 {
    }

    public static class Class2 {
    }
 
    public static void main(String[] args) {
        Class<?> someClass = ClassDetailsResolver.class;
        System.out.println(resolve(someClass));
    }

    public static String resolve(Class someClass) {
        StringBuilder sb = new StringBuilder();
        sb.append("======= Class Details =======\n");
        sb.append("Анализируем класс: " + someClass.getSimpleName() + " из пакета: " + someClass.getPackageName() +
                "\nон состоит:");
        sb.append("\n\tиз полей:\n");
        Field[] fields = someClass.getDeclaredFields();
        for (Field element : fields) {
            sb.append("\t" + element + "\n");
        }
        sb.append("\n\tиз public полей:\n");
        Field[] fieldsPublic = someClass.getFields();
        for (Field element : fieldsPublic) {
            sb.append("\t" + element + "\n");
        }
        sb.append("\n\tконструкторов:\n");
        Constructor[] constr = someClass.getDeclaredConstructors();
        for (Constructor element : constr) {
            sb.append("\t" + element + "\n");
        }
        sb.append("\n\tметодов:\n");
        List<?> list = workWithMethodsList(someClass);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append("\t" + iterator.next() + "\n");
        }
        sb.append("\n\tинформация об особенностях класса:\n");

        List<?> listfeatureClass = featureClass(someClass.getModifiers());
        Iterator iteratorfeatureClass = listfeatureClass.iterator();
        while (iteratorfeatureClass.hasNext()) {
            sb.append("\t" + iteratorfeatureClass.next() + "\n");
        }

        sb.append("\n\tесть ли внутри класса внутренние/вложенные классы:\n");
        for (Class element : someClass.getClasses()) {
            sb.append("\t" + element + "\n");
        }
        sb.append("\n\tродители, если таковы имеются (вся цепочка): \n");
        Class<?> superClasss = someClass.getSuperclass();
        while (superClasss != null) {
            sb.append("\t" + superClasss + "\n");
            superClasss = superClasss.getSuperclass();
        }

        sb.append("\n\tкакие интерфейсы имплементирует класс: \n");
        for (Class element : someClass.getInterfaces()) {
            sb.append("\t" + element + "\n");
        }

        sb.append("\n\tкакие аннотации есть в классе: \n");
        Method[] methods = someClass.getDeclaredMethods();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                sb.append("\tу поля: " + field.getName() + " есть анотация: " + annotation + "\n");
            }
        }
        for (Constructor constructor : constr) {
            Annotation[] annotations = constructor.getAnnotations();
            for (Annotation annotation : annotations) {
                sb.append("\tу конструктора: " + constructor.getName() + " есть анотация: " + annotation + "\n");
            }
        }
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                sb.append("\tу метода: " + method.getName() + " есть анотация: " + annotation + "\n");
            }
        }
        for (Class classes : someClass.getClasses()) {
            Annotation[] annotations = classes.getAnnotations();
            for (Annotation annotation : annotations) {
                sb.append("\tу класса: " + classes.getSimpleName() + " есть анотация: " + annotation + "\n");
            }
        }

        sb.append("\n\t" + lookForMyAnnotation(methods));

        return sb.toString();
    }

    @MyAnotation
    public static List<?> featureClass(int value) {
        List<String> list = new ArrayList<>();
        if (Modifier.isPrivate(value)) {
            list.add("private ");
        }
        if (Modifier.isProtected(value)) {
            list.add("protected ");
        }
        if (Modifier.isPublic(value)) {
            list.add("public ");
        }
        if (Modifier.isAbstract(value)) {
            list.add("abstract ");
        }
        if (Modifier.isInterface(value)) {
            list.add("interface ");
        }
        if (Modifier.isStatic(value)) {
            list.add("static ");
        }
        return list;
    }

    @Deprecated
    public static List<?> workWithMethodsList(Class<?> someClass) {
        List<String> listMethods = new ArrayList<>();
        Method[] methods = someClass.getDeclaredMethods();
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers())) {
                listMethods.add(method + "");
            }
            if (Modifier.isProtected(method.getModifiers())) {
                listMethods.add(method + "");
            }
            if (Modifier.isPrivate(method.getModifiers())) {
                listMethods.add(method + "");
            }
            if (Modifier.isStatic(method.getModifiers())) {
                listMethods.add(method + "");
            }
        }
        Collections.sort(listMethods);
        return listMethods;
    }

    public static String lookForMyAnnotation(Method[] methods) {
        String resaultText = null;
        for (Method method : methods) {
            if (method.getAnnotation(MyAnotation.class) != null) {
                resaultText = "it`s alive!";
            } else {
                resaultText = "nothing to say!";
            }
        }
        return resaultText;
    }
}