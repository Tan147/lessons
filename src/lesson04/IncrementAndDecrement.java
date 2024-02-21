package lesson04;

import java.util.Scanner;

public class IncrementAndDecrement {
    public static void main(String[] args) {

        int b = 1;
        int result = b++ + ++b - b++ - b-- + ++b;
        //           1   +   3 - 3  -  4  +    4   это чему b равно, итого = 1
        System.out.println (result);

        // Пользователь вводит положительные целые числа.
        // Нужно найти их сумму.
       // import java.util.Scanner;  - это в самом начале написать

        Scanner scanner01 = new Scanner(System.in);
        System.out.println("Вводите положительные целые числа");
        //int in = scanner01.nextInt();  //здесь прога остановится и будет ждать ввода пользователя
        int userInput;
        int sum = 0;
        int counter = 0;  //количество введенных чисел
        int max = 0;
        double avg = 0; //среднее арифметическое
        while (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) > 0) {
            sum += userInput;
            counter += 1;
            if (userInput > max) max = userInput;

        }
        avg = (double) sum / counter; //если будет 0, будет проблема
        System.out.println(sum);
        System.out.println(counter);
        System.out.println(avg);


        // break continue  метки
         Scanner scanner02 = new Scanner(System.in);
        while (true) {           //жестко зафиксировано тру
            System.out.println("Введите целое положительное число или " +
                    "0 для выхода из программы");
            userInput = scanner02.nextInt();
            if (userInput == 0) {      // если пользователь введет 0
                break;             // выход из текущего цикла
            }
            if (userInput < 0) { // если пользователь введет отрицательное число
                continue; // переход на следующую итерацию к проверке условия
                // в круглых скобках
            }
            // инструкции будут выполнены,
            // если пользователь введет положительное число
            System.out.println(userInput * userInput);
        }


        // II. Цикл DO WHILE позволяет выполнять последовательность действий,
        //  пока проверяемое условие истинно.
        //  Первая итерация выполняется без проверки условия
        //  Далее условие проверяется до тела цикла.
        //  Чаще используется, когда число итераций (повторений) неизвестно
        // и первая итерация выполняется безусловно
        /*
        do {
            тело цикла - инструкции, которые необходимо выполнять,
            пока 'условие' истинно
        } while (логическое выражение / условие);
        */

       // Scanner scanner03 = new Scanner(System.in);
        // Пользователь должен вводить числа до тех пор,
        // пока число не будет находиться в диапазоне [9; 90)
        // от 9 (включая 9) до 90 (исключая 90)
        //int min = 9, max = 90;
        //int answer = 0;
        /*do {
            System.out.println("Введите число");
            if (scanner03.hasNextInt()) answer = scanner03.nextInt();
            else scanner03.next();
            //} while (!(answer >= min && answer < max));


        } while (answer < min || answer >= max);

        System.out.println("Ваше число принято");


        // III. FOR
        // for (; ;) {} // синтаксически правильный, это бесконечный цикл for
        // for (инициализация; условие; обновление) {
        //    тело цикла
        // }
        // инициализация - выполняется один раз при входе в цикл
        // условие - проверяется каждый раз перед выполнением тела цикла
        // обновление - выполняется после завершения тела цикла, перед проверкой условия
        // тело цикла выполняется, если условие истинно
        // Обычно используется, когда число итераций известно,

        // Известна цена за 1кг. яблок.
        // Нужно вывести цену за 1кг, 2кг, 3кг, 4кг, 5кг.
        */
        double price = 200; // за 1 кг.
        for (int quantity = 1; quantity <= 5; quantity++) {
            double currentPrice = quantity * price;
            System.out.println(quantity + "кг. " + " стоят " + currentPrice);
        }

        // Метки

        /*  name_of_loop: while ( условие ) {
            while ( условие ) {
                выход из текущего цикла
                if ( условие ) break;

                выход из цикла с именем name_of_loop
                if ( условие ) break name_of_loop;
            }
        }
        */

        // Строки
        String stringVar01 = "строка";
        String stringVar02 = "строка";
        stringVar02 = stringVar02.toUpperCase();  //"строка"
        // ==
        System.out.println(stringVar01.equals(stringVar02));
        String s = null;


    }
}
