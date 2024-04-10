package com.tatiana.project.lesson19;

import com.tatiana.project.lesson14.properties.vehicle.Car;
import com.tatiana.project.lesson14.properties.vehicle.MiniCar;
import com.tatiana.project.lesson14.properties.vehicle.Repaintable;
import com.tatiana.project.lesson14.properties.vehicle.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson19StreamAPI {
    public static void main(String[] args) {
        //Дан поток целых чисел:
        Stream<Integer> temps =
                Stream.of(-560, 312, 12, -55, -100, 45, 0, 0, 23, -20, 221);

        // - оставить в потоке только отриц эл-ты - filter(Predicate)
        // - добавить к каждому эл-ту строку " deg" - map(Function)
        // - вывести каждый эл-т в консоль - forEach(Consumer)
        temps.filter(integer -> integer < 0)
                .map(integer -> integer + " deg")
                .forEach(s -> System.out.println(s));

        //Дан поток целых чисел:
        Stream<Integer> values = Stream.of(-560, 312, 12,
                -55, -100, 45, 0, 0, 23, -20, 221);
        // - оставить в потоке только уникальные зн-ия - distinc()
        // - отриц зн-ия заменить на 0 - map(Function)
        // - отсортировать в порядке убывания - sorted(Comparator)
        // - вывести каждый эл-т в консоль - forEach(Consumer)

        // sorted() - сортировка в натуральном порядке, определенном интерфейсом Comparable

        values.distinct()
                .map(value -> value < 0 ? 0 : value)
                .sorted((value1, value2) -> value2 - value1)
                .forEach(value -> System.out.println(value));

        //Дан массив строк:
        String[] colors = {"white", "black", "red", "yellow", "yellowgreen", "green", "dark yellow"};
        // - создать строк - Arrays.stream(colors)
        // - оставить цвета, не содержащие "yellow" -  filter(Predicate)
        // - вывести в консоль количество элементов потока - long count()
        long count = Arrays.stream(colors)
                .filter(color -> !color.contains("yellow"))
                .count();

        //Дан список Repaintable объектов
        List<Repaintable> repaintables = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new MiniCar(Repaintable.Color.BLACK, "002"),
                new MiniCar(Repaintable.Color.ORANGE, "003"),
                new Car(Repaintable.Color.RED, "004"),
                new MiniCar(Repaintable.Color.BLUE, "005"),
                new Car(Repaintable.Color.BLACK, "006"),
                new Car(Repaintable.Color.ORANGE, "007")
        );
        List<Repaintable.Color> uniqueColors = new ArrayList<>();
        repaintables.forEach(repaintable -> {
            if (!uniqueColors.contains(repaintable.getColor())) {
                uniqueColors.add(repaintable.getColor());
            }
        }); //можно так без потока так сделать

        //этот вариант сделать через поток
        List<Repaintable.Color> uniqueColorsFromStream = repaintables.stream()
                .map(repaintable -> repaintable.getColor())
                .distinct()
                .toList(); //этот метод возвращает неизменяемый список

        //Дан список трансп.спредств
        List<Vehicle> vehicles = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new Train("002", 10, true),
                new MiniCar(Repaintable.Color.ORANGE, "003"),
                new Bus("004"),
                new Train("005", 15, false),
                new Car(Repaintable.Color.BLACK, "006"),
                new MiniCar(Repaintable.Color.ORANGE, "007")
        );

        // - снизить уровень износа методом repair peek(Consumer)
        // - получить stream с уровнями износа транс.средств
        // - вывести в консоль forEach(Consumer)
        vehicles.stream()
                //.peek(vehicle -> vehicle.repair()) - здесь пик ничего не вернет, тут он не совсем подходит
                .map(vehicle -> {
                    vehicle.repair();
                    return vehicle.getLevelOfWare();
                })
                .forEach(integer -> System.out.println(integer));


        // Optional<Vehicle>
        // vehicles.stream().findFirst();
        // vehicles.stream().findAny(); // - это 2 терминальных метода, возвращают обшенел, возвращают первый эл-т потока,
        // если вызваны у обычного стрима. Но если они вызываются у паралелльного стрим(отот который обрабатывает
        // в четыре потока), то все преобразованию будут происходить в четыре потока,а потом сливаются в единый стрим,
        // то findFirst вернет первый, а findAny - вернет любой

        // vehicles.parallelStream().findFirst();
        // vehicles.parallelStream().findAny();

        // vehicles.stream().forEach();
        // vehicles.stream().forEachOrdered(); // они оба работают одинаково у обычного стрима

        // vehicles.parallelStream().forEach(); // этот не гарантирует
        // vehicles.parallelStream().forEachOrdered(); //этот гарантирует сохранение порядка

        // vehicles.stream()
        //   .min((o1, o2) -> o1.getLevelOfWare() - o2.getLevelOfWare()); // Optional<Vehicle>
        // vehicles.stream()
        //   .max((o1, o2) -> o1.getLevelOfWare() - o2.getLevelOfWare()); // Optional<Vehicle>

        // true / false
        // vehicles.stream()
        //   .allMatch(vehicle -> vehicle.getLevelOfWare() > 100);
        // vehicles.stream()
        //   .anyMatch(vehicle -> vehicle.getLevelOfWare() > 100);
        // vehicles.stream()
        //   .noneMatch(vehicle -> vehicle.getLevelOfWare() > 100);

        //это все терминальные методы


        List<List<Integer>> integers = new ArrayList<>();
        integers.add(List.of(3, 5, 8, 1, 9));
        integers.add(List.of(34, -5, 10, 56, 11));
        integers.add(List.of(90, 5, 22, -83, 27));

        integers.stream()
                .map(streamIntegers -> streamIntegers.size());
                // Stream [5, 5, 5]

        integers.stream()
                .map(streamIntegers -> streamIntegers.stream()
                        .map(integer -> integer * 2))
                .toList();
                // получим стрим, внутри которого стрим с числами

        //сумму элементов в списках
        List<Integer> intStream = integers.stream()
                .map(list -> list.stream().mapToInt(value -> value).sum())
                .toList();

        //и второй вариант можно:
        long sum01 = integers.stream()
                .mapToInt(list -> list.stream().mapToInt(value -> value).sum())
                .sum();


        // преобразование stream в массив
        Object[] objectsArr = vehicles.stream().toArray();
        Vehicle[] vehiclesArr = vehicles.stream()
                .toArray(Vehicle[]::new); // ссылка на конструктор массива типа Vehicle
        // IntFunction<A[]> generator R apply(int value);
        // .toArray(size -> new Vehicle[size]); без ссылки на конструктор


        // преобразование stream в список
        List<Vehicle> vehiclesList01 = vehicles.stream()
                .toList(); // unmodifiableList

        List<Vehicle> vehiclesList02 = vehicles.stream()
                .collect(Collectors.toList());// ???List

        List<Vehicle> vehiclesList03 = vehicles.stream()
                .collect(Collectors.toCollection(ArrayList::new));


        String[] strings = {"white", "black", "red", "red", "yellow", "yellowgreen", "green", "dark yellow"};
        Map<String, Integer> stringIntegerMap = Arrays.stream(strings)
                .collect(Collectors.toMap(
                        //принимает на вход 3 аргумента:
                        // правило формирования ключей
                        //правила формирования значения
                        //что делать со зн-иями, если сформировались одинаковые ключи. Если мы точно уверены,
                        // что нет одинаковых, то можно третий не писать
                        color -> color, color -> color.length(), (value1, value2) -> value1 + value2
                ));
        Map<String, Integer> numberLevelOfWare = vehicles.stream()
                .collect(Collectors.toMap(
                     vehicle -> vehicle.getNumber(), vehicle -> vehicle.getLevelOfWare(), (value1, value2) -> value1
                ));

    }
}
