package com.tatiana.project.lesson08;

import java.util.Arrays;

public class lesson081 {
    class Apple {
        private String color;
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
    }
    class Storage {
        public final String title;
        public final Apple apple = new Apple();
        public final Apple[] apples = new Apple[10];
        public Storage(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }

        public Apple[] getApples() {
            return apples;
        }
        public void addApple(final Apple apple) {
            final int a = 90;  //не можем менять значение финал переменной,
            //a = 100;
            System.out.println(a);
            // тоже нельзя apple = new Apple();
            apple.setColor("green"); //так обратиться можно
        }


    }
    public class Task {
        public void main(String[] args) {
            Apple apple = new Apple();
            Storage storage = new Storage("Яблочный сад");
            //storage.title = "Склад №1";
            System.out.println(storage.title);
            System.out.println(storage.getTitle());
            System.out.println(Arrays.toString(storage.apples));
            System.out.println(Arrays.toString(storage.getApples()));

            storage.apples[0].setColor("yelloe");
            storage.apples[1] = apple;

            //нельзя изменить значение - storage.apple = new Apple();
            storage.apple.setColor("white"); // обратиться по ссылке можем

        }
    }
}
