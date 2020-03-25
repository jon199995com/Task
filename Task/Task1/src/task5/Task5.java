//todo: Создать двумерный массив из 5 строк по 8 столбцов
// в каждой из случайных целых чисел из отрезка [-99;99].
// Вывести массив в консоль.
// После на отдельной строке вывести в консоль значение максимального элемента этого массива.
package task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] mass = new int[5][8];
        int max = 0;
        boolean bool = true;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int) (Math.random() * 198) - 99;
                while (bool) {
                    max = mass[0][0];
                    bool = false;
                }
                if (max < mass[i][j]) max = mass[i][j];
            }
        }
        System.out.println("Рандомный массив: ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("значение максимального элемента этого массива: " + max);
    }
}
