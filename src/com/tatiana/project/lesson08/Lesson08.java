package com.tatiana.project.lesson08;

public class Lesson08 {
    public static void main(String[] args) {
        Unit unit = new Unit(22);
        unit.rest();   //вызвали метод
        BattleUnit battleUnit01 = new BattleUnit(10, 13, 20);
        battleUnit01.rest();   //вызвали метод рест для дочернего класса

        BattleUnit battleUnit02 = new BattleUnit(10, 13, 25);
        battleUnit02.rest();

        battleUnit01.attack(unit);
        battleUnit01.attack(battleUnit02); //Unit -> BattleUnit
        battleUnit01.attack(battleUnit01);

        BattleUnit[] battleUnits = new BattleUnit[3];
        battleUnits[0] = battleUnit01;
        battleUnits[1] = battleUnit02;
        //battleUnits[2] = unit; - так нельзя его добавить

        Unit[] units = new Unit[3]; //можем добавить всех
        units[0] = unit;
        units[1] = battleUnit01;
        units[2] = battleUnit02;

        for (Unit unitElem : units) {
            unitElem.rest();  //а вызвать метод атаки нельзя, потому что здесь от Юнит класса, только его функционал доступен
        }


    }
}
