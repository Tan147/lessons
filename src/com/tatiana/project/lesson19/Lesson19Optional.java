package com.tatiana.project.lesson19;

import com.tatiana.project.lesson09.Car;

import java.util.Comparator;
import java.util.Optional;

public class Lesson19Optional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("data");

        if (optional.isPresent()) {
            String string = optional.get(); //здесь мы получили данные
            System.out.println(string.toUpperCase());
        } else {
            System.out.println("Данные отсутствуют");
        }
        //и тоже самое так, и этот вариант лучше:
        optional.ifPresentOrElse(data -> System.out.println(data.toUpperCase()),
                () -> System.out.println("Данные отсутствуют"));

        Optional<Car> vehicle = Optional.ofNullable(new Car("white", 180));
        Car car01 = vehicle.orElse(new Car("black", 230)); //в любом случае  создается новая кар
        Car car02 = vehicle.orElseGet(() -> new Car("black", 230)); //только если нал,то создастся новая кар


    }
}
