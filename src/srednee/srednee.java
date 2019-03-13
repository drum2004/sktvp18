package srednee;
import java.util.Arrays;
public class srednee {
    public static void main(String[] args) {

        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 100) + 1;
            if (a % 2 == 0) {
                mas[i] = a;
            } else {
                mas[i] = a + 1;
            }

        }

        System.out.println("Массив из 20 случайных чётных целых чисел - " + Arrays.toString(mas) + "\n");

        int count = mas.length;
        System.out.println("Длина массива - " + count + " " + "элементов" + "\n");

        Arrays.sort(mas);
        System.out.println("Отсортированный массив из 20 случайных чётных целых чисел - " + Arrays.toString(mas) + "\n");

        int min = mas[0];
        int max = mas[count - 1];

        System.out.println("Минимальное значение элементов массива - " + min + "; максимальное значение элементов массива - " + max + "\n");

        int allSum = 0;
        for (int i = 0; i < 20; i++) {
            allSum += mas[i];
        }
        System.out.println("Сумма всех чисел массива - " + allSum + "\n");

        int sum = allSum - (min + max);
        System.out.println("Сумма чисел массива без учёта минимального и максимального значения элементов - " + sum + "\n");

        int x = sum / 18;
        System.out.println("Целое среднее арифметическое значение элементов массива - " + x + "\n");

        double y = (double) sum / 18;
        System.out.println("Дробное среднее арифметическое значение элементов массива - " + y + "\n");

    }

}
