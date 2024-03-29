package com.tatiana.project.lesson6;

import com.tatiana.project.lesson07.books.Author;
import com.tatiana.project.lesson07.books.Book;

public class Lesson06 {
    public static void main(String[] args) {
        Author author01 = new Author(1); //создали объект
        //author01.id = 1;
        author01.name = "Ольга";
        author01.email = "olga@gmail.com";
        System.out.println(author01.name);

        Author author02 = new Author(2); //это уже другой объект
        Author author03 = new Author("Макар");
        Author author04 = new Author(3, "Саша", "sasha@gmail.com");

        Book book01 = new Book(1, "JDK21", 100);
        book01.setNumberOfPages(132);
        book01.setPrice(200);
        int id = book01.getId();
        System.out.println(book01.getId());
        System.out.println(book01.getPrice());


        /*
        Flower flower = new Flower(1, "азалия");
        Bucket bucket = new Bucket(3);
        bucket.addFlower(flower);
        bucket.getFlowers()[0].setName("роза");
        // Flower[] -> Flower
        // bucket.getFlowers()[0] = null;
        for (Flower bucketFlower : bucket.getFlowers()) {
            bucketFlower.setId(10);
        }
        */

        // public class в файле м.б только один
        // имя класса == имя файла

        // не public классов в файле
        // может быть сколько угодно,
        // их видно только внутри текущего пакета

    }
}
