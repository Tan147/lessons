package com.tatiana.project.lesson23;

/*Receiver class
есть класс Light, который умеет две вещи: включить свет и выключить. Он в терминах паттерна будет "приемник команд (receiver)"
*/

public class Light{
    public Light(){  }

    public void turnOn(){
        System.out.println("The light is on");
    }

    public void turnOff(){
        System.out.println("The light is off");
    }
}