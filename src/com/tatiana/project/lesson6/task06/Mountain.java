package com.tatiana.project.lesson6.task06;

public class Mountain {

    private String mountain;
    private String country;
    private double height;

    public Mountain(String mountain, String country, double height) {
        if (mountain.length() < 4)
            throw new IllegalArgumentException("Название должно содержать не менее 4 символов");
        if (country.length() < 4)
            throw new IllegalArgumentException("Страна должна содержать не менее 4 символов");
        if (height < 100)
            throw new IllegalArgumentException("Высота должна быть не менее 100 метров");
        this.mountain = mountain;
        this.country = country;
        this.height = height;
    }
    public String getMountain() {
        return mountain;
    }
}
