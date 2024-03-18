package com.tatiana.project.lesson13.task13;

public class Animal {


    public void doAction(Action action){
        action.executeNext(this);
    }
}
