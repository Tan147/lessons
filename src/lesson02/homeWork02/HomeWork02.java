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



    }
}
