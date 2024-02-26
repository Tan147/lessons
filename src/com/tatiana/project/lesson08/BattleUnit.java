package com.tatiana.project.lesson08;

public class BattleUnit extends Unit{
    //healthPoint можно менять в методе rest и attack
    private int attackPoint;  //обязательно,
    //должно быть доступно для чтения
    //геттер нужен
    public BattleUnit(int attackPoint, int healthPoint, int speedPoint) {
       // super(7, 34); //
        super(healthPoint, speedPoint);
        this.attackPoint = attackPoint;
    }
    public int getAttackPoint() {
        return attackPoint;
    }

    //public void attack(BattleUnit unit) {
        //unit.attack(this);
    //}  - у такого метода больше вариантов логики атаки

    public void attack(Unit unit) {}


    //переопределить метод родителя
    @Override
    public void rest() {
        if (healthPoint > 0 && healthPoint < initialHealthPoint) {
            healthPoint+=2;
        }
    }

}
