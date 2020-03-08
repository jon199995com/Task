//todo: Дан массив целых чисел. Массив не отсортирован, числа могут повторяться.
// Необходимо найти в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
// Например, 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7.
// Постарайтесь решить задачу наиболее оптимальным способом
package task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 6, 2, 42, 12, 12, -5, 32, 0};
        int result;
        Arrays.sort(mass);
        System.out.println("Два числа, сумма которых равна 7:");
        for (int i = 0; i < mass.length; i++) {
            result = 7 - mass[i];
            if (Arrays.binarySearch(mass, result) >= 0)
                    System.out.println(mass[i] + " " + mass[Arrays.binarySearch(mass, result)]);
        }
    }
}
