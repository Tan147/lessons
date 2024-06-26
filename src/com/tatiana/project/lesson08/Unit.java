package com.tatiana.project.lesson08;

public class Unit {
    //можно менять только в методе rest
    protected int healthPoint;  //getter сделаем
    //должно быть доступно для чтения
    private int speedPoint; //getter

    protected int initialHealthPoint = healthPoint; //создали свойство


    public Unit(int healthPoint, int speedPoint) {  //конструктор
        this.healthPoint = healthPoint;
        this.speedPoint = speedPoint;
        initialHealthPoint = healthPoint;
    }


    public Unit(int healthPoint) {   //другой конструктор
        this.healthPoint = healthPoint;
        initialHealthPoint = healthPoint;
    }

    public void rest() {
        if (healthPoint > 0 && healthPoint < initialHealthPoint) {
            healthPoint++;
        }
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getSpeedPoint() {
        return speedPoint;
    }


    // реализовать метод void rest(): увеличивает healthPoint на 1,
    // 1. если текущее значение 0 или отрицательное число, healthPoint не увеличивается
    // 2. healthPoint не может превышать изначального значения

    /*
    Запретить наследование
    final class
    также и с методами
    public final void ...
     */
}

