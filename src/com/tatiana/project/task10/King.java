package com.tatiana.project.task10;

import java.util.Arrays;

public class King extends Unit{

    protected FightingUnit[] army = new FightingUnit[20];
    private int index;
    private FightingUnit deadFightingUnit;

    public King(int attack, int health, int speed, int money) {
        super(health, speed, money);
        money = 500;
    }

    public boolean addFightingUnit(FightingUnit fightingUnit) {
        for (int index = 0; index < 20 && money >= 200; index++) {
            if (army[index] == null) {
                army[index] = fightingUnit;
                return true;
            }
        }
        money -= 200;
        return true;
    }

    public void rest() {
        if (health > 0 && health < initialHealth && money > 0) {
            health += 5;
            money -= 2;
        }
    }

    public boolean replaceFightingUnit(FightingUnit fightingUnit) {
        if (fightingUnit.health < 1) {
            deadFightingUnit = fightingUnit;
            for (int index = 0; index < 20 && money >= 12; index++) {
                if (army.equals(deadFightingUnit)) {
                    army[index] = fightingUnit;  //не уверена, что тут новый fightingUnit присвоится
                    money -= 12;
                    return true;
                }
            }
        }
        return true;
    }

    public void attack(King king) {
            }








}
