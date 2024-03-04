package com.tatiana.project.task10;

public class Unit {
    protected int health;
    protected int speed;
    protected int money;
    protected int initialHealth = health;

    public Unit(int health, int speed, int money) {
        this.health = health;
        this.speed = speed;
        this.money = money;
        initialHealth = health;
    }
    public void rest() {
        if (health > 0 && health < initialHealth) {
            health++;
        }
    }

   /*
    public void setHealth(int health) {
        this.health = health;
    }
    public void setMoney(int money) {
        this.money = money;
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
    */


}
