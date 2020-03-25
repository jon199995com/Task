package homeShape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Площадь круга = " + circle.CircleArea() + " \nДлина окружности = " + circle.CircleP());
        Triangle triangle = new Triangle(2, 2, 3);
        System.out.println("Периметр треугольника = " + triangle.triangleP());
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Площадь прямоугольника = " + rectangle.rectangleArea() + "\nПериметр прямоугольника = " + rectangle.rectangleP());
    }
}