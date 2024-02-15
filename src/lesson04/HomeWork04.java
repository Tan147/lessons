package lesson04;
import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        /*
        Пользователь загадывает число в диапазоне от [1 до 100].
        Пользователь загадывает в уме, программа не хранит это число, а пытается его угадать.
        Программа пытается его угадать (вместо обычного перебора постарайтесь
        использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
        Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...?
        и, в зависимости от ответа пользователя, принимать решения.
        Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
        Для вывода текста и значения переменной используйте оператор сложения,
        например System.out.println("Число равно " + number);

        a = 1; b = 100; mid = (100 + 1) / 2
         */

        Scanner scanner01 = new Scanner(System.in);
        int userInput;
        int mid = 1;
        System.out.println("Загадайте положительное целое число от 1 до 100 включительно");
        for (int a = 1, b = 100; mid <= 100; b--) {
            mid = (b + 1) / 2;
            System.out.println("Загаданное число равно " + mid + "? Для ответа используйте числа 0 - НЕТ и 1 - ДА");
            while (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) >= 0) {
                if (userInput == 1) {
                    System.out.println("Я угадал! Загаданное число: " + mid);
                    break;
                } else if (userInput == 0) {
                    System.out.println("Загаданное число больше " + mid + " или меньше " + mid + "? Для ответа используйте числа 0 - если меньше и 1 - если больше");
                    while (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) >= 0 && mid <= 100 && mid >= 1) {
                        if (userInput == 0) {
                            mid = mid - ((mid + 1) / 2);
                            System.out.println("Загаданное число равно " + mid + "? Для ответа используйте числа 0 - НЕТ и 1 - ДА");

                        } else if (userInput == 1) {
                            while (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) >= 0 && mid <= 100 && mid >= 1) {
                                mid = mid + ((mid + 1) / 2);
                                System.out.println("Загаданное число равно " + mid + "? Для ответа используйте числа 0 - НЕТ и 1 - ДА");
                            }

                        } else {
                            System.out.println("Загаданное число больше " + mid + " или меньше " + mid + "? Для ответа используйте числа 0 - если меньше и 1 - если больше");

                        }

                        }
                } else {
                    System.out.println("Для ответа используйте числа 0 - НЕТ и 1 - ДА");
                }

            }

        }

        //int number, a = 1, b = 100;
        //int mid = (b + 1) / 2;
        /*
        System.out.println("Загадайте положительное целое число от 1 до 100 включительно");
        System.out.println("Загаданное число равно " + mid + "? Для ответа используйте числа 0 - НЕТ и 1 - ДА");
        while (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) >= 0) {
            if (userInput == 1) {
                System.out.println("Я угадал! Загаданное число: " + mid);
            } else {
                System.out.println("Загаданное число больше " + mid + " или меньше " + mid + "? Для ответа используйте числа 0 - если меньше и 1 - если больше");
                if (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) == 0 && mid != 0) {
                    mid = (mid + 1) / 2;
                    System.out.println("Загаданное число больше " + mid + "или меньше " + mid + "? Для ответа используйте числа 0 - если меньше и 1 - если больше");
                } else {
                    mid = (b - mid) / 2 + mid;
                    System.out.println("Загаданное число больше " + mid + "или меньше " + mid + "? Для ответа используйте числа 0 - если меньше и 1 - если больше");
                }
            }

    }

         */
    }
}
