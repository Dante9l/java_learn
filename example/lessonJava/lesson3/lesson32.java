package lessonJava.lesson3;

public class lesson32 {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    public String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public lesson32(){
    }

    @Override
    public String toString() {
        if (on){
            return "speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color;
        }else return "fan is off"+"radius=" + radius + ", color=" + color;
    }

    public static void main(String[] args) {
        lesson32 car = new lesson32();
        System.out.println(car.toString());
        car.setSpeed(100);
        car.setOn(true);
        System.out.println(car.toString());
    }
}