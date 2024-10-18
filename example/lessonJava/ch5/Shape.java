package lessonJava.ch5;

public abstract class Shape {
    private int x;
    private int y;
    public abstract int getArea();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}