package ua.ithillel.Lievientsov.HomeworkSeven.PartOne;
/*### Часть 1
- Создайте до 10 исключительных ситуаций и обработайте их.
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsExamples {
    public static void main(String[] args) {
        //1
        try {
            int array[] = new int[10];
            int a = array[11];
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Exception 1");
            System.out.println("Exception: " + a + "\n" + "=============");
        }
        //2
        try {
            int b = Integer.parseInt("test");
        } catch (NumberFormatException b) {
            System.out.println("Exception 2");
            System.out.println("Exception: " + b + "\n" + "=============");
        }
        //3
        try {
            int c = 5 / 0;
        } catch (ArithmeticException c) {
            System.out.println("Exception 3");
            System.out.println("Exception: " + c + "\n" + "=============");
        }
        //4
        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (NullPointerException d) {
            System.out.println("Exception 4");
            System.out.println("Exception: " + d + "\n" + "=============");
        }
        //5
        try {
            String a = "Test";
            char c = a.charAt(28);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException f) {
            System.out.println("Exception 5");
            System.out.println("Exception: " + f + "\n" + "=============");
        }
        //6
        try {
            File file = new File("C://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException g) {
            System.out.println("Exception 6");
            System.out.println("Exception: " + g + "\n" + "=============");
        }
        //7
        String ClassToLoad = "main.java.Utils";
        try {
            Class loadedClass = Class.forName(ClassToLoad);
            System.out.println("Class " + loadedClass + " found!");
        } catch (ClassNotFoundException h) {
            System.out.println("Exception 7");
            System.out.println("Exception: " + h + "\n" + "=============");
        }
        //8
        try {
            Object[] array = new Integer[5];
            array[4] = new String("3");
        } catch (ArrayStoreException i) {
            System.out.println("Exception 8");
            System.out.println("Exception: " + i + "\n" + "=============");
        }

    }
}
