package ferm;

import ferm.man.FermerMan;
import ferm.pet.*;

public class Ferma implements Cloneable {
    private Pet[] allPets = new Pet[10];
    private Cat[] cats = new Cat[10];
    private Chiken[] chikens = new Chiken[10];
    private Cow[] cows = new Cow[10];
    private Rabit[] rabits = new Rabit[10];
    private FermerMan man = new FermerMan();
    private int maxAnimal = 0;
    private boolean isSomeoneIsLive = true;
    private int whoLive = 0;

    public void takeRes() {
        for (int i = 0; i < getMaxAnimal(); i++) {
            if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof Givresurces) {
                getMan().setRes(getMan().getRes() + getAllPets()[i].getResources());
                getAllPets()[i].setResources(0);
            }
        }
    }

    public boolean whoIsLive() {
        for (int i = 0; i < getMaxAnimal(); i++) {
            if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof Givresurces) {
                setWhoLive(getWhoLive()+1);
                return true;
            }
        }
        return false;
    }

    public void eatPet() {//Фермер ест животное
        setSomeoneIsLive(true);
        for (int i = 0; i < getMaxAnimal(); i++) {
            if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof Givresurces && getAllPets()[i].getResources() != 0) {
                setSomeoneIsLive(false);
            }
        }
        if (isSomeoneIsLive()) {
            for (int i = 0; i < getMaxAnimal(); i++) {
                if (getAllPets()[i] != null && getAllPets()[i].isLive() && getAllPets()[i] instanceof CanBeEatenFermerMan) {
                    getMan().setRes(getMan().getRes() + getAllPets()[i].getWeight());
                    getAllPets()[i].setLive(false);
                    System.out.println("Был съеден фермером "+ getAllPets()[i].getName());
                    break;
                }
            }
        }
    }

    public void feedPets() {
        for (int i = 0; i < getMaxAnimal(); i++) {
            if (getAllPets()[i].isLive() && getAllPets()[i].getHealth() < 100) {
                getAllPets()[i].getAddHealth(getMan());
            }
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

    public void setRabits(Rabit[] rabits) {
        if (getAllPets()[getMaxAnimal()] == null && getMaxAnimal() < 10) {
            this.rabits = rabits;
//            getAllPets()[getMaxAnimal()]
            System.arraycopy(getRabits(), 0, getAllPets(), getMaxAnimal(), 1);
//                                                                      int weight,         int speed, int health, int resources
            System.out.println("Добавлен кролик: имя - " + getAllPets()[getMaxAnimal()].getName() + " вес - " +
                    getAllPets()[getMaxAnimal()].getWeight() + " скорость = " +
                    getAllPets()[getMaxAnimal()].getSpeed() + " ресурсы - " + getAllPets()[getMaxAnimal()].getResources());
            setMaxAnimal(getMaxAnimal() + 1);
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

    public int getWhoLive() {
        return whoLive;
    }

    public void setWhoLive(int whoLive) {
        this.whoLive = whoLive;
    }
}