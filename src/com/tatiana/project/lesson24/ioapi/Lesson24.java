package com.tatiana.project.lesson24.ioapi;

import java.io.*;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lesson24 {
    public static void main(String[] args) throws IOException {
        Resource resource = new Resource(); //создали доступ к ресурсу, объект, в память сохраняется доступ к ресурсу

        try {
            resource.resourceVoid(); //взаимод-ли с ресурсом
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        finally {
            resource.close(); //закрыли ресурс, в блоке finally
        }

        // второй вариант, с 7 версии java работает
        // try with resources
        try(Resource resource00 = new Resource()) {   //здесь важно, чтобы объекты, к-рые создаются были автоклоусебн типа
            resource00.resourceVoid();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }   //автоматически будет вызываться метод close,
        // потом управление передается в блок catch или прога падает с ошибкой


        //Файл разделен на строки (150 строк)
        //реализовать копирование текста (строк) из одного файла в другой. при копировании необходимо проверять наличие
        //определенных слов в тексте (массив слов). После завершения копирования вывести в консоль инфу о том,
        //какие слова из массива содержатся в тексте и в каком количестве



        String[] words = {"we", "you", "it"};

        String filename = "sgsggs.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            int x = 0;
            //String[] wordsIn = new String[]{};
            String wordsIn = null;
            String wordsIn01;
            for (int i = 0; i > words.length-1; i++) {
                if (line.contains(words[i])) {
                    x ++;
                    wordsIn01 = words[i];
                    wordsIn = wordsIn + wordsIn01;
                }
            }
            reader.close();
            Files.writeString(Paths.get("second.txt"), line, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("В тексте содержатся слова: " + wordsIn + " в количестве " + x);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



        // Файл большого размера необходимо прочитать и вывести инфу:
        // сколько раз в файле встречается послед-ть символов "dd8222kdd8".
        // Инфа в файле содержится в виде строк:
        // dd8222kdd8
        // dd82k2k4d8
        // и т.д.








        // forEach запись в стриме по одной строчке

        /*
        Если надо прочитать весь файл:

        String fileName = "file.txt";
        String content = Files.lines(Paths.get(fileName)).reduce("", String::concat);
        System.out.println(content);

         */
    }
}
