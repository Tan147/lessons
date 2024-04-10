package com.tatiana.project.lesson18;

import com.tatiana.project.lesson11.animals.Animal;

public interface Action {
    void execute(Animal animal);

    default Action nextAction(Action next){
        return animal -> {
            execute(animal);
            if (next != null) next.execute(animal);
        };
    }
}

/* И вариант с синтаксисом, который позже будем проходить
здесь new Action это создание нового класса

abstract class Action {
    abstract public void execute();
    public void nextAction(Action action){
        return new Action() {
            public void execute() {
                execute();
                if (action != null) action.execute();
             }
          }
   }
 */
