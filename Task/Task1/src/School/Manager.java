package School;

public class Manager extends People {
    private static boolean isStartFinish = false;

    public Manager(int age, String name) {//Задаем нашему директору имя и возраст
        this.setAge(age);
        this.setName(name);
    }

    public void start() {//Объявляет о начале занятий
        System.out.println("Занятие началось!!!");
        setIsStartFinish(true);
    }

    public void finish() {//Объявляет о конце занятий
        System.out.println("Занятие закончилось!!!");
        setIsStartFinish(false);
    }

    public static boolean getIsStartFinish() {
        return isStartFinish;
    }

    public void setIsStartFinish(boolean isStartFinish) {
        this.isStartFinish = isStartFinish;
    }
}
