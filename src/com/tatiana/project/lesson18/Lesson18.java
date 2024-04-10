package com.tatiana.project.lesson18;

import com.tatiana.project.lesson11.images.Gallery;
import com.tatiana.project.lesson11.images.Image;
import com.tatiana.project.lesson14.properties.vehicle.Car;
import com.tatiana.project.lesson14.properties.vehicle.Repaintable;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lesson18 {
    private int version;
    private Image image;

    public void v1(int number, Car car){
        int a = 90;
        //Gallery gallery = new Gallery();

        Operation operation = (a1, b1) -> {
            //доступны для чтения локальные свойства и свойства класса тоже
            // Доступ из lambda:
            // 1. Из lambda доступны для чтения: свойства, объявленные в классе
            // и локальные переменные метода (в т.ч. аргументы метода).
            System.out.println(version);
            System.out.println(image);
            System.out.println(number);
            System.out.println(car.getColor());

            // 2. Для записи доступны только свойства, объявленные в классе.
            version += 1;
            //image = new Image();
            //на изменение локальные переменные(объявленные в методе v1 не доступны, они файнал,
            // они называются effective final

            System.out.println(number);

            // number += 1; - так нельзя

            //но можно изменить свойства его, если свойства не файнал
            //car.changeColor(Repaintable.Color.BLACK); - так можно, изменили свойство
            // локальные переменные для lambda - effective final (как final не объявлены, но менять их значения нельзя)
            // number = 90;
            // car = new Car(Repaintable.Color.GOLD, "01");
            // можно обратиться по ссылке и изменить объект

            car.changeColor(Repaintable.Color.RED); // так можно, изменили свойство

            // int number = 90; - нельзя затенить локал.переменную метода
            //Image image = new Image(); // можно затенить свойство класса

            return a1 + b1;
        };

    }
    public static void main(String[] args) {
        //создание анонимного класса, реализующего FI (функциональный интерфейс)
        // реализовать абстрактный метод
        //создать экземпляр анонимного класса
        //все в одном месте, а не в разных файлах

         /*
         Лямбда синтаксис позволяет
         создать класс, реализующий функциональный интерфейс и
         его экземпляр в несколько строчек кода.
         */

        /*
         Функциональный интерфейс - интерфейс, который содержит один абстрактный и
         любое количество default и static методов.
         Принято добавлять аннотацию @FunctionalInterface.
         @FunctionalInterface - аннотация времени компиляции, компилятор сообщит об ошибке,
         если в интерфейсе будет объявлено больше одного абстрактного метода.
         */

          /*
        @FunctionalInterface
        public interface InterfaceName<T> {
            T abstractMethod(T firstArg, T secondArg);
        }

         Лямбда синтаксис:
         1. создаёт анонимный класс, имплементирующий InterfaceName
         2. реализация абстрактного метода: (str01, str02) -> (str01 + str02).toUpperCase()
         3. создаёт экземпляр данного класса
         InterfaceName<String> object = (str01, str02) -> (str01 + " " + str02).toUpperCase();

         Далее можно обратиться к object, как к обычному объекту,
         вызвать доступные методы (всегда определены интерфейсом)
         String str = object.abstractMethod("lambda", "java 8");

        Можно объявить любое количество реализаций
        InterfaceName<String> object01 = (str01, str02) -> str01.toUpperCase() + ": " + str02.toLowerCase();
        InterfaceName<Integer> object02 = (int01, int02) -> {
            if (int01 > 0) return int01 + int02;
            return int01 - int02;
        };
        */
         /*
        Лямбда выражение состоит из:
        1. стрелка -> - лямбда
        2. слева от -> - аргументы, которые принимает абстрактный метод интерфейса
        3. справа от -> - тело метода
        */

        /*
        Аргументы:
        1. если метод не принимает на вход аргументы или принимает 2 и более аргументов,
        они ДОЛЖНЫ указываться в () скобках;
        2. если метод принимает на вход 1 аргумент, () скобки МОЖНО опустить;
        3. типы данных аргументов компилятор берет из контекста (абстрактного метода функционального интерфейса)
        */

        /*
        Тело метода и возвращаемое значение:
        1. если тело метода состоит из одной инструкции, его МОЖНО не оборачивать в {} скобки;
        2. если тело метода состоит из нескольких инструкции, оно ДОЛЖНО оборачиваться в {} скобки;
        3. если тело метода не оборачивается в {} скобки, то метод неявно возвращает результат (return не пишем);
        4. если тело метода оборачивается в {} скобки, то для возврата результата необходимо явно указать return
        5. тип возвращаемого значения или void компилятор берет из контекста (абстрактного метода функционального интерфейса)
         */

        /*
        Функциональные интерфейсы, объявленные в java, находятся в пакете java.util.function:
        java.util.function.Consumer;
        java.util.function.Supplier;
        java.util.function.Function;
        java.util.function.UnaryOperator;
        java.util.function.BiFunction;
        java.util.function.BinaryOperator;
        java.util.function.Predicate;
        java.util.function.BiPredicate;

         и 43 50 227
         */

        Operation plus01 = (first, second) -> first + second;

        System.out.println(plus01.action(34, 89.9));

        Operation plus02 = (first, second) -> {
            System.out.println(first + second);
            return first + second;
        };
        System.out.println(plus02.action(456.9, 90));

        Operation minus = (first, second) -> first - second;

        Operation delenie = (first, second) -> {
            if (first !=0.0 || second !=0.0) {
                return first / second;
            }
            return 0;
        };

        //java.util.function

        int price = 80;
        // написать реал-ию Function, которая принимает на вход целое число
        // и возвращает строку: переданное число руб.

        Function<Integer, String> intToStr = (integer) -> integer + " руб."; // integer - это имя аргумента здесь

        //System.out.println(intToStr); //здесь будет ссылка на лямбда выражение

        System.out.println(intToStr.apply(price)); //мы писали выше реализацию метода apply из интерфейса Function,
        // поэтому его и вызываем


        price = 100;
        Predicate<Integer> test01 = (x) -> {
            if (x >= 0) return true;
            else return false;
        };

        Consumer<String> stringConsumer = s -> {
            //сохранение объекта, его передача куда-то, изменений значения св-в объекта, могут быть проверки эксепшен
        };

        Supplier<?> supplier = () -> new RuntimeException(); //ничего не принимает на вход, но возвращает

        Predicate<Integer> isPositive =  x -> x > 0;
        Predicate<Integer> isNegative =  x -> x < 0;
        Predicate<Integer> isZero =  x -> x == 0;
        Predicate<Integer> predicate =  isNegative.or(isZero);

        //тоже самое or:
        if (predicate.test(10)){}
        if (isNegative.test(10) || isZero.test(10)){}

        Predicate<Integer> predicate02 = isNegative.and(isZero);

        /*
        IPay pay01 = (amount) -> ;
        IPay pay02 = (amount) -> ;
        IPay pay = pay01.additionalPay(pay02);
        //IPay additionalPay = ()
        //additionalPay - дефолтный метод - если 1 способ оплаты не прошел, то берется 2 метод оплаты,
        // елси и он не прошел, то берется третий
        if (pay.makePayment(100)) {
            System.out.println("Оплата успешно прошла");
        } else {
            System.out.println("Оплата не была завершена");
        }
        */

    }
}



