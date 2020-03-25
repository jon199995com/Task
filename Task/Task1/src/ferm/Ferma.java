package ferm;

import ferm.man.FermerMan;
import ferm.pet.Cat;
import ferm.pet.Chiken;
import ferm.pet.Cow;
import ferm.pet.Rabit;

public class Ferma {
    private Cat[] cats = new Cat[10];
    private Chiken[] chikens = new Chiken[10];
    private Cow[] cows = new Cow[10];
    private Rabit[] rabits;
    private FermerMan man;
    private int maxAnimal = 0;

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {

        this.cats = cats;
        System.out.println("Добавлен кот");
    }

    public Chiken[] getChikens() {
        return chikens;
    }

    public void setChikens(Chiken[] chikens) {

        this.chikens = chikens;
        System.out.println("Добавлена курица");
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {

        this.cows = cows;
        System.out.println("Добавлена корова");
    }

    public Rabit[] getRabits() {
        return rabits;
    }

    public void setRabits(Rabit[] rabits) {
        this.rabits = rabits;
        System.out.println("Добавлен кролик");
    }
}
