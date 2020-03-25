package ferm;

import ferm.pet.Cat;
import ferm.pet.Chiken;
import ferm.pet.Cow;
import ferm.pet.Rabit;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(new Date().getTime());
        Ferma ferma = new Ferma();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные команды: \nдобавить кота\nдобавить корову\nдобавить курицу\nдобавить кролика");

        while (true) {
            switch (scanner.nextInt()) {
                case (1): {
                    System.out.println("Задайте name, вес, скорость");
                    String name = scanner.nextLine();
                    System.out.println("w");
                    int w = scanner.nextInt();

                    ferma.setRabits(new Rabit[]{
//                String name, int weight, int speed, int health, int resources
                            new Rabit(name, w, 4, 100, random.nextInt(10) + 1),
                    });
                    break;
                }
                case (2): {
                    System.out.println("Задайте name, вес, скорость");
                    ferma.setCats(new Cat[]{
                            //                String name, int weight, int speed, int health, int resources
                            new Cat(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), 100, random.nextInt(10) + 1)
                    });
                    break;
                }
                case (3): {
                    System.out.println("Задайте name, вес, скорость");
                    ferma.setCows(new Cow[]{
                            //                String name, int weight, int speed, int health, int resources
                            new Cow(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), 100, random.nextInt(10) + 1)
                    });
                    break;
                }
                case (4): {
                    System.out.println("Задайте name, вес, скорость");
                    ferma.setChikens(new Chiken[]{
                            //                String name, int weight, int speed, int health, int resources
                            new Chiken(scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), 100, random.nextInt(10) + 1)
                    });
                    break;
                }
                default:
                    System.out.println("Такой команды нет");

            }
        }
    }
}

