package lessonJava.ch6.work1;

public abstract class Vehicle {
    public String no, brand, master;
    public abstract void transport();

    public Vehicle(String no, String brand, String master) {
        this.no = no;
        this.brand = brand;
        this.master = master;
    }
}
