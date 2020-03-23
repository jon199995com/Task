package School;

public abstract class People {//Абстрактный класс, в котором хранятся возраст и имя каждого человека в школе(я ленивый и не хочу вбивать их в каждом классе)
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
