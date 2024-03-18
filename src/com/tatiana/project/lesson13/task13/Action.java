package com.tatiana.project.lesson13.task13;

abstract public class Action {
    private Action next;

    abstract protected void execute(Animal animal);

    public void nextAction(Action action){
        this.next = action;
    }
    public void executeNext(Animal animal) {

    }

}
