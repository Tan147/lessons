package com.tatiana.project.lesson14.methods;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public class GenericMethods {
    public static void main(String[] args){
        objectVoid("faefae");
        objectVoid(2424);
        objectVoid(new StringBuilder());

        String[] strings = {"cat", "dog", "mouse"}; //массив строк
        String string = "cat"; //строка для поиска

        Integer[] integers = {34, 55, 90}; //массив чисел
        Integer integer = 34; //число для поиска

        boolean result = GenericMethods.<String>inArray(strings, string);
        //здесь мы конкретно указали тип String, т.е. в метод можно передать строку и его наследники
        // (но не супертипы) из T

        result = GenericMethods.<Number>inArray(integers, integer);
        //тип Number - в метод можно передать тип Number и его наследники (но не супертипы)


        LocalDate localDate = LocalDate.now();
        int compareResult = GenericMethods.<Number, LocalDate>compareHashCodes(integer, localDate); //вызвали метод compareHashCodes
    }


    //generic на уровне методов
    public static <T> boolean inArray(T[] arr, T elem) {
    //generic без ограничений здесь, тогда внутри можем вызывать методы от Object
        if (arr == null || elem == null) return false;
        for (T arrElement : arr) {
            if (arrElement != null && arrElement.equals(elem))
                return true;
            }
        return false;
    }







    public static <T extends Number, K extends Temporal>
    //Temporal - это дата и время
    int compareHashCodes(T first, K second){
        //у переменной first можно вызвать методы Number и его супертипов (Object его супертип)
        //у переменной second можно вызвать методы Temporal и его супертипов
        return Integer.compare(first.hashCode(), second.hashCode());


    }



    public static void objectVoid(Object object) {

    }
}
