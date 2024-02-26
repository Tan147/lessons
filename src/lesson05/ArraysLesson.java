package lesson05;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        // Массив
        double[] prices = new double[5]; //массив на 5 элементов,
        // заполненный дефолтными значениями

        int[] temps = {45, 90, 122, 33, -3, 67}; //массив на 6 элементов,
        //заполненный пользовательскими значениями

        //Важно помнить, что в Java нумерация элементов массива начинается с 0.
        // Поэтому индекс первого элемента равен 0, а у последнего определяется размером массива минус один.

        System.out.println (temps[2]); // в идекс 2 обращаемся, выведет 122
        prices[1] = 10.6; //заменяем в индексе 1 число на 10,6

        // System.out.println (temps); хэш код объекта (с адресом в памяти джава не связано)

        //import java.util.Arrays;
        System.out.println(Arrays.toString(temps));
        System.out.println(temps.length); //длина 6

        // вывод в консоль последнего элемента массива
        System.out.println (temps[temps.length-1]);

        for (int index = 0; index < prices.length; index++) {
            System.out.println(prices[index]);
            prices[index] += 10;
        }

        //int[] temps = {45, 90, 122, 33, -3, 67}; перебрать в обратном порядке, если меньше 0, то сделать =0
        for (int index = temps.length - 1; index >= 0; index--) {
            if (temps[index] < 0){
                temps[index] = 0;
            }
            System.out.println(temps[index]);

        }

        //for (типДанных имяПеременной: массив){
        //}
        //здесь перебираем массив от 1 к последнего всегда строго последовательно
        //и изменить значение переменных тут нельзя
        for (int temp : temps) {
            System.out.println(temp);
        }
        for (double price : prices) {
            if (price > 100) {
                System.out.println(price);
                break;
            }
        }
        //найти сумму элементов массива temps = {45, 90, 122, 33, -3, 67};
        int sum = 0;
        for (int temp  : temps) {
            sum += temp;
            }
            System.out.println(sum);

        //функционал класса Arrays
        int[] ids = {3, 6, 8, 10, 22, 45}; //100
        System.out.println(Arrays.binarySearch(ids, 8));  //2
        System.out.println(Arrays.binarySearch(ids, 100));

        Arrays.sort(temps);  //отсортировать
        System.out.println(Arrays.toString(temps));

        String[] colors = {"red", "blue", null, "orange"};

        for (String color : colors) {
            if (color != null) System.out.println(color.toUpperCase());
        }

        //Создание копий
        int a = 9;
        int b = a;
        //a и значени 9
        //b 9, сама по себе от а
        //с ссылочным типом так нельзя

        //String[] colors = {"red", "blue", null, "orange"};
        //String[] newColors = colors;
        //colors -> {"red", "blue", null, "orange"} <- newColors, одна и таже сущность, ссылается на один и тот же массив

        String[] newColors01 = colors.clone(); //1 варинт копии. копия массива
        String[] newColors02 = Arrays.copyOf(colors, 2); //2 вариант копии, можно частично
        String[] newColors03 = new String[colors.length * 2]; //3 вариант, копия помещается в др имеющийся массив,
        // его нужно заранее подготовить
        System.arraycopy(colors, 0, newColors03, 1,3);
        //  [null, "red", "blue" , null, "orange, null]
        // System.arraycopy(). Этот метод принимает пять аргументов:
        // исходный массив, начальную позицию в исходном массиве,
        // целевой массив, начальную позицию в целевом массиве и
        // количество копируемых элементов.

        String[] colors01 = {"red", "blue", "orange"};
        String[] colors02 = {"red", "blue", "orange"};

        System.out.println(colors01.equals(colors01));
        System.out.println(Arrays.equals(colors01, colors02));













    }
}
