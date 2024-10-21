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
class Cube extends Shape{
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
class Rectangle extends Shape{
    public Rectangle(int base, int length){
        super.setX(base);
        super.setY(length);
    }

    @Override
    public int getArea() {
        return super.getX() * super.getY();
    }
}
class Triangle extends Shape{
    public Triangle(int base, int height){
        super.setX(base);
        super.setY(height);
    }

    @Override
    public int getArea() {
        return super.getX() * super.getY() / 2;
    }
}
class Testforshape{
    public static void main(String[] args) {
        Shape shape = new Rectangle(10,5);
        System.out.println(shape.getArea());
        Shape shape1 = new Triangle(10,5);
        System.out.println(shape1.getArea());
        Rectangle rectangle = (Rectangle) shape;
        Triangle triangle = (Triangle) shape1;
        System.out.println(rectangle.getArea());
        System.out.println(triangle.getArea());
        System.out.println(new Cube(10,5,3).getArea());
    }
}