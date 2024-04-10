package com.tatiana.project.lesson23;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;
import java.io.IOException;

//паттерн Command, 2
public class Storage {
    public void open() {
    //логика открытия хранилища
    }
    public void read() {
        //логика чтения из хранилища
    }
    public void write(){
        //логика записи в хранилище
    }

    /*
    public void write(String message){
        message += "\n"; //с новой строки
        Files.writeString(Paths.get("Filename.txt"), message,
                StandardOpenOption.CREATE, //создать, если файла нет
                StandardOpenOption.APPEND); //дозапись в файл
    }
    public void read(){
        //чтение одной строки
        String string = Files.readString(Paths.get("filename.txt"));

        //чтение строк в стрим
        Files.lines(Paths.get("filename.txt")); //Stream<String>, построчное считываение

    }*/

}
