package com.tatiana.project.lesson13.task13;

public class Task13 {
    public static void main(String[] args){
        Action action01 = new Eat();
        Action action02 = new Drink();
        Action action03 = new Play();
        action01.execute();// eat
        System.out.println(action01);
        action02.execute(); // drink
        System.out.println(action02);
        action03.execute(); // play
        System.out.println(action03);

        action01.nextAction(action02);
        action02.nextAction(action03);

        //Animal animal = new Animal();
        //animal.doAction(action01); // eat drink play

    }

}
