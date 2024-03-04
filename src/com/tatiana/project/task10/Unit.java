package com.tatiana.project.task10;

public class Unit {
    private int health;
    private int speed;
    private int money;
    protected int initialHealthPoint = health;

    public Unit(int health, int speed, int money) {
        this.health = health;
        this.speed = speed;
        this.money = money;
        initialHealthPoint = health;
    }
    public void rest() {
        if (health > 0 && health < initialHealthPoint) {
            health++;
        }
    }

    public int getHealth() {
        return health;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMoney() {
        return money;
    }



}
