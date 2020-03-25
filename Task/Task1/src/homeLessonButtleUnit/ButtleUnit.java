package homeLessonButtleUnit;

public class ButtleUnit {
    int health;
    int attackScore;

    public ButtleUnit(int health, int attackScore) {
        this.health = health;
        this.attackScore = attackScore;
    }

    public void attack(ButtleUnit enemy) {//Под enemy Может быть любой объект создаваемый в мейне
        enemy.health -= this.attackScore;
    }

    public int getHealt() {
        return health;
    }

    public void setHealt(int healt) {
        this.health = healt;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }
}
