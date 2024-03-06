package com.tatiana.project.lesson11;

import java.util.Objects;

public class Point implements Cloneable{
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone() {
        //2 варианта: собственная реализация клонирования
        //или реализация клонирования родителя
       try {
           return (Point) super.clone(); //создание поверхностной (неглубокой) копии объекта
           //оба объекта будут ссылаться на один и тот же адрес в памяти
       } catch (CloneNotSupportedException e) {
           System.out.println("Клонирование не поддерживается");
           return null;
       }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';  //'' это символ, чтобы лишний объект строчки не создавать



    }

}
