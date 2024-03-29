package com.tatiana.project.task06;

import com.tatiana.project.lesson08.Unit;

public class Task06 {
    public static void main(String[] args) {
        /*
        В методе main (отдельного класса) создать:
        3 группы для восхождений на 3 различных горы.
        В первой группе 3 альпиниста (набор закрыт)
        Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)
        При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
        */


        Climber climber01 = new Climber("Vasya", "Moscow");
        //System.out.println(climber01.getClimber());
        Climber climber02 = new Climber("Ivan", "Kasan");
        Climber climber03 = new Climber("Petr", "Saint-Petersburg");
        Climber climber04 = new Climber("Foma", "Moscow");
        Climber climber05 = new Climber("Alex", "Novosibirsk");
        Climber climber06 = new Climber("Petya", "Adler");
        Climber climber07 = new Climber("Fedor", "vladivostok");

        Mountain mountain01 = new Mountain("Alps", "Switzerland", 1000);
        Mountain mountain02 = new Mountain("Elbrus", "Russia", 500);
        Mountain mountain03 = new Mountain("Kazbek", "Georgia", 200 );

        /*String[] climbers01 = new String[3];
        String[] climbers02 = new String[2];
        String[] climbers03 = new String[2];*/

        Climber[] climbers01 = new Climber[3];
        Climber[] climbers02 = new Climber[2];
        Climber[] climbers03 = new Climber[2];
        climbers01[0] = climber01;
        climbers01[1] = climber02;
        climbers01[2] = climber03;
        boolean groupEnrollmentIsOpen01 = false;


        climbers02[0] = climber04;
        climbers02[1] = climber05;
        boolean groupEnrollmentIsOpen02 = true;

        climbers03[0] = climber06;
        climbers03[1] = climber07;
        boolean groupEnrollmentIsOpen03 = true;




    }
}
