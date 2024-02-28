package com.tatiana.project.lesson09;

public interface Colorable extends
                Runnable, Cloneable {
    default String getColor(){
        return "red";
    }
    void color(String color);

}

/*
interface A {
    void doSmth(int number);
}
interface B {
    void doSmth(int number);
}
class AB implements A, B {
    @Override
    public void doSmth(int number) {
        System.out.println();
    }
}
*/