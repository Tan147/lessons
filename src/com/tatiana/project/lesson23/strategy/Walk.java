package com.tatiana.project.lesson23.strategy;

public class Walk implements IAction<Unit>{

    @Override
    public void execute(Unit unit) {
        System.out.println("unit Walk");
    }
}
