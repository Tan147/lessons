package com.tatiana.project.lesson10task;

public class Image implements Paintable{
    private String nameOfImage;
    private String file;


   @Override
    public void draw() {
       System.out.println(nameOfImage);
   }


}
