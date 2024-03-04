package com.tatiana.project.lesson10task;

public class Image implements Paintable{
    private String nameOfImage;
    private String file;


   @Override
    public void draw() {
       System.out.println(nameOfImage);
   }

    // хранит данные об изображении, в т.ч ссылку на файл
    // функционал - метод отрисовки изображения (sout(название изображения))

}
