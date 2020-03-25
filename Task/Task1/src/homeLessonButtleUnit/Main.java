package homeLessonButtleUnit;

public class Main {
    public static void main(String[] args) {
        ButtleUnit unit = new ButtleUnit(100, 20);
        ButtleUnit enemy = new ButtleUnit(100, 20);
        Knight knight1 = new Knight(90, 10);
        Knight knight2 = new Knight(90, 10);
//        knight1.getAttackScore();
//        knight1.getHealt();
//        knight2.getAttackScore();
//        knight2.getHealt();
        knight1.attack(knight2);
        knight2.attack(knight1);

    }
}
