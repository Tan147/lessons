package lesson04;
import java.util.Scanner;

public class test {

        public static void main(String[] args) {

            Scanner scanner01 = new Scanner(System.in);
            int x = 7;
            System.out.println("Введите положительное целое число");
            int userInput;
            while (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) >= 0) {
                if (userInput == x) {
                    System.out.println("Вы угадали");
                    break;
                }
                if (userInput > x) {
                    System.out.println("загаданное число больше");
                } else {
                    System.out.println("загаданное число меньше");
                }
            }

            //Вывести на экран первые
            //10 элементов последовательности 2 4 6 8 10 и тд

            for (int b = 2; b <= 20; b+=2) {
                System.out.println(b);
            }

            for (int a = 1; a <= 6; a++) {
                for (int c = 1; c < a; c++){
                    System.out.print(c);
                }

                System.out.println(a);
            }



        }


            }

