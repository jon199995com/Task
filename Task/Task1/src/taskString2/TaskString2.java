//todo Найдите самое длинное слово в предложении, при условии,
// что в предложении все слова разной длины.

package taskString2;

import java.util.Arrays;

public class TaskString2 {
    public static void main(String[] args) {
        String str = "Оно работает, я не знаю почему";
        System.out.println(str.trim());//Удаляем пробелы в начале и в конце предложния, т.к. они будут разделителями
        String[] allLitleWords = str.split(" ");//Создаем массив строк разделенных пробелами
        for (int i = 1; i < allLitleWords.length; i++) {
            if (allLitleWords[i].length() < allLitleWords[i - 1].length()) {//Сравниваем длину двух слов в массиве и сохраняем ссылку на самое короткое
                str = allLitleWords[i];
            }
        }
        System.out.println(str);//Вывод самого короткого слова в предложении
    }
}
