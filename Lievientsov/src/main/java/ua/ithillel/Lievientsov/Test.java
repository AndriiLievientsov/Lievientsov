package ua.ithillel.Lievientsov;

import java.io.*;

import java.util.*;

public class Test {


//        String str1 = "1261";
//        try {
//            Integer i2 = Integer.valueOf(str1);
//            System.out.println(i2 + 1) ;
//        }catch (NumberFormatException e) {
//            System.err.println("Неправильный формат строки!");
//        }
//
//
//        File inputFile = new File("myFile.txt");
//        File tempFile = new File("myTempFile.txt");
//
//        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//
//        String lineToRemove = "bbb";
//
//        String currentLine;
//
//        while((currentLine = reader.readLine()) != null) {
//            // trim newline when comparing with lineToRemove
//            String trimmedLine = currentLine.trim();
//            if(trimmedLine.equals(lineToRemove)) continue;
//            writer.write(currentLine + System.getProperty("line.separator"));
//        }
//        writer.close();
//        reader.close();
//        boolean successful = tempFile.renameTo(inputFile);

//        if (isEven("12")){
//            System.out.println("works right");
//        }
//        else {
//            System.out.println("shit no good");
//        }
//
//        if (!isEven("13")){
//            System.out.println("works right");
//        }
//        else {
//            System.out.println("shit no good");
//        }
//    }
//
//    public static boolean isEven(String number){
//        int i2 = Integer.parseInt(number);
//        return (i2%2==0);
//    }



//            File inputFile = new File("myFile.txt");
//            File tempFile = new File("myTempFile.txt");
//            //cчитывает
//            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//            //записывает
//            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//            //обявляем строку
//            String currentLine;
//            //я так понимаю идет по файлу 1 и записывает в него файл2 с переносом на строчку
//            // пока файл 1 не станет null
//            while((currentLine = reader.readLine()) != null) {
//                writer.write(currentLine);
//                writer.newLine();
//            }
//            writer.close();
//            reader.close();
//            //вот это не знаю
//            boolean successful = tempFile.renameTo(inputFile);


//        List<String> strings = Arrays.asList("13", "12", "11", "10");
//        List<String> strings2 = new ArrayList<>();
//
//
////        for (String s : strings) {
////            System.out.println(s);
////        }
//        for (String s : strings){
//            if (isEven(s)){
//                strings2.add(s);
//            }
//        }
//        strings = strings2;
//        System.out.println(strings);
//
//    }
//
//    public static boolean isEven(String number){
//        int i2 = Integer.parseInt(number);
//        return (i2%2==0);
//    }




}



