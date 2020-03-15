//todo Имеются две строки.
// Найти количество вхождений одной строки в другую.
package taskString3;

public class TaskString3 {
    public static void main(String[] args) {
        String str1 = "строка сы цуй строки строчка стр остров";
        String str2 = "строк";
        byte[] byteStr1 = str1.getBytes(); //Создаю массив байт из строки
        byte[] byteStr2 = str2.getBytes(); //Создаю массив байт из строки
        int numb = 0, numb2 = 0;//Два счетчика
        if (str1.length() < str2.length()) {
            for (int i = 0; i < byteStr2.length; i++) {
                if (byteStr2[i] == byteStr1[numb]) {// Если первая буква совпадает то увеличивает значение первого счетчика(считает кол-во совпавших подряд букв)
                    numb++;
                    if (numb == byteStr1.length) { //Если кол-во букв, которые совпали подряд равны длине первого слова, то счетчик кол-ва слов ув. на 1
                        numb2++;
                        numb = 0;
                    }
                } else numb = 0;//если буква не совпадают, то счетчик сбрасывается
            }
            System.out.println("Строка Str1 Входит в строку Str2 " + numb2 + " раз");
        } else {
            for (int i = 0; i < byteStr1.length; i++) {
                if (byteStr1[i] == byteStr2[numb]) {// Если первая буква совпадает то увеличивает значение первого счетчика(считает кол-во совпавших подряд букв)
                    numb++;
                    if (numb == byteStr2.length) { //Если кол-во букв, которые совпали подряд равны длине первого слова, то счетчик кол-ва слов ув. на 1
                        numb2++;
                        numb = 0;
                    }
                } else numb = 0;//если буква не совпадают, то счетчик сбрасывается
            }
            System.out.println("Строка Str2 Входит в строку Str1 " + numb2 + " раз");
        }
    }
}