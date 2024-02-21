package com.tatiana.project.lesson6.books;

public class Book {
    //идентификатор - обязат. св-во
    //название - обяз.св-во
    //количество страниц -
    //цена - обяз.св-во
    //авторы - массив
    private int id;
    private String title;
    private int numberOfPages;
    private int price;
    private Author[] authors; //Author это тип данных

    private Book(int id, String title, int price) {
        if (id <= 0)
            throw new IllegalArgumentException("id д.б. положительным");
        if (price <= 100)
            throw new IllegalArgumentException("price д.б. больше 100");
        if ("".equals(title))
            throw new IllegalArgumentException("title не может" +
                    " быть пустой строкой");
        this.id = id;
        this.price = price;
        this.title = title;

        /*
        if (id > 0) this.id = id;
        if (price > 100) this.price = price;
        if (title != null && !title.isEmpty())
            this.title = title;

        if (title != null && !title.equals(""))  //можно так проверка на то, чтобы не было пустой стркокой заполнено
            this.title = title;

        if (!"".equals(title)) // и такой вариант проверки, он лучше чем через equals
            this.title = title;

         */


        }

        //сеттеры

    public void setPrice(int price) {
        this.price = price;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    //геттеры для чтения
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }





}
