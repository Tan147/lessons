package com.tatiana.project.lesson15;

import java.util.*;

public class Lesson15 {
    public static void main(String[] args){
        //List
        ArrayList<String> arrayList = new ArrayList<>(); //здесь массив сначала на 10 эл-ов, потом будет увеличиваться
        //ArrayList<String> arrayList = new ArrayList<>(50); //на 50 эл-ов
        System.out.println(arrayList.size()); //здесь будет 0, размер пустой коллекции всегда равен 0

        //LinkedList<String> LinkedList = new LinkedList<>(arrayList);  //создали коллекуию на основе другой коллекции
        // (так можно, кроме перечислений)

        String[] cities = {"Саратов","Тверь"};
        List<String> strings = Arrays.asList(cities);

        LinkedList<String> linkedList = new LinkedList<>(strings);
        System.out.println(linkedList.size()); //2

        linkedList.add("Москва");
        linkedList.add("Тверь");

        //удалим дубль города, сделав hashSet
        HashSet<String> hashSet = new HashSet<>(linkedList);
        System.out.println(hashSet.size()); //3

        //Саратов, Тверь, Москва
        arrayList.addAll(hashSet);
        arrayList.add("СПб");
        arrayList.add(null);
        arrayList.add("Самара");
        arrayList.add("Самара");

        arrayList.remove("Самара"); //удаление по equals, boolean, если получилось удалить, то получим тру
        arrayList.remove(2); //удаление по индексу, E (элемент), метод вернет ссылку на удаленный элемент

        System.out.println(arrayList.get(4));

        arrayList.removeIf(element -> "Самара".equals(element)); //удалит все Самары

        //цикл для перебора коллекций for
        for (String string : arrayList) {
            System.out.println(string);
        }






    }

    public static  void v1(List<String> list){}
    public static  void v2(ArrayList<String> list){}

}
