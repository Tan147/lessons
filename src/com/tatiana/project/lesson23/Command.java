package com.tatiana.project.lesson23;

/*the Command interface
Создадим интерфейс с одним методом execute(), который будет выполнять и который называется в терминах паттерна "команда (command)"
*/

abstract public class Command {
   private String code;

   public Command(String code) {
      this.code = code;
   }

   public String getCode() {
      return code;
   }

   abstract void execute(Storage storage);
}