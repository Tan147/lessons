package com.tatiana.project.lesson12;

import java.io.IOException;
import java.time.LocalDateTime;

public class CompileTimeExceptions extends Exception {

    //объявить собственный класс исключения времени компиляции
    //конструктор принимает на вход сообщение
    //конструктор принимает на вход сообщение и Throwable
    //реализовать собственную логику метода getMessage
    // (сообщение, которые выходит в конструктор чтобы выводилось и дата)
    // логика родителя + собственная для гетмесседж


    //message - описание причины генерации исключения
    public CompileTimeExceptions(String message){
        super(message);
    }
    //message - описание причины генерации исключения
    //cause - исключение, которое стало причиной исключения

    public CompileTimeExceptions (String message, Throwable cause){ //Throwable говорит какое исключ-ие стало причиной возникновения
        //нашего исключ-ия CompileTimeExceptions
        super(message, cause);
    }

    @Override
    public String getMessage(){
        //логика родительского getMessage  + собственная
        return super.getMessage() + LocalDateTime.now();
    }


}
