//todo: Пользователь вводит с клавиатуры натуральное число большее 3,
// которое сохраняется в переменную n. Если пользователь ввёл не подходящее число,
// то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n]
// и вывести его на экран. Создать второй массив только из чётных элементов
// первого массива, если они там есть, и вывести его в консоль

package task4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner naturelNum = new Scanner(System.in);
        int num = naturelNum.nextInt();
        int time = 0, j = 0;
        while (true) {
            if (num > 3) {
                int[] mass = new int[num];
                for (int i = 0; i < mass.length; i++) {
                    mass[i] = (int) (Math.random() * num);
                    if (mass[i]%2 == 0) time++;
                }
                int[] copyMass = new int[time];
                for (int i = 0; i <mass.length ; i++) {
                    if (mass[i]%2 == 0) {
                        copyMass[j] =mass[i];
                        j++;
                    }
                }
                System.out.println("Рандомный массив: ");
                System.out.println(Arrays.toString(mass));
                System.out.println("Четные элементы рандомного массива: ");
                System.out.println(Arrays.toString(copyMass));
                break;
            } else {
                System.out.println("Повторите ввод:");
                num = naturelNum.nextInt();
            }
        }
    }
}
