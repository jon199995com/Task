package ferm.pet;

abstract public class Pet implements CanBeHits, CanBeEaten, AddHealth{
    //    имя, вес, скорость, здоровье, количество ресурсов
    private String name;
    private int weight;
    private int speed;
    private int health;
    private int resources;

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
        if (weight > 0 ) this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }
}
