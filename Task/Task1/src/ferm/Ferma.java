package ferm;

import ferm.man.FermerMan;
import ferm.pet.*;
import ferm.wild.animal.OtherAnimal;

import java.util.Date;
import java.util.Random;

public class Ferma implements Cloneable {
    private Pet[] allPets = new Pet[10];//Массив со всеми домашними питомцами
    private Cat[] cats = new Cat[10];
    private Chiken[] chikens = new Chiken[10];
    private Cow[] cows = new Cow[10];
    private Rabit[] rabits = new Rabit[10];
    private FermerMan man = new FermerMan();
    private int maxAnimal = 0;//счетчик домашних животных
    private boolean isSomeoneIsLive = true;//Есть ли живые питомцы,которые могут давать ресурсы
    Random random = new Random(new Date().getTime());

    public void passDay(OtherAnimal enemy){
        // todo 1 Начало дня
        getMan().setRes(getMan().getRes() - 2);
        // todo 2 Приходит дикое животное
        int randPet = 0;
        int randWildAnimal = 0;

        while (whoIsLive()) {//Ищем живое домашенее животное
            randPet = random.nextInt(getMaxAnimal());
            if (getAllPets()[randPet].isLive()) {
                break;//если есть живой питомец, то рандомим пока он не найдется
            }
        }
        while (enemy.whoIsHere()) {//Ищем ДЖ, которого еще не прогнали 4раза
            randWildAnimal = random.nextInt(enemy.getCount());
            if (enemy.getWildAnimals()[randWildAnimal].getGoAway() < 3
                    && enemy.getWildAnimals()[randWildAnimal] != null) break;//рандомим пока не найдем его
        }
        if (whoIsLive() && enemy.whoIsHere()) {//Если есть дикое животное и хотяб один питомец
            System.out.println("На питомцев напал(а)" + enemy.getWildAnimals()[randWildAnimal].getName());
            if (random.nextBoolean()) {//рандомно прогонит ли фермер дикое животное
                enemy.getWildAnimals()[randWildAnimal]
                        .setGoAway(enemy.getWildAnimals()[randWildAnimal].getGoAway() + 1);//Прогоняем животное
//                System.out.println(enemy.getWildAnimals()[randWildAnimal].getName()+" Прогнали "+enemy.getWildAnimals()[randWildAnimal].getGoAway()+" раза ");
                System.out.println("Но фермер прогнал его!");
            } else if (enemy.getWildAnimals()[randWildAnimal].getSpeed() < getAllPets()[randPet].getSpeed()) {
                //не пронал, но если Питомец быстрее, то он убегает
                System.out.println("Фермер не прогнал животное, но питомец убежал");
            } else if (random.nextBoolean()) {//Если питомец не убежал, то ДЖ рандомно или ранит или убивает питомца
                getAllPets()[randPet]//ранил
                        .setHealth(getAllPets()[randPet].getHealth() - enemy.getWildAnimals()[randWildAnimal].getStrong());
                if (getAllPets()[randPet].getHealth() < 0) {//Ранил, и убил
                    getAllPets()[randPet].setLive(false);
                    System.out.println("Животное забили");
                } else
                    System.out.println("Животное " + getAllPets()[randPet].getName() + " было ранено животным:"//Просто ранил, животное выжило
                            + enemy.getWildAnimals()[randWildAnimal].getName());
            } else {//Животное съели
                getAllPets()[randPet].setLive(false);
                System.out.println("Животное съели!");
            }
        }
        //todo 3 - Фермер кормит всех животных (животные восполняют здоровье)
        feedPets();
        //todo 4 - Фермер собирает ресурсы с животных, с которых можно их собирать.
        // Если таких не осталось, съедает животное, пригодное в пищу (если такие остались).
        eatPet();
        takeRes();
        System.out.println("Собрали ресурсы с животных, которые могут давать");
        whoIsLive();
    }

    public void takeRes() {//Фермер собирает ресурсы
        for (int i = 0; i < getMaxAnimal(); i++) {//Перебираем всех питомцев
            if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof Givresurces) //если питомец есть
                // и он живой и он может давать ресурсы
                {
                getMan().setRes(getMan().getRes() + getAllPets()[i].getResources());//Фермер собирает ресурсы
//                getAllPets()[i].setResources(0);
            }
        }
    }

    public boolean whoIsLive() {//Есть ли живые питомцы, которые могут довать ресурсы
        for (int i = 0; i < getMaxAnimal(); i++) {
            //если питомец есть и он живой и он может давать ресурсы
            if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof Givresurces)
            {
                return true;
            }
        }
        return false;
    }

    public void eatPet() {//Фермер ест животное
        setSomeoneIsLive(true);
        for (int i = 0; i < getMaxAnimal(); i++) {
            //Если питомец есть и он живой и он может давать ресурсы
            if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof Givresurces) {
                setSomeoneIsLive(false);
            }
        }
        if (isSomeoneIsLive()) {//если нет живых питомцев,которые могут давать рес
            for (int i = 0; i < getMaxAnimal(); i++) {
                //если питомец есть и он живой и он может быть съеден фермером
                if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof CanBeEatenFermerMan)
                {
                    getMan().setRes(getMan().getRes() + getAllPets()[i].getWeight());//фермер ест и получает ресурсы равные его весу
                    getAllPets()[i].setLive(false);//питомец мертв
                    System.out.println("Был съеден фермером "+ getAllPets()[i].getName());
                    break;
                }
            }
        }
    }

    public void feedPets() {//кормим питомцев
        for (int i = 0; i < getMaxAnimal(); i++) {
            //если питомец жив и его хп меньше максимума
            if (getAllPets()[i].isLive() && getAllPets()[i].getHealth() < 100) getAllPets()[i].getAddHealth(getMan());//добавляем хп животному
        }
    }

    public boolean isSomeoneIsLive() {
        return isSomeoneIsLive;
    }

    public void setSomeoneIsLive(boolean someoneIsLive) {
        isSomeoneIsLive = someoneIsLive;
    }

    public int getMaxAnimal() {
        return maxAnimal;
    }

    public void setMaxAnimal(int maxAnimal) {
        this.maxAnimal = maxAnimal;
    }

    public void setRabits(Rabit[] rabits) {//добавляем кролика
        if (getAllPets()[getMaxAnimal()] == null && getMaxAnimal() < 10) {//если место есть и животных меньше 10
            this.rabits = rabits;//создаем кролика
            System.arraycopy(getRabits(), 0, getAllPets(), getMaxAnimal(), 1);//копируем кролика в массив с питомцами
//                                                                      int weight,         int speed, int health, int resources
            System.out.println("Добавлен кролик: имя - " + getAllPets()[getMaxAnimal()].getName() + " вес - " +
                    getAllPets()[getMaxAnimal()].getWeight() + " скорость = " +
                    getAllPets()[getMaxAnimal()].getSpeed() + " ресурсы - " + getAllPets()[getMaxAnimal()].getResources());
            setMaxAnimal(getMaxAnimal() + 1);//счетчик кол-ва питомцев
        }
    }

    public void setCats(Cat[] cats) {
        if (getAllPets()[getMaxAnimal()] == null && getMaxAnimal() < 10) {
            this.cats = cats;
            System.arraycopy(getCats(), 0, getAllPets(), getMaxAnimal(), 1);
            System.out.println("Добавлен кот: имя - " + getAllPets()[getMaxAnimal()].getName() + " вес - " +
                    getAllPets()[getMaxAnimal()].getWeight() + " скорость = " +
                    getAllPets()[getMaxAnimal()].getSpeed() + " ресурсы - " + getAllPets()[getMaxAnimal()].getResources());
            setMaxAnimal(getMaxAnimal() + 1);
        }
    }

    public void setChikens(Chiken[] chikens) {
        if (getAllPets()[getMaxAnimal()] == null && getMaxAnimal() < 10) {
            this.chikens = chikens;
            System.arraycopy(getChikens(), 0, getAllPets(), getMaxAnimal(), 1);
            System.out.println("Добавленна курица: имя - " + getAllPets()[getMaxAnimal()].getName() + " вес - " +
                    getAllPets()[getMaxAnimal()].getWeight() + " скорость = " +
                    getAllPets()[getMaxAnimal()].getSpeed() + " ресурсы - " + getAllPets()[getMaxAnimal()].getResources());
            setMaxAnimal(getMaxAnimal() + 1);
        }
    }

    public void setCows(Cow[] cows) {
        if (getAllPets()[getMaxAnimal()] == null && getMaxAnimal() < 10) {
            this.cows = cows;
            System.arraycopy(getCows(), 0, getAllPets(), getMaxAnimal(), 1);
            System.out.println("Добавлена корова: имя - " + getAllPets()[getMaxAnimal()].getName() + " вес - "
                    + getAllPets()[getMaxAnimal()].getWeight() + " скорость = " +
                    getAllPets()[getMaxAnimal()].getSpeed() + " ресурсы - " + getAllPets()[getMaxAnimal()].getResources());
            setMaxAnimal(getMaxAnimal() + 1);
        }
    }

    public Cat[] getCats() {
        return cats;
    }

    public Chiken[] getChikens() {
        return chikens;
    }

    public Cow[] getCows() {
        return cows;
    }

    public Rabit[] getRabits() {
        return rabits;
    }

    public FermerMan getMan() {
        return man;
    }

    public void setMan(FermerMan man) {
        this.man = man;
    }

    public Pet[] getAllPets() {
        return allPets;
    }
}