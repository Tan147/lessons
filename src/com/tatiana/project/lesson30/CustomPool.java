package com.tatiana.project.lesson30;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomPool extends ThreadPoolExecutor {
    public CustomPool(int corePoolSize,  // минималь.кол-во потоков
                      int maximumPoolSize,  // максим.кол-во потоков
                      long keepAliveTime,  // время бездействия потока
                      TimeUnit unit,  // ед.измерения времени
                      BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    } //простаивающие потоки удалятся до минимального, потом перестанут удаляться

}
