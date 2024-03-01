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
    }
}
