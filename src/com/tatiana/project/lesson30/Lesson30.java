package com.tatiana.project.lesson30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Lesson30 {
    public static void main(String[] args) {
        List<String> tokens = new ArrayList<>(
                Arrays.asList("123", "456", "789"));

        ReentrantLock lock = new ReentrantLock(/*true*/); //это объект как альтернатива синхронайзд блоку,
        // true это флаг справедливости
        //это блокировщик, тоже число, у него 1 разрешение

        Semaphore semaphore = new Semaphore(tokens.size()/*, true*/); // 3, число это кол-во разрешений
        //поток берет разрешение у семафора, делает свою работы и возвращает разрешение
        //пока у семафора есть разрешение, он пропускает потоки
        //поток заблокируется на блокировщике

        /*
        Exchanger exchanger = new Exchanger<>();

        Runnable task01 = ()->{

            String s = exchanger.exchange("task01");  //блокируется
        }; //здесь получаем строчку "task02"
        Runnable task02 = ()->{

            String s = exchanger.exchange("task02");
        }; //здесь получаем строчку "task01"
        */


        // токены нужны только для подключения
        // токен можно использовать только один раз
        // использованный токен нужно заменить новым

        new SynchronizedClientService(tokens, lock, semaphore).start();
        new SynchronizedClientService(tokens, lock, semaphore).start();
        new SynchronizedClientService(tokens, lock, semaphore).start();
        new SynchronizedClientService(tokens, lock, semaphore).start();
        new SynchronizedClientService(tokens, lock, semaphore).start();
    }
}
