package ua.ithillel.Lievientsov.HomeworkNine;
/*
* **Для всех задач требуется создание файла(ов) в ОС. Расположение файла произвольное.**

1.  Создать файл. Записать туда целые числа. Удалить из него все четные числа.
2.  Создать файл. Записать туда произвольный текст. В файле содержится совокупность текстовых строк.
*  Изменить первую букву каждого слова на заглавную.
3.  Создать файл. Записать туда произвольный текст. Создать новый файл, каждая строка которого получается из
* соответствующей строки исходного файла перестановкой слов в обратном порядке.
4.  Создать два текстовых файла. Наполнить целыми числами. Создать файл из различных чисел, которые содержатся:
    -  в каждом исходном файле.
    -  только в одном из двух исходных файлов.
    -  только в первом исходном файле.

5.  Создать и заполнить файл случайными целыми значениями. Выполнить сортировку содержимого файла по возрастанию.
6.  Создать файл. Записать туда произвольный текст. Из текстового файла удалить все слова, содержащие от трех до пяти
* символов, но при этом из каждой строки должно быть удалено только четное количество таких слов.
7.  Текстовый файл содержит квадратную матрицу, которая записана по принципу: одна строка файла – одна строка матрицы.
*  Необходимо построить двухмерный массив и вывести на экран исходную матрицу и результат ее транспонирования.
8.  Текстовый файл содержит квадратную матрицу, которая записана по принципу: одна строка – один элемент матрицы.
* Необходимо определить размерность матрицы и построить двухмерный массив. Вывести на экран исходную матрицу и
* результат ее поворота на 90º по часовой стрелке.
9.  Создать файл. Записать туда произвольный текст. Написать код который будет считывать содержимое файла,
* считать количество символов в тексте и записывать результат в файл. Файл с результатом должен находиться
*  рядом с файлом откуда производилось чтение текста.
10.  Создать файл. Записать туда последовательность чисел. Например: 1 2 3 4 5 6 537.
* Написать код который считает содержимое файла и посчитает сумму всех цифр. Результат записать в файл.
11.  Создать файл через ОС. Наполнить его каким-то текстом. Написать код который считает содержимое файла и
* посчитает количество слов и знаков в тексте. Результат записать в файл в формате: буква - 4, слово - 10, . - 50.
12.  Через ОС создать файл. Наполнить его произвольным текстом. Написать код который будет считывать содержимое файла.
*  Затем, будет искать наиболее встречающееся слово в тексте. Результат записать в файл.
13.  Через ОС создать файл. Наполнить его произвольным текстом. Написать код который будет производить поиск фразы в
* файле и записывать результат в файл. Например: Искомая строка "какая-то строка" встречается в тексте 1 раз.

14.  Разработать класс "Калькулятор логарифмов" с возможностью сложения, вычитания, умножения, деления, возведения в
* степень и перехода к другому основанию. Программа должна выполнять ввод данных, проверку правильности введенных данных,
*  выдачу сообщений в случае ошибок. Протокол работы калькулятора записать в файл. Предусмотреть возможность просмотра
* файла из программы. (Не обязательно)
* */


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        //Вызываю методы
        methodDeletingNumber();
        methodInitialLetter();
        methodWordTransposition();
        methodForTwoFiles();
        methodAscendingSorting();
        methodRemovingLongWords();
        methodMatrixInFile();
        methodMatrixInFile90degrees();
        methodReadNumberCharacters();
        methodSumAllNumbers();
        methodCountingInFile();
        methodFrequentWordInFile();
        methodPhraseSearchInFile();
    }

    //Создаю методы под каждую задачу
    //1.  Создать файл. Записать туда целые числа. Удалить из него все четные числа.
    public static void methodDeletingNumber() throws IOException {
        File file01 = new File("..\\test01.txt");
        try (FileWriter fw = new FileWriter(file01)) {
            for (int i = 1; i <= 20; i++) {
                int number = (int) (Math.random() * 60);
                String string = number + " ";
                fw.write(string);
            }
        }
        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file01))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numberInString = line.split(" ");
                for (String s : numberInString) {
                    try {
                        list.add(Integer.parseInt(s));
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }

                }
            }
        }
        list = list.stream().filter(s -> (s % 2) != 0).collect(Collectors.toList());
        try (FileWriter fw = new FileWriter(file01)) {
            for (Integer s : list) {
                String string = s + " ";
                fw.write(string);
            }
        }
    }

    /* 2.  Создать файл. Записать туда произвольный текст. В файле содержится совокупность текстовых строк.
     *  Изменить первую букву каждого слова на заглавную.
     * */
    public static void methodInitialLetter() throws IOException {
        File file02 = new File("..\\test02.txt");
        try (FileWriter fw = new FileWriter(file02)) {
            fw.write("Java programming language was originally developed by Sun Microsystems which was\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "Java platform (Java 1.0 [J2SE]).\n" +
                    "Java platform (Java 1.0 [J2SE]).\n" +
                    "The latest release of the Java Standard Edition is Java SE 8. With the advancement of Java\n" +
                    "and its widespread popularity, multiple configurations were built to suit various types of\n" +
                    "platforms. For example: J2EE for Enterprise Applications, J2ME for Mobile Applications.\n" +
                    "The new J2 versions were renamed as Java SE, Jav");
        }
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file02))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        list = list.stream().map(s -> {
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();
            String[] arrayString = s.split(" ");
            for (String word : arrayString) {
                char[] array = word.toCharArray();
                for (int i = 0; i < array.length; i++) {
                    if (i == 0) {
                        b = new StringBuilder(String.valueOf(array[i]).toUpperCase(Locale.ROOT));
                    } else {
                        b.append(array[i]);
                    }
                }
                a.append(b).append(" ");
            }
            return a.toString().trim();
        }).collect(Collectors.toList());

        try (FileWriter fw = new FileWriter(file02, false);) {
            for (String s : list) {
                String string = s + "\n";
                fw.write(string);
            }
        }
    }

    /*3.  Создать файл. Записать туда произвольный текст. Создать новый файл, каждая строка которого получается из
    соответствующей строки исходного файла перестановкой слов в обратном порядке.*/
    public static void methodWordTransposition() throws IOException {
        File file03 = new File("..\\test03.txt");
        try (FileWriter fw = new FileWriter(file03)) {
            fw.write("Java programming language was originally developed by Sun Microsystems which was\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "Java platform (Java 1.0 [J2SE]).\n" +
                    "The latest release of the Java Standard Edition is Java SE 8. With the advancement of Java\n" +
                    "and its widespread popularity, multiple configurations were built to suit various types of\n" +
                    "platforms. For example: J2EE for Enterprise Applications, J2ME for Mobile Applications.\n" +
                    "The new J2 versions were renamed as Java SE, Jav");
        }
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file03))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        list = list.stream().map(s -> {
            StringBuilder a = new StringBuilder();
            String[] arrayStr = s.split(" ");
            for (int i = arrayStr.length - 1; i >= 0; i--) {
                a.append(arrayStr[i]).append(" ");
            }
            return a.toString().trim();
        }).collect(Collectors.toList());

        File file03New = new File("..\\test03New.txt");
        try (FileWriter fw = new FileWriter(file03New, false);) {
            for (String s : list) {
                String string = s + "\n";
                fw.write(string);
            }
        }
    }

    /* 4. Создать два текстовых файла. Наполнить целыми числами. Создать файл из различных чисел, которые содержатся:
    -  в каждом исходном файле.
    -  только в одном из двух исходных файлов.
    -  только в первом исходном файле.
    * */
    public static void methodForTwoFiles() throws IOException {
        File file04 = new File("..\\test04.txt");
        try (FileWriter fw = new FileWriter(file04, false);) {
            for (int i = 1; i <= 10; i++) {
                int number = (int) (Math.random() * 50);
                String string = number + " ";
                fw.write(string);
            }
        }
        File file05 = new File("..\\test05.txt");
        try (FileWriter fw = new FileWriter(file05, false);) {
            for (int i = 1; i <= 10; i++) {
                int number = (int) (Math.random() * 50);
                String string = number + " ";
                fw.write(string);
            }
        }
        List<Integer> listOne = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file04))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arrayString = line.split(" ");
                for (String s : arrayString) {
                    listOne.add(Integer.parseInt(s));
                }
            }
        }
        List<Integer> listTwo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file05))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arrayString = line.split(" ");
                for (String s : arrayString) {
                    listTwo.add(Integer.parseInt(s));
                }
            }
        }
        File file06 = new File("..\\test06.txt");
        try (FileWriter fw = new FileWriter(file06, false);) {
            fw.write("Numbers in each source file.\n");
            for (Integer s : listOne) {
                if (listTwo.contains(s)) {
                    fw.write(s.toString() + "  ");
                }
            }
            fw.write("\n\nNumbers in only one of the two source files.\n");
            for (Integer s : listOne) {
                if (!listTwo.contains(s)) {
                    fw.write(s.toString() + "  ");
                }
            }

            for (Integer s : listOne) {
                if (!listTwo.contains(s)) {
                    fw.write(s.toString() + "  ");
                }
            }
            fw.write("\n\nNumbers only in the first source file.\n");
            for (Integer s : listOne) {
                if (!listTwo.contains(s)) {
                    fw.write(s.toString() + "  ");
                }
            }
        }
    }

    /*
     * 5.  Создать и заполнить файл случайными целыми значениями. Выполнить сортировку содержимого файла по возрастанию.
     * */
    public static void methodAscendingSorting() throws IOException {
        File file07 = new File("..\\test07.txt");
        try (FileWriter fw = new FileWriter(file07, false);) {
            for (int i = 1; i <= 30; i++) {
                int number = (int) (Math.random() * 50);
                String string = number + " ";
                fw.write(string);
            }
        }
        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file07))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arrayString = line.split(" ");
                for (String s : arrayString) {
                    list.add(Integer.parseInt(s));
                }
            }
        }
        list = list.stream().sorted().collect(Collectors.toList());
        try (FileWriter fw = new FileWriter(file07, false);) {
            for (Integer s : list) {
                String string = s + " ";
                fw.write(string);
            }
        }
    }

    /*
     * 6.  Создать файл. Записать туда произвольный текст. Из текстового файла удалить все слова, содержащие
     * от трех до пяти символов, но при этом из каждой строки должно быть удалено только четное количество таких слов.
     * */
    public static void methodRemovingLongWords() throws IOException {
        File file08 = new File("..\\test08.txt");
        try (FileWriter fw = new FileWriter(file08)) {
            fw.write("Java programming language was originally developed by Sun Microsystems which was\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "initiated by James Gosling and released in 1995 as core component of Sun Microsystems'\n" +
                    "Java platform (Java 1.0 [J2SE]).\n" +
                    "The latest release of the Java Standard Edition is Java SE 8. With the advancement of Java\n" +
                    "and its widespread popularity, multiple configurations were built to suit various types of\n" +
                    "platforms. For example: J2EE for Enterprise Applications, J2ME for Mobile Applications.\n" +
                    "The new J2 versions were renamed as Java SE, Jav");
        }
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file08))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder a = new StringBuilder();
            int count = 0;
            String[] string = list.get(i).split(" ");
            for (String value : string) {
                String strWithoutPunctuation = value.replaceAll("^\\p{Punct}|\\p{Punct}$", "");
                if (strWithoutPunctuation.length() >= 3 && strWithoutPunctuation.length() <= 5) {
                    count++;
                }
            }
            count = count / 2;
            count = count * 2;
            for (String s : string) {
                String strWithoutPunctuation = s.replaceAll("^\\p{Punct}|\\p{Punct}$", "");
                if (strWithoutPunctuation.length() >= 3 && strWithoutPunctuation.length() <= 5 && count != 0) {
                    count--;
                } else {
                    a.append(s).append(" ");
                }
            }
            list.set(i, a.toString().trim());
        }
        try (FileWriter fw = new FileWriter(file08, false);) {
            for (String s : list) {
                String string = s + "\n";
                fw.write(string);
            }
        }
    }

    /*7.  Текстовый файл содержит квадратную матрицу, которая записана по принципу: одна строка файла – одна строка
    матрицы. Необходимо построить двухмерный массив и вывести на экран исходную матрицу и результат ее транспонирования.
    */

    public static void methodMatrixInFile() throws IOException {
        File file09 = new File("..\\test09.txt");
        try (FileWriter fw = new FileWriter(file09, false);) {
            for (int i = 1; i <= 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int number = (int) (Math.random() * 50);
                    String string = number + " ";
                    fw.write(string);
                }
                fw.write("\n");
            }
        }
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file09))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        int index = list.size();
        int[][] arrayOne = new int[index][index];
        int[][] arrayTwo = new int[index][index];
        for (int i = 0; i < list.size(); i++) {
            String[] line = list.get(i).split(" ");
            for (int j = 0; j < line.length; j++) {
                arrayOne[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayTwo[j][i] = arrayOne[i][j];
            }

        }
        System.out.println("\n============Task 7============");
        for (int[] ints : arrayOne) {
            System.out.println("\n" + Arrays.toString(ints));
        }
        System.out.println("___________________");
        for (int[] ints : arrayTwo) {
            System.out.println("\n" + Arrays.toString(ints));
        }
        System.out.println();
    }

    /* 8.Текстовый файл содержит квадратную матрицу, которая записана по принципу: одна строка – один элемент матрицы.
     * Необходимо определить размерность матрицы и построить двухмерный массив. Вывести на экран исходную матрицу
     * и результат ее поворота на 90º по часовой стрелке. */
    public static void methodMatrixInFile90degrees() throws IOException {
        File file10 = new File("..\\test10.txt");
        try (FileWriter fw = new FileWriter(file10, false);) {
            for (int i = 1; i <= 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int number = (int) (Math.random() * 100);
                    String str = number + " ";
                    fw.write(str);
                }
                fw.write("\n");
            }
        }
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file10))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        }
        int index = list.size();
        int[][] array = new int[index][index];
        int[][] arrayTurn = new int[index][index];
        for (int i = 0; i < list.size(); i++) {
            String[] line = list.get(i).split(" ");
            for (int j = 0; j < line.length; j++) {
                array[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTurn[j][array.length - 1 - i] = array[i][j];
            }
        }
        System.out.println("\n============Task 8============");
        for (int[] ints : array) {
            System.out.println("\n" + Arrays.toString(ints));
        }
        System.out.println("___________________");
        for (int[] ints : arrayTurn) {
            System.out.println("\n" + Arrays.toString(ints));
        }
    }

    /* 9. Создать файл. Записать туда произвольный текст. Написать код который будет считывать содержимое файла,
    считать количество символов в тексте и записывать результат в файл. Файл с результатом должен находиться рядом с
    файлом откуда производилось чтение текста.*/
    public static void methodReadNumberCharacters() throws IOException {
        File file11 = new File("..\\test11.txt");
        try (FileWriter fw = new FileWriter(file11)) {
            fw.write("""
                    The latest release of the Java Standard Edition is Java SE 8. With the advancement of Java
                    and its widespread popularity, multiple configurations were built to suit various types of
                    platforms. For example: J2EE for Enterprise Applications, J2ME for Mobile Applications.""");
        }
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file11))) {
            String line;
            while ((line = br.readLine()) != null) {
                char[] arrayChar = line.toCharArray();
                for (char s : arrayChar) {
                    count++;
                }
                count++;
            }
        }
        File file11New = new File("..\\test11New.txt");
        try (FileWriter fw = new FileWriter(file11New, false);) {
            fw.write("File \"test11.txt\" contains " + count + " symbols.");
        }
    }

    /*10.  Создать файл. Записать туда последовательность чисел. Например: 1 2 3 4 5 6 537.
        Написать код который считает содержимое файла и посчитает сумму всех цифр. Результат записать в файл.*/
    public static void methodSumAllNumbers() throws IOException {
        File file12 = new File("..\\test12.txt");
        try (FileWriter fw = new FileWriter(file12, false);) {
            for (int i = 1; i <= 10; i++) {
                int number = (int) (Math.random() * 50);
                String string = number + " ";
                fw.write(string);
            }
        }
        List<Integer> arrayList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file12))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(" ");
                for (String s : array) {
                    arrayList.add(Integer.parseInt(s));
                }
            }
        }
        int sum = arrayList.stream().mapToInt(value -> value).sum();
        File Result = new File("..\\test12New.txt");
        try (FileWriter fw = new FileWriter(Result, false);) {
            fw.write("The sum of all digits in the file " + file12 + " is " + sum);
        }
    }

    /*11. Создать файл через ОС. Наполнить его каким-то текстом. Написать код который считает содержимое файла и
    посчитает количество слов и знаков в тексте. Результат записать в файл в формате: буква - 4, слово - 10, . - 50.*/
    public static void methodCountingInFile() throws IOException {
        File file13 = new File("..\\test13.txt");
        Map<String, Integer> mapOne = new HashMap<>();
        Map<Character, Integer> mapTwo = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file13))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] words = line.split(" ");
                for (String element : words) {
                    if (element.isEmpty()) {
                        continue;
                    }
                    char[] elements = element.toCharArray();
                    StringBuilder word = new StringBuilder();
                    for (int i = 0; i < elements.length; i++) {
                        if (((i == 0 || i == (elements.length - 1)) && !Character.isAlphabetic(elements[i])) ||
                                (i > 0 && i < (elements.length - 1)
                                        && ((!Character.isAlphabetic(elements[i - 1]) && Character.isAlphabetic(elements[i + 1])) ||
                                        (Character.isAlphabetic(elements[i - 1]) && !Character.isAlphabetic(elements[i + 1])) ||
                                        (!Character.isAlphabetic(elements[i - 1]) && !Character.isAlphabetic(elements[i + 1])))
                                        && !Character.isAlphabetic(elements[i]))) {
                            if (mapTwo.containsKey(elements[i])) {
                                int value = mapTwo.get(elements[i]);
                                mapTwo.put(elements[i], value + 1);
                            } else {
                                mapTwo.put(elements[i], 1);
                            }
                        } else {
                            word.append(elements[i]);
                        }
                    }
                    String wordStr = String.valueOf(word).toLowerCase(Locale.ROOT);
                    if (!wordStr.isEmpty()) {
                        if (mapOne.containsKey(wordStr)) {
                            int value = mapOne.get(wordStr);
                            mapOne.put(wordStr, value + 1);
                        } else {
                            mapOne.put(wordStr, 1);
                        }
                    }

                }
            }
        }

        File file13New = new File("..\\test13New.txt");
        try (FileWriter fw = new FileWriter(file13New, false);) {
            fw.write("Number of words: \n");
            fw.write("================\n");
            int index = 0;
            for (Map.Entry<String, Integer> element : mapOne.entrySet()) {
                fw.write(element.getKey() + " - " + element.getValue() + "\n");
                index++;
            }
            fw.write("\nNumber of characters: \n");
            fw.write("================\n");
            int indexPunctuation = 0;
            for (Map.Entry<Character, Integer> element : mapTwo.entrySet()) {
                fw.write(element.getKey() + " - " + element.getValue() + "\n");
                indexPunctuation++;
            }
        }
    }
    /* 12. Через ОС создать файл. Наполнить его произвольным текстом. Написать код который будет считывать
    содержимое файла. Затем, будет искать наиболее встречающееся слово в тексте. Результат записать в файл.*/

    public static void methodFrequentWordInFile() throws IOException {
        File file14 = new File("..\\test14.txt");
        Map<String, Integer> mapOne = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file14))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] words = line.split(" ");
                for (String element : words) {
                    if (element.isEmpty()) {
                        continue;
                    }
                    char[] elements = element.toCharArray();
                    StringBuilder word = new StringBuilder();
                    int i = 0;
                    while (i < elements.length) {
                        if (((i == 0 || i == (elements.length - 1)) && !Character.isAlphabetic(elements[i])) ||
                                (i > 0 && i < (elements.length - 1)
                                        && ((!Character.isAlphabetic(elements[i - 1]) && Character.isAlphabetic(elements[i + 1])) ||
                                        (Character.isAlphabetic(elements[i - 1]) && !Character.isAlphabetic(elements[i + 1])) ||
                                        (!Character.isAlphabetic(elements[i - 1]) && !Character.isAlphabetic(elements[i + 1])))
                                        && !Character.isAlphabetic(elements[i]))) {
                            i++;
                            continue;
                        } else {
                            word.append(elements[i]);
                        }
                        i++;
                    }
                    String wordStr = String.valueOf(word).toLowerCase(Locale.ROOT);
                    if (!wordStr.isEmpty()) {
                        if (mapOne.containsKey(wordStr)) {
                            int value = mapOne.get(wordStr);
                            mapOne.put(wordStr, value + 1);
                        } else {
                            mapOne.put(wordStr, 1);
                        }
                    }

                }
            }
        }

        File file14New = new File("..\\test14New.txt");
        try (FileWriter fw = new FileWriter(file14New, false);) {
            int max = 0;
            String key = "";
            int value = 0;
            for (Map.Entry<String, Integer> element : mapOne.entrySet()) {
                if (max < element.getValue()) {
                    key = element.getKey();
                    value = element.getValue();
                    max = element.getValue();
                }
            }
            fw.write("Most frequent word in the text is " +
                    "\"" + key + "\"" + "." + "\n" +
                    "It meets: " + value + " times.");
        }

    }

    /*13. Через ОС создать файл. Наполнить его произвольным текстом. Написать код который будет производить
     поиск фразы в файле и записывать результат в файл. Например: Искомая строка "какая-то строка" встречается в
     тексте 1 раз.*/
    public static void methodPhraseSearchInFile() throws IOException {
        File file15 = new File("..\\test15.txt");
        StringBuilder allText = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file15))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (allText.toString().equals("")) {
                    allText = new StringBuilder(line);
                } else {
                    allText.append(" ").append(line);
                }
            }
        }

        String searchPhrase = "Java".trim();
        int count = 0;
        int index = allText.indexOf(searchPhrase);
        while (index != -1) {
            if (!Character.isAlphabetic(allText.charAt(index - 1)) &&
                    !Character.isAlphabetic(allText.charAt(index + searchPhrase.length()))) {
                count++;
            }
            index = allText.indexOf(searchPhrase, index + searchPhrase.length());
        }

        File file15New = new File("..\\test15New.txt");
        try (FileWriter fw = new FileWriter(file15New, false)) {
            fw.write(String.format("The phrase: " + "\"" + searchPhrase + "\"" + "\n" +
                    "Found in the text - " + count + " times."));
        }
    }

}