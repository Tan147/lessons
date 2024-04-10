package com.tatiana.project.lesson23.observer;

import com.tatiana.project.lesson23.observer.Connection;
import com.tatiana.project.lesson23.observer.Listener;

public class MessageSender implements Listener { // конкретная реализация наблюдателя
    @Override
    public void execute(Connection connection) {
        System.out.println("Отправка сообщений по смс");
    }
}