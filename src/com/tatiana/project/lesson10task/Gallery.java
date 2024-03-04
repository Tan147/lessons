package com.tatiana.project.lesson10task;

public class Gallery implements Paintable{
    private String title;
    private Paintable[] paintables;

    @Override
    public void draw() {
        System.out.println(title);
        for (Paintable paintable : paintables) {
            paintable.draw();
        }

        // галерея изображений
        // Хранит массивом отдельные изображения, галереи, галереи и отдельные изображения
        // Функционал - метод отрисовки элементов галереи
        // (sout(название галереи))
        // (sout(название изображений))
    }
}
