package ferm.pet;

import ferm.man.EatPet;
import ferm.wild.animal.Hit;

public class Chiken extends Pet implements Givresurces, CanBeEatenFermerMan {
    public Chiken(String name, int weight, int speed, int health, int resources) {
        this.setName(name);
        this.setWeight(weight);
        this.setSpeed(speed);
        this.setHealth(health);
        this.setResources(resources);
    }

    @Override
    public void itIsGameOverForPet() {

    }

    @Override
    public void itIsNotAllYetForPet(Hit enemy) {

    }

    @Override
    public void getAddHealth() {

    }

    @Override
    public void setRes() {

    }

    @Override
    public void canEatenMan() {

    }
}
