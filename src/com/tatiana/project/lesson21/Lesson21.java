package com.tatiana.project.lesson21;

import com.tatiana.project.lesson18.Operation;

import java.util.List;
import java.util.stream.Stream;

class HelpClass {
    //этот класс д.б. в отдельном файле
    public double minus(double a, double b){
        return  a - b;
    }
    public static double sub(double a, double b){
        return a * b;
    }
}
public class Lesson21 {
    public static void main(String[] args) {
        Operation plus = (a, b) -> a + b;
        Operation plusWithRef = Double::sum; //если в коде уже есть нужный нам метод, то можем взять ссылку на него
        // тут есть реализация метода в классе Double есть реализация метода  sum, которая нам полностью подходит
        //реализация должна нам полностью подходить в таком случае
        Operation sub = (x, y) -> x * y;
        Operation subRef = HelpClass::sub;
        Operation minus = (a, b) -> a - b;
        //Operation minusRef = HelpClass::minus; //нельзя делать ссылки на нестатич.методы без экзмепляра.
        // Тут метод не статич., ему нужен экземпляр, поэтому не работает

        Operation minusRef = new HelpClass()::minus;

        List<String> strings = Stream.of("affaf", "afwafasf", "afafafgh", "hjfhdfdn")
                //.map(string -> string.toUpperCase());
                .map(String::toUpperCase) //тут ссылка на нестатич.метод toUpperCase, его можно брать,
                // т.к. в потоке есть экземпляры
                .toList();




    }


}
