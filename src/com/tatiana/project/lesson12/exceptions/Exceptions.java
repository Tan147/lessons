package com.tatiana.project.lesson12.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        String s = null;
        if (s != null) System.out.println(s.toUpperCase());
        //nullPointException, исключ-ие вр-ни выполнения
        //добавили проверку на null

        int[] arr = new int[3];
        int index = 3;
        if (index < arr.length) arr[index] = 100;
        // arr[3] = 100; //здесь выход за пределы массива

        Object number = 790;
        if (number instanceof String s1) System.out.println(s1.toUpperCase());
        //String string = (String) number; //ошибка привидения типов ClassCastException

        String str = null;
        try { //потенциально опасный код сюда помещаем, который может првиести к исключению
            str = (String) number;
            System.out.println(str);
        } catch (ClassCastException | NullPointerException exp) { //блок кэтч поймает ClassCastException
            //exp - это мы назвали так переменную, куда передастся объект пойманный как ClassCastException
            //управление передается блоку catch
            System.out.println(exp.getMessage());
        }
        //System.out.println(str.toUpperCase()); //здесь упадет с nullPointException

        try {
            str = (String) number;
            System.out.println(str);
        } catch (ClassCastException exp) {
            System.out.println(exp.getMessage());
        } catch (NullPointerException exp) {
            exp.printStackTrace();
        }    // так можно писать, если у нас разные инструкции нужно выполнить в кетч

        String[] strings = {"yellow", "yellowgreen", "blue"};

       /* for (String string : strings) {
            try {
                if (string.startsWith("y")) System.out.println(string);
            } catch () {}
        } // это вариант входим в цикл и там все проверяем на исключения, чаще используется
        */


        /*try {
            for (String string : strings) {
                if (string.startsWith("y")) System.out.println(string);
                }
            } catch () {} // здесь сразу обработается кетч и выйдет из цикла
        }*/

        try { //здесь общий родитель
            str = (String) number;
            System.out.println(str);
        } catch (ClassCastException |
                 NullPointerException ex01) { //если этот кетч написать вторым, а не первым, то до него не дойдет
            System.out.println(ex01.getMessage());
        } catch (RuntimeException exp) { //здесь более частный случай, поэтому его вторым пишим
            System.out.println(exp.getMessage());
        }

        //Exception и его наследники (кроме Runtime)
        //исключения времени компиляции
        //и орабатываемые (разработчик обязан их обрабатывать в коде)

        //Runtime и его наследники
        //исключения времени выполнения
        //необрабатываемые (т.е. разработчик не обязан их обрабатывать через трай кетч, по желанию)

    }

    public static void read () /*throws IOException*/{
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        try {
            readFromFile(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void readFromFile(String filename) throws IOException {
        if (!filename.endsWith(".json") && !filename.endsWith(".xml")) {
            throw new IOException("filename is not valid");
        }
        //if (filename.endsWith(".json") || filename.endsWith(".xml")){
        //}
        //логика чтения из json или xml

        //исключение должно быть обработано там, где будет вызываться метод
    }
}




/*
Основные принципы ООП:
1. Абстракция - придание объекту характеристик, которые отличают его от всех объектов, четко определяя его
концептуальные границы. Абстракция позволяет работать с объектами, не вдаваясь в особенности их реализации
 В языке реализуется благодаря использованию абстрактных классов и интерфейсов

2. Инкапсуляция - ограничение доступа к данным и возможностям их изменения.
 В языке реализуется благодаря модификаторам доступа

3.Наследование - это свойство системы, позволяющее описать новый класс на основе уже существующего с частично или
полностью заимствующейся функциональностью.
 В языке - наследование классов: class A extends B {}

4.Полиморфизм – это свойство системы использовать объекты с одинаковым интерфейсом без информации о типе и внутренней
структуре объекта
 В языке полиморфизм реализован полиморфизм наследования, когда мы работаем через общий тип данных,
 например Боевые Юниты.
 Полиморфизм также реализован через перегруженные методы.





         Принципы и примеры их нарушения
Принципы SOLID:
1. S: Single Responsibility Principle - Принцип единственной ответственности
 Каждый класс должен иметь строго ограниченную зону ответственности

class Author{
    private String name;
    public Author(String name){
        this.name = name;
    }
}

class Book {
    private  String title;
    private int pages;
    private Author author;

    public Book(String title, int pages, String authorName){
        this.title = title;
        if (authorName != null) this.author = new Author(authorName);
    }
}

    /*
2. O: Open-Closed Principle - Принцип открытости-закрытости

 Классы должны быть открыты для расширения (добавления нового функционала),
 но закрыты для модификации (изменение кода существующих классов)

class Unit {
    public void attack(String type, Unit enemy){
        if (type.equals("knight")) {

        } else if (type.equals("infantry")) {

        }
    }
    //лучше отдельный класс для каждого типа юнита и там расписать логику их атаки
}


3. L: Liskov Substitution Principle - Принцип подстановки Барбары Лисков

 Подклассы должны заменять свои базовые классы
 (данный принцип реализуется благодаря полиморфизму наследования)

 Если у нас есть класс B, являющийся подклассом класса A,
 у нас должна быть возможность передать объект класса B любому методу,
 который ожидает объект класса A. При этом работоспособность метода постадать не должна

class A {
    void aVoid (){};
}
class B extends A {
    void bVoid() {
    }
}
class C extends A {
    void cVoid() {
    }
}
class App{
    public void aseA(A a){
        a.aVoid();
        //a.cVoid(); здесь среда скажет об ошибке, так функционал пострадает
    }
}



4. I: Interface Segregation Principle - Принцип разделения интерфейса

 Интерфейсы не должны обязывать классы реализовывать методы, которые им не нужны!
 В таком случае лучше создать несколько интерфейсов, чем один
 */
//interface Super...

/*
5. D: Dependency Inversion Principle - Принцип инверсии зависимостей

 Модули верхних уровней не должны зависеть от модулей нижних уровней.
 Оба типа модулей должны зависеть от абстракций.

 Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

 Вначале должно идти проектирование
 интерфейсов,
 потом абстрактных классов,
 потом их конкретных реализаций.
 */


