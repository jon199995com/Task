//todo: Заполните массив на N элементов случайным числами и выведете максимальное, минимальное и среднее значение.
package task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] mass = new int[6];
        int[] resultMas = new int[3];
        boolean bol = true;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
            while (bol) {
                resultMas[0] = mass[i];
                bol = false;
            }
            if (resultMas[0] > mass[i]) resultMas[0] = mass[i];
            if (resultMas[1] < mass[i]) resultMas[1] = mass[i];
            resultMas[2] += mass[i];
            if (i == mass.length - 1) {
                resultMas[2] /= mass.length;
                System.out.println("Рандомный массив: " + Arrays.toString(mass));
                System.out.println("Минимальное значение: " + resultMas[0]+"\nМаксимальное значение: " + resultMas[1]+"\nСреднее значение: " + resultMas[2]);
            }
        }
    }
}
