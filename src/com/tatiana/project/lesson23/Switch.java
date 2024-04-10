package com.tatiana.project.lesson23;

/*the Invoker class
* Теперь пришло время создать объект, который бы принимал эти инкапсулированные методы объекта Light.
* Он в терминах паттерна называется вызывающий команды (invoker).
* Назовем его Switch и пусть он будет принимать в конструкторе переменные Command,
* которые будут использоваться в созданных методах flipUp() и flipDown().


public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand,Command flipDownCommand){
        this.flipUpCommand=flipUpCommand;
        this.flipDownCommand=flipDownCommand;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }
}
*/
