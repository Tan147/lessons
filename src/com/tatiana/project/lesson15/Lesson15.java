package com.tatiana.project.lesson15;

import com.tatiana.project.lesson09.Car;
import com.tatiana.project.lesson09.Train;
import com.tatiana.project.lesson09.Vehicle;

import java.lang.annotation.Repeatable;
import java.util.*;

public class Lesson15 {
    public static void main(String[] args) {
        //List
        ArrayList<String> arrayList = new ArrayList<>(); //здесь массив сначала на 10 эл-ов, потом будет увеличиваться
        //ArrayList<String> arrayList = new ArrayList<>(50); //на 50 эл-ов
        System.out.println(arrayList.size()); //здесь будет 0, размер пустой коллекции всегда равен 0

        //LinkedList<String> linkedList = new LinkedList<>(arrayList);  //создали коллекуию на основе другой коллекции
        // (так можно, кроме перечислений)

        String[] cities = {"Саратов", "Тверь"};
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

        //цикл для перебора коллекций
        // 1. foreach - можем перебрать любую коллекцию
        for (String string : arrayList) {
            System.out.println(string);
        }

        // 2. fori + while - можно перебрать только списки list, т.к. у них есть доступ к индексам
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // 3. итератор
        Iterator<String> stringIterator = arrayList.iterator();
        while (stringIterator.hasNext()) {
            String element = stringIterator.next(); //если следующий есть, его и берем
            System.out.println(element.toUpperCase());
            if ("Самара".equals(element)) stringIterator.remove(); //метод remove вызываем у итератора, а не у коллекции
        }


        //для arrayList делаем TreeSet
        TreeSet<String> citiesTreeSet = new TreeSet<>();
        for (String string : arrayList) {
            if (string != null) {
                citiesTreeSet.add(string);
            }
        }
        System.out.println(citiesTreeSet);


        TreeSet<User> userTreeSet = new TreeSet<>(); //User implements Comparable
        userTreeSet.add(new User(1, "Москва", 23));
        userTreeSet.add(new User(2, "СПб", 33));
        System.out.println(userTreeSet);


       // Comparator<Vehicle> numberComparator = new VehicleComparators.NumberComparator(); //здесь оператор new относится
        // к NumberComparator
        Comparator<Vehicle> LevelOfWareComparator = new VehicleComparators.LevelOfWareComparator();

        /*
        Comparator<Vehicle> LevelOfWareComparatorReversed = levelOfWareComparator.reversed();
        Comparator<Vehicle> LevelOfWareAndNumberComparator = levelOfWareComparator.thenComparing(numberComparator);

        //Comparator<Vehicle> vehicleComparator = Comparator.comparing(() -> {});




        TreeSet<Vehicle> vehicleTreeSet01 = new TreeSet<>(numberComparator);
        TreeSet<Vehicle> vehicleTreeSet02 = new TreeSet<>(LevelOfWareComparator);



        TreeSet<Vehicle> vehicleTreeSet = new TreeSet<>(); //тип Comparator д.б.
       // vehicleTreeSet.add(new Car(Repaintable.Color.BLACK, "01"));
        System.out.println(vehicleTreeSet);



        ArrayList<Vehicle> vehicles = null;
        List<Car> cars = null;
        HashSet<Train> trains = null;
        v3(vehicles);
        v3(cars);
        v3(trains);
    }
    public static void v1(List<String> list){}
    public static void v2(ArrayList<String> list){}
    public static void v3(Collection<? extends Vehicle> vehicleCollection){
        vehicleCollection.add(null /*new Car(Repeatable.Color.Gold, "") - так нельзя*/    /*);
        for (Vehicle vehicle : vehicleCollection) {
            if (vehicle.getLevelOfWare() > 10) vehicle.repair();
        }
    }


    public static  void v1(List<String> list){}
    public static  void v2(ArrayList<String> list){}

    */
    }

}
