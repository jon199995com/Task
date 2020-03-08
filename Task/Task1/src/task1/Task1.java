
//todo: Найти наибольший общий делитель (НОД) двух чиселpackage task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner newNum = new Scanner(System.in);
        int newNum1 = newNum.nextInt();
        int newNum2 = newNum.nextInt();
        int result = 0;
        int del = 1;
        while (true) {
            if (newNum1 % del == 0)
                if (newNum2 % del == 0)
                    result = del;
            if (del == newNum1 || del == newNum2) {
                System.out.println("Наибольший общий делитель чисел " + newNum1 + " " + newNum2 + ": " + result);
                break;
            }
            del++;
        }
    }
}
