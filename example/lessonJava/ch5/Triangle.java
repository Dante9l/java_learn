package lessonJava.ch5;

public class Triangle extends Shape{
    public Triangle(int base, int height){
        super.setX(base);
        super.setY(height);
    }

    @Override
    public int getArea() {
        return super.getX() * super.getY() / 2;
    }
}
