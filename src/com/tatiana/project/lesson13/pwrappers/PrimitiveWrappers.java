package com.tatiana.project.lesson13.pwrappers;

import java.lang.ref.WeakReference;
import java.util.Scanner;

public class PrimitiveWrappers {
    public static void main(String[] args){
        //Обертки над примитивами
        //byte -> Byte
        //short -> Short
        //int -> Integer
        //long -> Long
        //float -> Float
        //double -> Double
        //boolean -> Boolean
        //char -> Character
        int a01 = 100;
        Integer a02 = 100; //примитив завернули в обертку, объект обертки хранит значение примитива
        ////автоупаковка

        //Integer a03 = new Integer(100); - это устаревшее, так не пишем

        //автораспаковка - переменной примит.типа присваивается значение обертки
        int b01 = a02;

        /*byte oneB = 1;
        Integer oneI = oneB; - не сработает. Но если сделать привидение типо, то сработает
        Integer oneI = (int) oneB; - привидение типов*/

        Byte refB = 1;
        int prI = refB; //сработает автораспаковка

        Double d = 90.8;
        //аргументы методов подчиняются правилам автоупаковки и автораспаковки
        //v1(oneB, d);

        Integer[] integers = {90, 76, 112, -900};
        //автоуп и авторасп не работает с массивами
        //v2(integers);

        Integer x = 9;
        Integer y = 9;
        System.out.println(x == y); //true, здесь ссылаются на один объект
        System.out.println(x.equals(y)); //true

        Integer n = 900;
        Integer m = 900;
        System.out.println(n == m); //false здесь означает, что ссылаются на разные объекты в памяти
        System.out.println(n.equals(m)); //true


        Number number = 1000; //Integer
        // Double dNumber = (Double) number; //ClassCastException
       // Long lNumber = (Long) number; //ClassCastException

       /* public static Boolean getBoolean()
       boolean b = getBoolean(); может быть ошибка на null, нужна проверка
        */

        StringBuilder sb = new StringBuilder(); //это сильная ссылка

        WeakReference<StringBuilder> sbWeak = new WeakReference<>(sb); //sbWeak - это слабая ссылка на тот же объект

        sb = null;
        // пока все ссылки на StringBuilder не будут удалены, сборщик мусора объект не удалит
    }
    public static void  v1(Integer i, double d){}
    public static void  v2(int[] ints){}
}
