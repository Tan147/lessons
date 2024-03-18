package com.tatiana.project.lesson11.images;

public class Gallery implements Drawable {
    private String name;
    private Drawable[] drawables;

    public Gallery(String name, Drawable[] drawables) {
        this.drawables = drawables;
        this.name = name;
    }

    public Drawable[] getImages() {
        return drawables;
    }

    @Override
    public void draw() {
        System.out.println(name);
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    @Override
    public Gallery clone() {
        Drawable[] drawables01 = new Drawable[drawables.length];
        Gallery gallery = new Gallery(this.name, drawables01);
        for (int i = 0; i < drawables01.length; i ++){
            drawables01[i] = drawables[i].clone();
            //тоже самое через
            //gallery.drawables[i] = drawables[i].clone();
        }
        return gallery;
    }

}