package com.tatiana.project.lesson10;

public class Boxes {
    private Boxes(){}
    public static final int MAX_BOX_LENGTH = 1000; //это константа
    public static final int MAX_BOX_WIDTH = 2000;
    public static final int MAX_BOX_HEIGTH = 1500;

    public static void halfBox(Box box){
        box.grow(-box.getHeight(), -box.getWidth(), -box.getLength());
    }
    public static Box compareBoxesByLength(Box box01, Box box02){
        if (box01.getLength() > box02.getLength()) return box01;
        return box02;
    }
}
