package com.tatiana.project.lesson23.Task23;

// хранимый объект
public record Apple(
        long id,
        String color,
        double weight) {
    // color()
    // id()
    // weight()
}

//хранение яблок в памяти
//получить все яблоки
//получить яблоко по идентификатору
//добавить яблоко
//удалить яблоко (по методу equals)

//хранение яблок в файле
//получить все яблоки
//получить яблоко по идентиф
//добавить яблоко
//удалить яблоко (по методу equals)

// List<String> stringList = Files.readAllLines(Paths.get("filename.txt"));
