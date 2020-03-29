package ferm;

import ferm.pet.Cat;
import ferm.pet.Chiken;
import ferm.pet.Cow;
import ferm.pet.Rabit;
import ferm.wild.animal.*;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(new Date().getTime());
        Ferma ferma = new Ferma();
        OtherAnimal wildAnimal = new OtherAnimal();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        boolean steOneB = true;
        boolean stepThreeB = true;
        while (steOneB) {
            int stepOneI = 0;
            boolean stepTwoB = true;
            System.out.println("Доступные команды: \n1 - добавить домашнее животное\n2 - Добавить дикое животное\n3 - Начать день");
            stepOneI = scanner.nextInt();
            switch (stepOneI) {
                case (1): {
                    while (ferma.getMaxAnimal() < 10 && stepTwoB) {
                        System.out.println("Доступные команды: \n1 - добавить кролика  || 2 - добавить кота ||" +
                                "3 - добавить корову || 4 - добавить курицу || 5 - назад");
                        int stepTwoI = scanner1.nextInt();
                        switch (stepTwoI) {
                            case (1): {
                                System.out.println("Задайте name");
                                ferma.setRabits(new Rabit[]{
//                                      String name,        int weight,         int speed,      int health,     int resources
                                        new Rabit(scanner2.nextLine(), random.nextInt(3) + 1,
                                                random.nextInt(5) + 5, 100, 0),
                                });
                                break;
                            }
                            case (2): {
                                System.out.println("Задайте name");
                                ferma.setCats(new Cat[]{
                                        //                String name, int weight, int speed, int health, int resources
                                        new Cat(scanner2.nextLine(), random.nextInt(3) + 1,
                                                random.nextInt(20) + 10, 100, 0)
                                });
                                break;
                            }
                            case (3): {
                                System.out.println("Задайте name");
                                ferma.setCows(new Cow[]{
                                        //                String name, int weight, int speed, int health, int resources
                                        new Cow(scanner2.nextLine(), random.nextInt(100) + 100,
                                                random.nextInt(10) + 10, 100, random.nextInt(10) + 1)
                                });
                                break;
                            }
                            case (4): {
                                System.out.println("Задайте name");
                                ferma.setChikens(new Chiken[]{
                                        //                String name, int weight,  int speed, int health, int resources
                                        new Chiken(scanner2.nextLine(), random.nextInt(3) + 1, random.nextInt(5) + 5, 100,
                                                random.nextInt(10) + 1)
                                });
                                break;
                            }
                            case (5): {
                                stepTwoB = false;
                                break;
                            }
                            default:
                                System.out.println("Такой команды нет");
                        }
                    }
                    break;
                }
                case (2): {
                    while (wildAnimal.getCount() < 3) {
                        System.out.println("Доступные команды: \n1 - добавить медведя\n2 - добавить лису" +
                                "\n3 - добавить волка");
                        int stepTwoI = scanner1.nextInt();
                        switch (stepTwoI) {
                            case (1): {
                                System.out.println("Задайте name");
                                wildAnimal.setBears(new Bear[]{
                                        //                String name, int weight, int speed, int strong
                                        new Bear(scanner2.nextLine(), random.nextInt(400) + 100,
                                                random.nextInt(100) + 100, random.nextInt(10) + 1, 0)
                                });
                                break;
                            }
                            case (2): {
                                System.out.println("Задайте name");
                                wildAnimal.setFoxes(new Fox[]{
                                        //                String name, int weight, int speed, int strong
                                        new Fox(scanner2.nextLine(), random.nextInt(20) + 1,
                                                random.nextInt(10) + 20, random.nextInt(10) + 20, 0)
                                });
                                break;
                            }
                            case (3): {
                                System.out.println("Задайте name");
                                wildAnimal.setWolfs(new Wolf[]{
                                        //                String name, int weight, int speed, int strong
                                        new Wolf(scanner2.nextLine(), random.nextInt(100) + 50,
                                                random.nextInt(100) + 50, random.nextInt(15) + 5, 0)
                                });
                                break;
                            }
                            default:
                                System.out.println("Такой команды нет");
                        }
                    }
                    break;
                }
                case (3): {
                    // todo 1 Начало дня

                    if (ferma.getMan().getRes() < 2) {
                        System.out.println("У фермера не осталось ресурсов");
                        break;
                    }else System.out.println("У фермера " + ferma.getMan().getRes());
                    ferma.passDay(wildAnimal);//Реализация дня
                    break;
                }
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }
}