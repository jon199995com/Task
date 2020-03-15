//todo Даны 2 слова, состоящие из четного числа букв.
// Получить слово состоящее из первой половины первого слова и второй половины второго слова.
package taskString1;

import java.util.Arrays;

public class Task1Strings {
    public static void main(String[] args) {
        String str1 = "good";//задали два слова из четного кол-ва букв
        String str2 = "teacher!";
        if (str1.compareTo(str2) != 0) ;
        {
            byte[] bytestr1 = str1.getBytes();
            byte[] bytestr2 = str2.getBytes();//Создаю массив байтовый на основе строки
            if (str1.length() > str2.length()) { //Если первое слово длинне второго, то будем записывать в него новое слово
                for (int i = 0; i < bytestr1.length / 2; i++) {
                    bytestr1[bytestr1.length / 2 + i] = bytestr2[i];
                }
                System.out.println(str1 = new String(bytestr1));
            }
           else  {//Если второе слово длинне первого, то будем записывать в него новое слово
                for (int i = 0; i < bytestr2.length / 2; i++) {
                    bytestr2[bytestr2.length / 2 + i] = bytestr1[i];
                }
                System.out.println(str2 = new String(bytestr2));
            }
        }
    }
}
