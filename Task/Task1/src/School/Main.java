package School;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название школы");
        Scanner scanner = new Scanner(System.in);
        School school = new School(scanner.nextLine());
        System.out.println("Как будут звать директора?");
        school.newdirector(scanner.nextLine());
        System.out.println("Вам доступны команды:");
        System.out.println("\"Добавить учителя\"");
        System.out.println("У учителя доступна команда - \"Учить ученика\"");
        System.out.println("\"Добавить ученика\"");
        System.out.println("У ученика доступна команда - \"Учиться\"");
        System.out.println("\"Сменить директора\"");
        System.out.println("У директора доступны команды - \"Начать урок\" \"; \"Закончить урок\"");
        System.out.println("\"Вся информация о школе\"");
        while (true) {
            if (scanner.nextLine().equals("Добавить ученика")) {
                System.out.println("Введите по очереди: изучаемый предмет, имя, IQ, возраст");
                String subject = scanner.nextLine();
                String name = scanner.nextLine();
                int iQ = scanner.nextInt();
                int age = scanner.nextInt();
                school.addStudies(iQ, subject, age, name);
            } else if (scanner.nextLine().equals("Учиться")) {
                System.out.println("Введите имя ученика, которого нужно учиться");
                school.beTeach(scanner.nextLine());
            } else if (scanner.nextLine().equals("Добавить учителя")) {
                System.out.println("Введите по очереди: преподаваемый предмет, имя, возраст");
                String subject = scanner.nextLine();
                String name = scanner.nextLine();
                int age = scanner.nextInt();
                school.addTeachers(subject, age, name);
            } else if (scanner.nextLine().equals("Начать урок")) {
                school.start();
            } else if (scanner.nextLine().equals("Закончить урок")) {
                school.finish();
            } else if (scanner.nextLine().equals("Посмотреть список учеников")) {
                school.watchsstudies();
            }
            else if (scanner.nextLine().equals("Сменить директора")) {
                System.out.println("Назначьте нового директора!");
                school.otheDirector(scanner.nextLine());
            }else if (scanner.nextLine().equals("Вся информация о школе")) {
                school.allInformathion();
            }
        }
    }
}

