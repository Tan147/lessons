package com.tatiana.project.lesson23.chain;

public class Animal {
    public void doAction(Action action) {
        action.execute(this);
    }
}