package com.tatiana.project.lesson28;

public record Product
        (String name, int price, int count) {
}  //эти объекты считаются безопасными для потоков, т.к. св-ва файнал

/*
class Product {
    private final String name;
    private final int price;
    private final int count;

    public Product(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    // getters
    // toString
    // equals + hashCode
}*/