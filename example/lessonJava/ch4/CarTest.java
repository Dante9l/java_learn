package lessonJava.ch4;

public class CarTest {
    public static void main(String[] args) {
        MotoVehicle[] motos= new MotoVehicle[5];
        motos[0] = new Car("宝马", "550i");
        motos[1] = new Car("宝马", "550i");
        motos[2] = new Car("别克", "林荫大道");
        motos[3] = new Bus(34);
        motos[4] = new Truck(100);
        System.out.println("总租金为" + Customer.calTotalRent(motos, 15));
        ClassLoader cl = CarTest.class.getClassLoader();
        System.out.println(cl.toString());
        System.out.println(cl.getParent());
    }
}
