package com.tatiana.project.lesson25;

import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson25 {
    public static void main(String[] args) {
        Rate full = new Rate(1, Rate.RateType.FULL);

        Trader trader = new Trader(1, new ArrayList<>(), full,
                "qwerty", "12345");

        Item item01 = new Item(1, "Стол", 12000, trader);
        Item item02 = new Item(2, "Диван", 78000, trader);
        Item item03 = new Item(3, "Стул", 4500, trader);
        Item item04 = new Item(4, "Люстра", 9300, trader);

        trader.addItem(item01);
        trader.addItem(item02);
        trader.addItem(item03);
        trader.addItem(item04);

        /*
        write(item01); //запишется item01
        write(item02); //запишется item01item02 (в конец запись идет)
        write(item03); //запишется item01item02item03

        Item itemFromFile01 = read(); //item01 считается везде первый item01
        Item itemFromFile02 = read(); //item01
        Item itemFromFile03 = read(); //item01
         */

        write(trader);
        Trader traderFromFile = read();
        System.out.println(trader == traderFromFile); //false, это всегда разные объекты
        System.out.println(trader.equals(traderFromFile)); //здесь может быть тру или фолс, зависит от реализации
        // и того какие поля мы включили в сериализацию

    }

    public static <T> void write(T t) throws IOException {
        try (FileOutputStream fileOutput = new FileOutputStream("file.bin", true); // усли true,
             // то будет дозапиьс в конец файла
             //try (FileOutputStream fileOutput = new FileOutputStream("file.bin");  будет перезапись в файл без тру
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)){

            objectOutput.writeObject(t); //преобразует в послед-ть байт

            // app - objectOutput - fileOutput - file.bin
            // app это прога - t зайдет в поток -  поток objectOutput - выйдет tbytes
            // - поток fileOutput - файл с форамтом для байт
        } catch (FileNotFoundException e){  //это не отсутствие файла, а файл оказался не файлом, либо оказался директорией
            //если файл отсутствует, то он создастся
            System.out.println("Проблема с файлом");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Проблема сериализации или записи в файл");
            throw new RuntimeException(e);
        }
    }

    public static <T> T read(){
        try (FileInputStream fileInput = new FileInputStream("file.bin");
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)){

           return (T) objectInput.readObject();

        } catch (FileNotFoundException e){  //здесь те же ошибки, что выше + отсутствие файла
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

/*
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson25 {
    public static void main(String[] args) {
        Rate full = new Rate(1, Rate.RateType.FULL);

        Trader trader = new Trader(1, new ArrayList<>(), full,
                "qwerty", "12345");

        Item item01 = new Item(1, "Стол", 12000, trader);
        Item item02 = new Item(2, "Диван", 78000, trader);
        Item item03 = new Item(3, "Стул", 4500, trader);
        Item item04 = new Item(4, "Люстра", 9300, trader);

        trader.addItem(item01);
        trader.addItem(item02);
        trader.addItem(item03);
        trader.addItem(item04);


    }
}
 */

