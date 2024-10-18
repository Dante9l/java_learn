package lessonJava.ch5;

public class Cube extends Shape{
    int height;
    public Cube(int base, int length, int height){
        super.setX(base);
        super.setY(length);
        this.height = height;
    }

    @Override
    public int getArea() {
        return super.getX() * super.getY() * height * 6;
    }
}
