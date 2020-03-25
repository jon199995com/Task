package homeShape;

public class Circle {
    private float r;

    public Circle(float r){
        setR(r);
    }


    public float CircleArea() {
        float circleArea = 3.4f * getR() * getR();
        return circleArea;

    }

    public float CircleP() {
        float circleP = 2 * 3.4f * getR();
        return circleP;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
