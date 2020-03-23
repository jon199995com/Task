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
            switch (scanner.nextLine()) {
                case ("Добавить ученика"): {
                    System.out.println("Введите по очереди: изучаемый предмет, имя, IQ, возраст");
                    String subject = scanner.nextLine();
                    String name = scanner.nextLine();
                    int iQ = scanner.nextInt();
                    int age = scanner.nextInt();
                    school.addStudies(iQ, subject, age, name);
                    break;
                }
                case ("Учиться"): {
                    System.out.println("Введите имя ученика, которого нужно учиться");
                    school.beTeach(scanner.nextLine());
                    break;
                }
                case ("Добавить учителя"): {
                    System.out.println("Введите по очереди: преподаваемый предмет, имя, возраст");
                    String subject = scanner.nextLine();
                    String name = scanner.nextLine();
                    int age = scanner.nextInt();
                    school.addTeachers(subject, age, name);
                    break;
                }
                case ("Начать урок"): {
                    school.start();
                    break;
                }
                case ("Закончить урок"): {
                    school.finish();
                    break;
                }
                case ("Посмотреть список учеников"): {
                    school.watchsstudies();
                    break;
                }
                case ("Сменить директора"): {
                    System.out.println("Назначьте нового директора!");
                    school.otheDirector(scanner.nextLine());
                    break;
                }
                case ("Вся информация о школе"): {
                    school.allInformathion();
                    break;
                }
                default: {
                    System.out.println("Такой команды нет");
                    break;
                }
            }
        }
    }
}

