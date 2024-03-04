package com.tatiana.project.task10;

public class FightingUnit extends Unit {
    private int attack;
    public FightingUnit(int attack, int health, int speed, int money) {
        super(health, speed, money);
        this.attack = attack;
    }
    public int getAttack() {
        return attack;
    }

    public void attack(FightingUnit unit) {}

    @Override
    public void rest() {
        if (getHealth() > 0 && getHealth() < initialHealthPoint) {
            getHealth() = getHealth() + 2;
        }
    }


}
