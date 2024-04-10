package com.tatiana.project.lesson23;

public interface Prototype<T> extends Cloneable {
    T clone();
}

/*
class A implements Prototype<A> {

    @Override
    public A clone() {
        return  (A) super.clone();
    }
}
*/