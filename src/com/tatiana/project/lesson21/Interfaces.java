package com.tatiana.project.lesson21;

import com.tatiana.project.lesson14.properties.vehicle.*;

import javax.swing.plaf.basic.BasicTreeUI;

interface A {}   //интерфейс-маркер
interface B {   //функц.интерфейс - один абстрак.метод
    Vehicle bVoid(String string);
}
interface C {
    Car cVoidCar(String string);
    Train cVoidTrain(String string);
}

public class Interfaces {
    public static void main(String[] args) {

        C c = new C() {  // implements C
            @Override
            public Car cVoidCar(String string) {
                return null;
            }

            @Override
            public Train cVoidTrain(String string) {
                return null;
            }
        };
    }
}
