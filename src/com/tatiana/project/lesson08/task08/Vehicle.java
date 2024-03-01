package com.tatiana.project.lesson08.task08;

public class Vehicle {

    protected String number;
    private int wear;
    private int maxSpeed = 120;

    public void repair() {
        if (wear > 0) wear--;
    }
}
