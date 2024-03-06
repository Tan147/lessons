package com.tatiana.project.lesson11;

import com.tatiana.project.lesson11.images.Drawable;
import com.tatiana.project.lesson11.images.Editor;
import com.tatiana.project.lesson11.images.Gallery;
import com.tatiana.project.lesson11.images.Image;

public class Task11 {
    public static void main(String[] args) {
        Image treeImage = new Image("tree.png");
        Image grassImage = new Image("grass.png");
        Image lakeImage = new Image("lake.png");

        Image foxImage = new Image("fox.png");

        Gallery forestGallery = new Gallery("Forest", new Drawable[]{treeImage, grassImage, lakeImage});
        Gallery forestAndAnimalGallery = new Gallery("Forest and Animal", new Drawable[]{forestGallery, foxImage});

        Editor editor = new Editor(forestAndAnimalGallery);


    }
}