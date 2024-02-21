package lesson05;
import java.util.Arrays;
public class HomeWork05 {

    public static void main(String[] args) {

        //Отсортировать массив пузырьковой сортировкой
        int[] a = {5, 8, 1, 6, 2};
        boolean isSorted = false;
        int b;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;
                    b = a[i];
                    a[i] = a[i+1];
                    a[i+1] = b;
                }
            }
        }
        System.out.println(Arrays.toString(a));




        //Дан массив целых чисел: int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44}.
        // Найти максимальную сумму четырёх смежных целых чисел в массиве task02.
        // Использовать алгоритм скользящего окна.
        int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44};
        int maxSum = 0;
        int sum = 0;

        for (int r = 0, l = 0; r < task02.length; r++) {
            sum += task02[r];
            if (r > 3 && l < 6) {
                sum -= task02[l];
                l++;

            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);

    }
}

