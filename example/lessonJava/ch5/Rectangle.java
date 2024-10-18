package lessonJava.ch5;

public class Rectangle extends Shape{
    public Rectangle(int base, int length){
        super.setX(base);
        super.setY(length);
    }

    @Override
    public int getArea() {
        return super.getX() * super.getY();
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        System.out.println(r.getArea());
    }
}
