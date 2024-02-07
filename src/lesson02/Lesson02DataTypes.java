package lesson02;

//однострочный комментарий
/*
многострочный
комментарий
 */
public class Lesson02DataTypes {
    public static void main(String[] args) {
        System.out.println("Вывод данных в консоль");

        //Объявление переменных
        //типДанных имяПеременной;
        int userAge;
        int width, height;

        //инициализация переменной
        userAge = 79;
        width = 100;
        height = 187;

        //переопределили значение
        userAge = 80;

        //инициализация в момент объявления
        int numberOfColors = 3;
        int numberOfFruits = 10, numberOfVegetables = 11;

        byte byteFromFile = 56;
        short numberOfLessons = 150;
        long millis = 334, age = 8_000_000_000L;
        float temp = 35.88F; // или 35.88f
        double maxTemp = 335.88;

        //объявление переменных через var
        var classVersion = 10;  //int
        var bigValue = 10L;  //если хотим явно указать тип long
        var count = (short) 358;  //short
        var readByte = (byte) 100;  //byte
        var balance = 100.5;  //double
        var numberOfHours = 15.6F; // float
        var isActive = true; //boolean

        isActive = false;
        System.out.println(isActive);

        int int01 = 10;
        int zeroInt = 0;
        //целочисленное деление на ноль - исключение времени выполнения
        //java.lang.ArithmeticException
        // System.out.println(int01 / zeroInt);

        double double01 = 10.0;
        double zeroDouble = 0.0;
        //деление чисел с плавающей точкой на ноль - бесконечность или минус бесконечность, но работать не сможем
        //Infinity
        System.out.println(double01 / zeroDouble);

        //результат целочисленного деления -
        //целое число, остаток будет отброшен
        int num01 = 3;
        int num02 - 2;
        int result = num01 / num02;

        // при необходимости сохранения остатка
        // один из операндов приводится в double или float
        double doubleResult = (double) num01 / num02;

        /*
        var doubleResult01 = (double) (num01 / num02);
        какой тип у doubleResult01?
        чему равно значение doubleResult01?
         */

        //результат арифметических операций с byte и short
        //всегда повышается до int
        //результат вычислений всегда повышается до типа наибольшего операнда
        // byte - short - int - long - float - double

        //приведение типов
        // автоматическое
        byte byteValue = 1;
        int intValue = byteValue;

        // явное (тип)
        short shortValue = (short) intValue;









    }
}
