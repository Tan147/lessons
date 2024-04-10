package com.tatiana.project.lesson17;

import java.io.PrintStream;
import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        String stringKey01 = "cat01";
        String stringKey02 = "cat02";
        WeakHashMap<String, Integer> hashMap01 = new WeakHashMap<>();
        hashMap01.put(stringKey01, 23);

        HashMap<String, Integer> hashMap02 = new HashMap<>();
        hashMap02.put(stringKey02, 23);

        stringKey01 = null; //потеряна сильная ссылка
        stringKey02 = null; //сам хранит ссылку
        System.out.println(hashMap01); // 0
        System.out.println(hashMap02); // 1

    }
}
    class Student {
        private String id;
        private String name;
        private int age;

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }
    class School {
        private int id;

        public ArrayList<Student> getStudents() {
            return students;
        }

        private ArrayList<Student> students;
    }

    class SchoolsStat {
        public static int avgAge(Map<Integer, School> schoolsById) {
            //вернуть средний возраст учеников всех школ

            int pupilsCount = 0;
            int pupilsAge = 0;

            for (School school : schoolsById.values()) {
                if (school == null) continue;
                pupilsCount += school.getStudents().size();
                for (Student student : school.getStudents()) {
                    if (student == null) continue;
                    pupilsAge += student.getAge();
                }
            }
            return pupilsCount;
        }
    }


