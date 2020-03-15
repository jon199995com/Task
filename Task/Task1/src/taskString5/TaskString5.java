//todo Пользователь вводит названия городов через пробел.
// Вы их присваиваете переменной.
// Переставьте названия так, чтобы они были упорядочены по алфавиту.
package taskString5;

import java.util.Arrays;
import java.util.Scanner;

public class TaskString5 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String[] strSplit = str1.split(" ");// Делим строку на массив строк
        for (int i = 0; i < strSplit.length; i++) {//Сортировка пузырьком, сравниваем первый байты слов и сортируем слова
            for (int j = 1; j < strSplit.length; j++) {// Сделал только для кириллицы, т.к. я ленивый :(
                byte[] byteSplit2 = strSplit[j - 1].getBytes();
                byte[] byteSplit1 = strSplit[j].getBytes();
                if (byteSplit2[1] > byteSplit1[1]) {//Сравниваем первые байты называний русских городов и меняем местами
                    str1 = strSplit[j];
                    strSplit[j] = strSplit[j-1];
                    strSplit[j-1] = str1;
                }
            }
        }
        System.out.println(Arrays.toString(strSplit));
    }
}
