package lessonJava.ch4;

public abstract class MotoVehicle {
    private int id;
    private String brand;
    private String color;
    private int mileage;

    public abstract int calRent(int days);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

