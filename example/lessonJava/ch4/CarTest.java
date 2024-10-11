package lessonJava.ch4;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("别克林荫大道");
        myCar.CalcRent(16);
        Bus myBus = new Bus(32);
        myBus.CalcRent(25);
    }
}
