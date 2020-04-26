package genericHomework;

import java.util.Scanner;

/*todo Дано
        1.  enum должностей Position,
    2.  класс User со следующими полями:
            String fulName;
            int salary;
            Position position;
            3. несколько массивов, в каждом массиве будут храниться объекты класса User
            с одинаковыми должностями

            todo Пользователь вводит свои имя, фамилию и первую букву должности.
            todo Ваша задача создать объект типа User и поместить его в соответствующий массив.*/
public class Main {
    public static void main(String[] args) {
        User[] usersManager = new User[10];
        int countM = 0;
        User[] usersDirector = new User[10];
        int countD = 0;
        User[] usersLawyer = new User[10];
        int countL = 0;
        Scanner scanner = new Scanner(System.in);


        while (countD < 10 || countL < 10 || countM < 10 ) {
            String string = scanner.nextLine();
            String[] stringsSplit = string.split(" ");
            if (stringsSplit.length == 2) {
//                System.out.println("Все ок, длинна строки = 3");
                char first = stringsSplit[1].charAt(0);
//                System.out.println(first);
                if (first == 'M') {
                    usersManager[countM] = new User(stringsSplit[0], Position.MANAGER);
                    System.out.println(usersManager[countM]);
                    countM++;
                }else if (first == 'D') {
                    usersDirector[countD] = new User(stringsSplit[0], Position.DIRECTOR);
                    System.out.println(usersDirector[countD]);
                    countD++;
                }
                else if (first == 'L') {
                    usersLawyer[countL] = new User(stringsSplit[0], Position.LAWYER);
                    System.out.println(usersLawyer[countL]);
                    countL++;
                }

            } else {
                System.out.println("Длинна строки не равна 2");
            }
        }
    }
}

enum Position {
    MANAGER, DIRECTOR, LAWYER // элементы enum - объекты типа Position
}

