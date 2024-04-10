package com.tatiana.project.lesson23;

/*the Command for turning on the light
Необходимо инкапсулировать выполнение умений класса Light. Для этого мы создадим классы TurnOnLightCommand
 и TurnOffLightCommand, которые реализуют интерфейс Command и которые будут принимать в конструкторе
 объект класса Light. И каждый из них будет выполнять только одно действие.
 Один будет вызывать метод turnOn(), а другой turnOff().


public class TurnOnLightCommand extends Command{
    private Light theLight;

    public TurnOnLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOn();
    }
}
*/

