package com.company.project.lesson27;

import com.tatiana.project.lesson27.RunnableTask;
import com.tatiana.project.lesson27.ThreadTask;

import java.util.ArrayList;
import java.util.List;

public class Lesson27 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        ThreadTask threadTask01 = new ThreadTask(stringList); //NEW состояние
        System.out.println(threadTask01.getState());
        threadTask01.setName("ThreadTask 01");
        ThreadTask threadTask02 = new ThreadTask(stringList);
        threadTask02.setName("ThreadTask 02");

        threadTask01.start(); //это запуск параллельного потока
        threadTask02.start(); //это запуск другого параллельного потока
        // первый поток это мэйн, threadTask01 и threadTask02 это второй и третий, но точно их очередь неизвестно
        //это зависит от планировщика потоков вирт.машины



        RunnableTask runnableTask = new RunnableTask("task");
        Thread threadWithRunnable = new Thread(runnableTask); //создаем отдельный поток для объекта
        System.out.println(threadWithRunnable.getState());
        threadWithRunnable.start(); //у потока вызвали метод старт
        // void run();

        /*Thread threadWithLambda = new Thread(()->{
            while (true) {
                System.out.println(Thread.currentThread().getName());
            }
        }); //можем создать поток и через лямбда-выражение
        // фоновый поток
        threadWithLambda.setName("daemon");
        threadWithLambda.setDaemon(true);
        threadWithLambda.start();*/
        // Thread.currentThread().setDaemon(true);

        List<Double> doubles = new ArrayList<>();

        Thread addToDoubles = new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            doubles.add(Math.random());
        });
        //поток мейн
        addToDoubles.setName("addToDoubles");
        addToDoubles.start(); //здесь маен поток и парал-но addToDoubles
        System.out.println(doubles); //т.к. поток addToDoubles спит снчала,
        // то мейн успеет отработать и выдаст здесь пусой лист

        try {
            // addToDoubles.join(); // main
            addToDoubles.join(1000); //мейн ждет
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(doubles); //коллекция все еще пустая

        System.out.println("main");

        // Thread  interrupted - false
        //        .isInterrupted() -> false
        //        .interrupt() -> interrupted -> true
        //        .isInterrupted() -> true
        Thread thread = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()) {
                // инструкции потока
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { // interrupted - false
                    Thread.currentThread().interrupt(); // interrupted - true
                }
            }
        });
        thread.start();
        thread.interrupt(); // interrupted - true
    }
}












