package ferm.wild.animal;

import ferm.pet.CanBeEaten;
import ferm.pet.CanBeHits;

public class WildAnimal implements Hit, Eating {
    //    имя, вес, скорость, сила
    private String name;
    private int weight;
    private int speed;
    private int strong;
    private int goAway;

    public int getGoAway() {
        return goAway;
    }

    public void setGoAway(int goAway) {
        this.goAway = goAway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0 && name != null) this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) this.speed = speed;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        if (strong > 0) this.strong = strong;
    }

    @Override
    public void EatPet(CanBeEaten enemy) {

    }

    @Override
    public void HitPet(CanBeHits enemy) {

    }
}
