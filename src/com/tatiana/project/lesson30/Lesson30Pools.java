package com.tatiana.project.lesson30;

import com.tatiana.project.lesson31.FileFinder;

import java.io.File;
import java.util.List;
import java.util.concurrent.*;

public class Lesson30Pools {
    public static void main(String[] args) {
        // [thread01, thread02, thread03]  примерно так выглядит пул
        // BlockingQueue [task01, task02] задачи для потоко пула

        /* так примерно выглядят потоки из пула
        class Th extends Thread {
            BlockingQueue<Runnable> tasks;

            public Th(BlockingQueue<Runnable> tasks) {
                this.tasks = tasks;
            }
            public void run(){
                while (!Thread.currentThread().isInterrupted()) {
                    Runnable task = tasks.take();
                    task.run();
                }
            }
        }
         */

        ExecutorService pool01 = Executors.newFixedThreadPool(3); //создание пула фиксир.размера
        pool01.execute(()->{
            System.out.println("First Task");
        });
        pool01.execute(()->{
            System.out.println("Second Task");
        });
        pool01.shutdown();  //закрытие пула, все потоки завершают выполнение задач, больше нельзя добавлять задачи в очередь

        // List<Runnable> runnables = pool01.shutdownNow(); //довыполнят то, что сейчас делают,
        // и к новым задачам в очереди не будут переходить, задачи оставшиеся невыполненными запишутся в список

        //создание пула фиксированного размера всегда на 1 поток
        ExecutorService pool02 = Executors.newSingleThreadScheduledExecutor();
        pool02.shutdown();

        ExecutorService pool03 = Executors.newCachedThreadPool(); //создание кэширующего пула
        Future<String> result = pool03.submit(new IdGenerator()); //добавление задачи в пул03, и ее рез-т окажется в контейнере Future<>
        // String id = result.get(); // как join, это получение рез-та из контейнера
        // String id = result.get(10, TimeUnit.SECONDS); //join(time)
        pool03.shutdown();


        try {
            String id = result.get(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            //если выброшен эксепшен в методе call, выполняющейся задачи
        } catch (TimeoutException e) {
            //если через 10,TimeUnit.SECONDS, метод гет не вернет рез-т выполнения задачи
        }
        try {
            List<Future<String>> futureList =
                    pool03.invokeAll(List.of(new IdGenerator(), new IdGenerator()));
            for (Future<String> stringFuture : futureList) {
                try {
                    //ожидание каждого контейнера
                    String id = stringFuture.get(10, TimeUnit.SECONDS);
                    System.out.println(id);
                } catch (ExecutionException e) {
                    //во время выполнения задачи произошла ошибка
                } catch (TimeoutException e) {
                    //рез-т в контейнере не появился за 10, TimeUnit.SECONDS
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        CustomPool customPool = new CustomPool(3, 10, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(1000));
        customPool.execute(()->{});
        customPool.shutdown();

        ScheduledExecutorService scPool01 = Executors.newScheduledThreadPool(1);
        scPool01.scheduleAtFixedRate(()->{
            System.out.println("задача, которая должна " +
                    "запускаться на выполнение каждые 3 минуты");
                },
                0, 3, TimeUnit.MINUTES
        );
        scPool01.scheduleWithFixedDelay(()->{
                    System.out.println("задача, которая должна " +
                            "запускаться на выполнение каждые 3 минуты после завершения предыдущей");
                },
                0, 3, TimeUnit.MINUTES
        );
        scPool01.schedule(()->{
                    System.out.println("задача, " +
                            "которая выполнится один раз через 3 минуты");
                },
               3,
                TimeUnit.MINUTES
        ); //выполнение задачи по расписанию без повторений (если их нет в самой задаче)

        FileFinder mainTask = new FileFinder(new File("file.txt"),
                new File("Lesson20"));
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        forkJoinPool.execute(mainTask); //отдает задачу на выполнение
        File ffResult01 = mainTask.join(); // если через джоин, то нужна и предыдущая строка

        File ffResult02 = forkJoinPool.invoke(mainTask); // эта строка заменит 108 и 109, т.е. стразу в пул и результат

        ExecutorService stealingPool = Executors.newWorkStealingPool(); //это пул, у каждого его потока своя очередь для задач, а у др видов пулов одна очередь
        stealingPool.execute(()->{});
        stealingPool.shutdown();

        // виртуальные потоки java 21
        Thread thread01 = Thread.ofVirtual().start(()->{});

        Thread thread02 = Thread.startVirtualThread(()->{}); //результат у этого метода как и на 118 строке
        //методы startVirtualThread и ofVirtual().start(() получаем в результате пул с вирт.потоками

        ExecutorService virtualPool = Executors.newVirtualThreadPerTaskExecutor();
        virtualPool.execute(()->{});



    }
}
