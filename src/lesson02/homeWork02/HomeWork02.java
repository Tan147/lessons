package lesson02.homeWork02;

public class HomeWork02 {
    public static void main(String[] args) {
        int letters;
        int lettersSent;
        letters = 15;
        lettersSent = 10;
        var lettersUnsent = letters - lettersSent;
        System.out.println("Осталось отправить писем: " + lettersUnsent);

        double time = 2;
        double distance = 300;
        double speed = (distance * 1000) / (time * 3600);
        System.out.println("speed: " + speed);

        var number = 5 + 7;
        System.out.println(number);

        int x = 100;
        int y = 45;
        System.out.println(x = y);

        System.out.println(33%2);

        /*
        Какой тип у doubleResult01 и почему?       - тип double, потому что в правой части явно указываем double
        Чему равно значение doubleResult01 и почему?   - равно 1,0, потому что деление взято в скобки, делится тип int
        на тип int, и результат деления будет 1 целое число, и оно приводится к типу double, получается 1,0

        int num01 = 3;
        int num02 = 2;
        int result = num01 / num02;
        var doubleResult01 = (double) (num01 / num02);
         */

        int num01 = 3;
        int num02 = 2;
        int result = num01 / num02;
        var doubleResult01 = (double) (num01 / num02);
        System.out.println(doubleResult01);

        /*

         */



    }
}
