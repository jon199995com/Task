package ferm.pet;


import ferm.man.FeedPet;
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
    public void canEatenMan() {

    }

    @Override
    public void getAddHealth(FeedPet enemy) {
        this.setHealth(getHealth()+1); // Todo Восстанавливает здоровье но не больше начального?! Подумать

    }
}
