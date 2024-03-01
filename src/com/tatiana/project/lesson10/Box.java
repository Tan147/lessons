package com.tatiana.project.lesson10;

public class Box {
    private static int numberOfBoxes;
    private int height;
    private int width;
    private int length;

    //static блок
    static {
        //инструкции выполняются 1 раз при загрузке класса в память
    }

    private Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void grow(int heightInc, int widthInc, int lengthInc){
        this.height += heightInc;
        this.width += widthInc;
        this.length += lengthInc;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    public /*final*/ static void incNumberOfBoxes(){//создали метод, который будет изменять значение статического свойства
        numberOfBoxes += 1;
    }  //final по умолчанию
    //нельзя обращаться к не статич.свойвам и нельзя вызывать не статич. методы
    public static int getNumberOfBoxes(){ //создали геттер, чтобы вернуть значение статич. свойства
        return numberOfBoxes;
    }

    public static Box init2Box(int value){
        return  new Box(value * 2, value * 2, value * 2);
    }
    public static Box randomBox(){
        return  new Box(23, 67, 12);
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                "}";
    }
}

    interface SomeInterface{
        /*public final static*/
        String value = "Строка";

        /*public final*/
        static void printString(){
            System.out.println(value);
            // value = ""
        }

    }

    abstract class Unit{
    //фабричный метод
    public static Unit createUnit(String unitType){
        if ("knight".equalsIgnoreCase(unitType)) return new Knight();
        if ("infantry".equalsIgnoreCase(unitType)) return new Infantry();
        throw new IllegalArgumentException();
    }
}

class Knight extends Unit {}
class Infantry extends Unit {}


