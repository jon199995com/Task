package ferm;

import ferm.man.FermerMan;
import ferm.pet.*;

public class Ferma implements Cloneable {
    private Pet[] allPets = new Pet[10];//Массив со всеми домашними питомцами
    private Cat[] cats = new Cat[10];
    private Chiken[] chikens = new Chiken[10];
    private Cow[] cows = new Cow[10];
    private Rabit[] rabits = new Rabit[10];
    private FermerMan man = new FermerMan();
    private int maxAnimal = 0;//счетчик домашних животных
    private boolean isSomeoneIsLive = true;//Есть ли живые питомцы,которые могут давать ресурсы

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