package com.tatiana.project.lesson23.strategy;

public interface IAction<T> {
    void execute(T t);
}
