package com.tatiana.project.lesson11;

public record PointRecord(int x, int y) {

    public PointRecord {
        if (x <0 || y < 0) throw new IllegalArgumentException();
    //инициализация происходит по умолчанию
    }
    //тело. Можкт быть пустым, можно объявлять методы,
    // свойства объявлять нельзя
    //нельзя объявлять не статик поля
    //можно переопределить геттеры

}
//на самом деле сгенерируется private final поля - названия и типы, как у компонентов заголовка
//сгенерируется канонический (canonical) конструктор - принимает на вход и инициализирует
//значения всех свойств
//сгенерируется одноименные со свойствами геттеры int x() {} и int y() {}
//переопределяются методы toString, equals, hashCode с участием всех свойсвт

/* это record - класс имеет финал св-ва, они устанавл-ся через конструктор,
и есть геттеры
public class Point {
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
}
 */
