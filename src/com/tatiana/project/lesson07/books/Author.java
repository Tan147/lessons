package com.tatiana.project.lesson07.books;

public class Author {
    // id имя email
    public int id;
    public String name;
    public String email;

    public Author(){
        System.out.println("Default author created");
    }

    public Author(int authorId){ //конструктор Author, переменная authorId с типом int
        // перемен. создается, потом удаляется, пока снова не обратяться к этому контсруктору
        id = authorId;
        System.out.println("Author created");
    }

    public Author(String authorName){
        name = authorName; //authorName это локальная переменная
        System.out.println("Author with name created");
    }

    public Author(int id, String name, String email){
       //id = id; //так локальная перменная затенила свойсво объекта, программа неверно понимает
        //тогда явно прописываем через this ссылку на текущий (локальный) объект
        this(name); //такой конструктор д.б. первым в инструкции, иначе ошибка
        this.id = id; //значению свойсва id присваиваем значение переменной id
        //this.name = name;
        this.email = email;
        System.out.println("Author with email created");
    }





}
