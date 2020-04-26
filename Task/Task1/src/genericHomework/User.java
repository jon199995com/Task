package genericHomework;

/*todo класс User со следующими полями:
        String fulName;
        int salary;
        Position position;*/
public class User {
    private  String fulName;
    private int salary;
    private Position position; // ссылка на enum Position

    public User(String fulName, Position position) {
        this.fulName = fulName;
        this.salary = salary;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "fulName='" + fulName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
