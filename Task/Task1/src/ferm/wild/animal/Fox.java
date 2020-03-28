package ferm.wild.animal;

import ferm.pet.CanBeEaten;
import ferm.pet.CanBeHits;

public class Fox extends WildAnimal {
    public Fox(String name, int weight, int strong, int speed, int goAway) {
        this.setName(name);
        this.setWeight(weight);
        this.setStrong(strong);
        this.setSpeed(speed);
        this.setGoAway(goAway);
    }

    @Override
    public void EatPet(CanBeEaten enemy) {

    }

    @Override
    public void HitPet(CanBeHits enemy) {

    }
}