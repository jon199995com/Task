package School;

import java.util.Arrays;
import java.util.Scanner;

public class School {
    Scanner scanner = new Scanner(System.in);
    private int count = 0;//Счетчик учеников
    private int teacherCount;//Счетчик учителей
    private String schoolName = "Школа";
    private Study[] studies = new Study[10];//Кол-во учеников
    private Teacher[] teachers = new Teacher[10];//кол-во Учителей
    private Manager director;//Директор, один единственный и всеми любимый

    public void newdirector(String name) {//Назначаем директора
        director = new Manager(50, name);
        System.out.println("Вы назначили директора: " + director.getName());
    }

    public School(String schoolName) {//Конструктор, сразу создаем имя школе
    }

    public void addStudies(int iq, String subject, int age, String name) {//Добавляем студентов
        if (studies.length > count) {//Если кол-во студентов меньше чем вмещаемость школы, то
//            int iq, String subject, int age, String name
            studies[count] = new Study(iq, subject, age, name);//Добавляем ученика
            count++;//Увеличиваем счетчик учеников
            System.out.println("Ученик добавлен");
        } else System.out.println("Учеников слишком много :(");
    }

    public void addTeachers(String subject, int age, String name) {//Добавляем учителей
        if (teachers.length > teacherCount) {
            //             String subject, int age, String name
            teachers[teacherCount] = new Teacher(subject, age, name);
            teacherCount++;
            System.out.println("Учитель добавлен");
        } else System.out.println("Учителей слишком много :(");
    }

    public void beTeach(String name) {//Если ученик хочет учиться, учим его!
        for (int i = 0; i < studies.length; i++) {
            if (studies[i] != null && name.equals(studies[i].getName())) {//Ищем ученика с заданным именем
                for (int j = 0; j < teachers.length; j++) {
                    if (teachers[j] != null && teachers[j].getSubjectToTeach().equals(studies[i].getSubject())) {//Ищем учителя с таким же предметом как и ученик
                        studies[i].beTeach();//Учим!
                        return;//Выходим из цикла
                    } else System.out.println("Нет преподавателя данного предмета");
                }
            } else System.out.println("Такого ученика нет");
        }
    }

    public void toTeach(String subject) {//Если начался урок по предмету
        for (int j = 0; j < teachers.length; j++) {
            if (teachers[j] != null && subject.equals(teachers[j].getSubjectToTeach())) {//Ищем учитлей преподающих этот предмет
                for (int i = 0; i < studies.length; i++) {
                    if (studies[i] != null && subject.equals(studies[i].getSubject())) {//Ищем учеников, которые учат этот предмет
                        teachers[j].teach(studies[i]);//Учим этих учеников
                    } else System.out.println("Учеников с таким предметом нет");
                }
                return;
            } else System.out.println("Нет учителей припадающих этот предмет");
        }
    }

    public void start() {//Директор объявляет о начале занятий
        director.start();
    }

    public void finish() {//Директор объявляет о конце занятий
        director.finish();
    }

    public void watchsstudies() {//Посмотреть список учеников
        System.out.println(Arrays.toString(studies));
    }

    public void otheDirector(String newName) {//Назначить другого директора
        this.director.setName(newName);
    }

    public void allInformathion() {//Вся информация о школе
        System.out.println("Школа: " + schoolName + "\nКол-во учащихся: " + count + "\nКол-во учителей: " + teacherCount);
    }
}
