package com.tatiana.project.lesson10;

public class Lesson10 {
    public static void main(String[] args) {
        //Box box01 = new Box(12, 67, 20);
        Box box01 = Box.init2Box(10);

       /*
        Box box02 = new Box(30, 30, 30);
        Box box03 = new Box(100, 110, 120);

        box02.grow(2, 6, 9); //вызываем метод и увеличиваем значения свойств на указанные здесь
        box03.grow(10, 10, 10);
        ...подчеркнуты Box, т.к. сделали конструктор приватным, закомментила

        */




        Box.incNumberOfBoxes(); //вызвали метода через обращение к классу Бокс, метод увеличит значение
        Box.incNumberOfBoxes(); //метод еще увеличит значение
        Box.incNumberOfBoxes();  //и еще увеличит

        System.out.println(Box.getNumberOfBoxes());

        Orange orange01 = Orange.getOrange(true, 300);
        Orange orange02 = Orange.getOrange(false, 100);
        System.out.println(orange01 == orange02);  // проверяем ссылаются ли они на один и тот же объект, ответ нет
        System.out.println(orange02.getPrice());  // 300


    }
}
