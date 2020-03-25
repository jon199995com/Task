package homeShape;

public class Rectangle {
    private float shortSide;
    private float longSide;

    public Rectangle(float shortSide, float longSide){
        setLongSide(longSide);
        setShortSide(shortSide);
    }

    public float rectangleP(){
        float p = (getLongSide()*2)+(getShortSide()*2);
        return p;
    }
    public float rectangleArea(){
        float area = getLongSide()*getShortSide();
        return area;
    }

    public float getShortSide() {
        return shortSide;
    }

    public void setShortSide(float shortSide) {
        this.shortSide = shortSide;
    }

    public float getLongSide() {
        return longSide;
    }

    public void setLongSide(float longSide) {
        this.longSide = longSide;
    }
}
