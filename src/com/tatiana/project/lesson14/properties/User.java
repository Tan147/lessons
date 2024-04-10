package com.tatiana.project.lesson14.properties;

// T компилируется в Object
public class User<T> { //объявление типа Generic, может использовать везде на уровне класса
    private T id;
    private String userName;

    public User(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
/*
class Admin extends User<Integer> {}    здесь Админ наследуется от класса дженерик с типом Айди Интеджер
Admin admin = new Admin(1);

class Admin<T> extends User<T> {}      здесь Админ типа дженерик и такого же деженерик типа ИД у пользователя
Admin<Integer> admin = new Admin<>(1);

class Admin<T, K> extends User<T> {
    private K code;
}
Admin<Integer, String> admin = new Admin<>(1);
*/