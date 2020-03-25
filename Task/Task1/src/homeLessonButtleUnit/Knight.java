package homeLessonButtleUnit;

public class Knight extends ButtleUnit {

    public Knight(int health, int attackScore) {
        super(health, attackScore);//Вызов конструктора родительского класса
    }

    public void addHealth() {
        if (this.health > 0 && this.health < 85) health += 5;
    }

    @Override
    public void attack(ButtleUnit enemy) {
        enemy.health -= this.attackScore;
        addHealth();
    }
}
