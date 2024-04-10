package com.tatiana.project.lesson23;

/*The test class
 создадим класс который будет использовать их, чтобы понять что происходит вообще. Он будет именть метод main, в котором и будет происходить всё действие:

public class TestCommand{
    public static void main(String[] args){
        // создаем объект, который будет использоваться
        Light l=new Light();
        // создаем объекты для всех умений объекта Light:
        Command switchUp=new TurnOnLightCommand(l);
        Command switchDown=new TurnOffLightCommand(l);

        // Создаемтся invoker, с которым мы будем непосредственно контактировать:
        Switch s=new Switch(switchUp,switchDown);

        // вот проверка этого, используем методы:
        s.flipUp();
        s.flipDown();

        /*На выводе будет следующее:
        "The light is on"
        "The light is off"

    }
}
*/