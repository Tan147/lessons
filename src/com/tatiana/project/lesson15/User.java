package com.tatiana.project.lesson15;

import java.util.Objects;

public class User implements Comparable<User>{
    private int id;
    private String city;
    private int age;

    public User(int id, String city, int age) {
        this.id = id;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }


    //по возрастанию - каждый следующий больше
    //по неубыванию - каждый следующий либо равен, либо больше

       //определяет натуральный порядок сортировки
       // если < 0 this - меньше other, т.е. сначала this, потом other
       // если > 0 this - больше other, т.е. сначала other, потом this
       // усли == 0 this равен other

    /* или тернарный оператор:
    return this.id - other.id;
     */

       //или через Integer
       // return Integer.compare(this.id, other.id);

       //если идентификаторы равны, то считается меньшим поль-ль с меньшим возрастом
       //если возраст одинаковый, то сравнивать по городу поль-ля (по алфавиту в порядке возрастания)
       @Override
       public int compareTo(User other) { //будет сравнивать какой пользователь больше, чтобы положить его влево или вправо
           //определен id
           if (this.id < other.id) return -1;
           if (this.id > other.id) return 1;
           // return 0; - закоментила, т.к. для задачи дальше пишем
           if (this.id == other.id) {
               if (this.age < other.age) return -1;
               if (this.age == other.age) {
                   return this.city.compareToIgnoreCase(other.city);
               }
               return 1;
           }
           return 0;
       }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, age);
    }
}
