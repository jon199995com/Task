package ferm.man;

import ferm.pet.CanBeEatenFermerMan;
import ferm.pet.Givresurces;

public class FermerMan implements EatPet, FeedPet, GetRes, GoAway {
    private int res = 5;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    @Override
    public void gameOverForPets(CanBeEatenFermerMan enemy) {

    }

    @Override
    public void FeedPets() {

    }

    @Override
    public void GetResIsPet(Givresurces enemy) {

    }

    @Override
    public void goAwayWildAnimal() {

    }
}
