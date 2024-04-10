package com.tatiana.project.lesson21.task;

import com.tatiana.project.lesson14.properties.vehicle.Vehicle;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StudentTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        //  1. Разделить учеников на две группы: мальчиков и девочек.
        //  Результат: Map<Student.Gender, ArrayList<Student>>

        Map<Student.Gender, ArrayList<Student>> groupGender = students.stream()
                .collect(Collectors.groupingBy(student -> student.getGender(),
                        Collectors.toCollection(ArrayList::new)
                ));


        // 2. Найти средний возраст учеников

        ToIntFunction<Student> studentAge = student -> LocalDate.now().getYear() - student.getBirth().getYear();
        double avgAge = students.stream()
                .mapToInt(studentAge)
                .average()
                .orElse(-1); //на случай, если будет пустой поток

        //или так:
        double avgAge02 = students.stream()
                .collect(Collectors.averagingDouble(student ->
                        LocalDate.now().getYear() - student.getBirth().getYear()));


        //  3. Найти самого младшего ученика

        Student youngestStudent = students.stream()
                .max((st1, st2) -> st1.getBirth().getYear() - st2.getBirth().getYear())
                .get();
        System.out.println(youngestStudent);


        // 4. Собрать идентификаторы учеников в группы по году рождения,
        // результат - Map<ГодРождения, List<Integer>>

        Map<Integer, List<Integer>> task04 = students.stream()
                .collect(Collectors.groupingBy(student -> student.getBirth().getYear(),
                        Collectors.mapping(student -> student.getNumber(), Collectors.toList())
                ));



        // 5. Получить список учеников, отсортированный по полу ученика, потом по дате рождения,
        // потом по имени (в обратном порядке), собрать в список (ArrayList)

        Comparator<Student> byGender = (st1, st2) -> st1.getGender().ordinal() - st2.getGender().ordinal();
        Comparator<Student> byBirth = (st1, st2) -> st1.getBirth().compareTo(st2.getBirth());
        Comparator<Student> byName = (st1, st2) -> st1.getName().compareTo(st1.getName());
        Comparator<Student> byNameR = byName.reversed();
        Comparator<Student> comparator = byGender
                .thenComparing(byBirth)
                .thenComparing(byNameR);
        Collections.sort(students, comparator);



        // 6. Вывести в консоль всех учеников в возрасте от N до M лет
        var n = 6;
        var m = 10;

    }
}