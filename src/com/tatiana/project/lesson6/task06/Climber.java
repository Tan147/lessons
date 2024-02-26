package com.tatiana.project.lesson6.task06;

public class Climber {

    /*
    Задача 1. Описать объектную модель Альпинист, Гора, Группа для восхождения на гору.
    Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
    Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
    Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
    идёт набор в группу или нет;
    массив альпинистов;
    гора;
    должна быть возможность добавить альпиниста в группу (в массив), если набор ещё идёт
    В методе main (отдельного класса) создать:
            3 группы для восхождений на 3 различных горы.
    В первой группе 3 альпиниста (набор закрыт)
    Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)
    При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
    */

    private String climber;  //name
    private String address;

    public Climber(String climber, String address) {
        if (climber.length() < 3)
            throw new IllegalArgumentException("Имя должно содержать не менее 3 символов");
        if (address.length() < 5)
            throw new IllegalArgumentException("Адресс проживания должен содержать не менее 5 символов");
        this.climber = climber;
        this.address = address;
    }

    public void setClimber(String climber) {
        this.climber = climber;
    }
    public void setAddress(String address) {
        this.address = address;
    }

   public String getClimber() {
        return climber;
    }
    public  String getAddress() { return address; }




}
