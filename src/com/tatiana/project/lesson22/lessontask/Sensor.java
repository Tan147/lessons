package com.tatiana.project.lesson22.lessontask;

import com.tatiana.project.lesson22.lessontask.Reactinable;

import java.util.List;
import java.util.Objects;

public class Sensor {
    private double temperature;
    private List<Reactinable> reactinables;

    public void addReactinable(Reactinable reactinable){
        reactinables.add(Objects.requireNonNull(reactinable));
    }
    public void removeReactinable(Reactinable reactinable){
        reactinables.remove(Objects.requireNonNull(reactinable));
    }

    public void temperatureRequest(){
        double temp = Math.random() * 1000;
        reactinables.forEach(reactinable -> {
            reactinable.react(temp);
            reactinable.log();
        });
    }

    Reactinable red = new Reactinable() {
        @Override
        public void react(double value) {
            System.out.println("red " + value );
        }

        @Override
        public void log() {}
    };

    Reactinable green = new Reactinable() {
        @Override
        public void react(double value) {
            System.out.println("green" + value );
        }

        @Override
        public void log() {}
    };



}
