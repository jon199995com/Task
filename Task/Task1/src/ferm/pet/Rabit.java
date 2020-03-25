package ferm.pet;

import ferm.man.EatPet;
import ferm.pet.Pet;
import ferm.wild.animal.Hit;

public class Rabit extends Pet implements CanBeEatenFermerMan {
    public Rabit(String name, int weight, int speed, int health, int resources) {
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
//        this.setHealth(getHealth()+1); // Todo Восстанавливает здоровье но не больше начального?! Подумать
    }


    @Override
    public void canEatenMan() {

    }
}
