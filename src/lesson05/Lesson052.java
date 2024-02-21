package lesson05;

public class Lesson052 {
    public static void main(String[] args) {

        /*
        Дана строка, содержащая только буквы и цифры.
        Вывести информацию о том, является ли данная трока палиндромом.
         */
        String string01 = "15аба51";
        StringBuilder string02 = new StringBuilder(string01);
        string02.reverse();
        System.out.println(string02);

        if (string01.equals(string02)) System.out.println("палиндром");
        else System.out.println("не палиндром");


        /*
        Создать два массива целых чисел на 5 элементов каждый.
Массивы необходимо заполнять значениями в цикле.
Значения вводит пользователь с клавиатуры.

1. Если число отрицательное, добавить его в первый массив.
2. Если число положительное, добавить его во второй массив.
3. Программа завершает работу, когда оба массива заполнены или,
если пользователь ввёл 0
         */
        /*
        int len = 5;
        int[] arr01 = new int[len];
        int[] arr02 = new int[len];
        int index01 = 0;
        int index02 = 0;

        Scanner scanner = new Scanner(System.in);
        while (arr01[arr01.length-1] ==0 ||
                arr02[arr02.length-1] ==0) {
            int input = scanner.nextInt();
            if (input == 0) break;
            if (input < 0 && index01 < arr01.length) {
                arr01[index01] = input;
                index01++;

            } else if (index02 < arr02.length){
                arr02[index02] = input;
                index02++;
            }

        }

        System.out.println (arr01);
        System.out.println (arr02);
        */



        /*
        Строку, введенную пользователем, приводить к виду:
        первая заглавная, остальные маленькие.
        Пробелов в начале и конце строки быть не должно
         */

        /*
        Scanner input02 = new Scanner(System.in);
        String string03 = input02.nextLine().trim();
        String result01 = string03.substring(0,1).toUpperCase()+
                string03.substring(1).toLowerCase();
        System.out.println(result01);

        */



        /*
        Даны две строки, строки, содержащие только буквы английского алфавита.
        Вывести информацию о том, являются ли одна строка
        анаграммой другой строки.
         */
        /*

        String str01 = "abra";
        String str02 = "arab";
        char[] x = str01.toCharArray();
        char[] y = str02.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(Arrays.equals(x, y));

        int[] ints = new int[26];
        for (int i = 0; i < str01.length(); i++) {
            ints[str01.charAt(i)]++; //эта строка увеличивает на1, а следующая
            //уменьшает на 1, таким образом, если строки равны, то в массиве будут нули
            ints[str02.charAt(i)]--;

        }
        */


        /*
        Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
        добавлять их в массив (добавлять новое слово в массив можно только,
        если в нем его еще нет). В итоге в массиве будут только уникальные слова.
        Выход из программы по слову exit (слово 'exit' в массив не добавлять)
        или если массив заполнен. Перед завершением программы,
        вывести получившийся массив в консоль
         */

        /*
        Scanner s = new Scanner(System.in);
        int lenArr = s.nextInt();
        String[] words = new String[lenArr];
        while (words[words.length-1] == 0) {
            String w = s.nextLine();
            int input = scanner.nextInt();
            if (input == 0) break;
            if (input < 0 && index01 < arr01.length) {
                arr01[index01] = input;
                index01++;
        }



            } else if (index02 < arr02.length){
                arr02[index02] = input;
                index02++;
            }

        for (int index = 0; index < prices.length; index++) {
            System.out.println(words[index]);
            prices[index] += 10;
        }



        */



    }
}
