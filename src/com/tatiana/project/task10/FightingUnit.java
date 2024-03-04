package com.tatiana.project.task10;

public class FightingUnit extends Unit {
    private int attack;
    protected boolean knight;
    protected boolean infantryman;


    public FightingUnit(int attack, int health, int speed, int money, boolean knight, boolean infantryman) {
        super(health, speed, money);
        this.attack = attack;
        if (knight) infantryman = false;
        if (infantryman) knight = false;
        this.knight = knight;
        this.infantryman = infantryman;
    }
    public int getAttack() {
        return attack;
    }

    public void attack(FightingUnit fightingUnit) {}

    @Override
    public void rest() {
        if (health > 0 && health < initialHealth) {
            health += 2;
        }
    }


}
