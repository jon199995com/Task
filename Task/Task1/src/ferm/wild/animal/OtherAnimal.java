package ferm.wild.animal;

import java.util.Date;
import java.util.Random;

public class OtherAnimal {
    Random random = new Random(new Date().getTime());
    private Wolf[] wolfs = new Wolf[1];
    private Fox[] foxes = new Fox[1];
    private Bear[] bears = new Bear[1];
    private WildAnimal[] wildAnimals = new WildAnimal[3];
    private int count = 0;//счетчик ДЖ

    public boolean whoIsHere() {//есть ли ДЖ, которые могут приходить на ферму
        for (int i = 0; i < getCount(); i++) {
            if (getWildAnimals()[i] != null && getWildAnimals()[i].getGoAway() < 3)
                return true;//есть ли ДЖ,которых прогнали меньше 4 раз
        }
        return false;
    }

    public Wolf[] getWolfs() {
        return wolfs;
    }

    public void setWolfs(Wolf[] wolfs) {
        if (getWildAnimals()[getCount()] == null && getCount() < 3) {
            this.wolfs = wolfs;
            System.arraycopy(getWolfs(), 0, getWildAnimals(), getCount(), 1);
            //String name,          int weight, int strong, int speed, int goAway
            System.out.println("Добавлен волк: " + getWildAnimals()[getCount()].getName() + "Вес - " +
                    getWildAnimals()[getCount()].getWeight() + " сила - " +
                    getWildAnimals()[getCount()].getStrong() + " скорость - " + getWildAnimals()[getCount()].getSpeed());
            setCount(getCount() + 1);
        }
    }

    public WildAnimal[] getWildAnimals() {
        return wildAnimals;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Fox[] getFoxes() {
        return foxes;
    }

    public void setFoxes(Fox[] foxes) {
        if (getWildAnimals()[getCount()] == null && getCount() < 3) {
            this.foxes = foxes;
            System.arraycopy(getFoxes(), 0, getWildAnimals(), getCount(), 1);
            System.out.println("Добавлена лиса: " + getWildAnimals()[getCount()].getName() + "Вес - " +
                    getWildAnimals()[getCount()].getWeight() + " сила - " +
                    getWildAnimals()[getCount()].getStrong() + " скорость - " + getWildAnimals()[getCount()].getSpeed());
            setCount(getCount() + 1);
        }
    }

    public Bear[] getBears() {
        return bears;
    }

    public void setBears(Bear[] bears) {
        if (getWildAnimals()[getCount()] == null && getCount() < 3) {
            this.bears = bears;
            System.arraycopy(getBears(), 0, getWildAnimals(), getCount(), 1);
            System.out.println("Добавлен медведь: " + getWildAnimals()[getCount()].getName() + "Вес - " +
                    getWildAnimals()[getCount()].getWeight() + " сила - " +
                    getWildAnimals()[getCount()].getStrong() + " скорость - " + getWildAnimals()[getCount()].getSpeed());
            setCount(getCount() + 1);
        }
    }
}
