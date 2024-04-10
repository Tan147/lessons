package com.tatiana.project.lesson15.task15;

import java.util.Objects;

// содержит информацию о фруктах,
// которые будут добавляться на склад
public class FruitToStorageInfo {
    private final FruitType type;
    private double price; // за один фрукт
    private int count; // количество добавляемых фруктов

    // конструктор, принимающий значения всех свойств + проверки
    public FruitToStorageInfo(FruitType type, double price, int count) {
        if (price <= 0 || count <= 0) throw new IllegalArgumentException();
        this.type = type;
        this.price = price;
        this.count = count;
    }

    // доступные геттеры и сеттеры

    public FruitType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // equals + hashCode + toString


     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FruitToStorageInfo fruitToStorageInfo = (FruitToStorageInfo) o;
        return type == fruitToStorageInfo.type && price == fruitToStorageInfo.price && count == fruitToStorageInfo.count;
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(type, price, count);
    }
    */
    public int hashCode() {
        int result = type == null ? 0 : type.hashCode();
        result = (int) (result + price + count);
        return result;
    }


    @Override
    public String toString() {
        return "FruitToStorageInfo{"
                + "type = '" + type + '\''
                + ", price = " + price
                + ", count = " + count
                + '}';
    }


    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;
    }
}