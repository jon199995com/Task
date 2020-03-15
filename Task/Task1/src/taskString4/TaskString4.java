//todo Написать функцию, которая проверяет, является ли строка палиндромом.
// Палиндром — это слово или фраза,
// которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
package taskString4;

import java.util.Arrays;

public class TaskString4 {
    public static void main(String[] args) {
        String str = "popopop";
        System.out.println(fnc(str));
    }

    public static boolean fnc(String str) { //Функ-ия сравнивающая буква с разных концов слова, пока не дойдут до середины
        byte[] byteStr = str.getBytes();
        int left = 0;
        int right = byteStr.length - 1;
        while (left < right) {
            if (byteStr[right] != byteStr[left]) {
                return false;
            } else {
                right--;
                left++;
            }
        }
        return true;
    }
}
