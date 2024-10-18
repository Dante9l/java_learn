package lessonJava.ch4;

public class Truck extends MotoVehicle{
    public int heavy;
    public Truck(int heavy) {
        this.heavy = heavy;
    }

    @Override
    public int calRent(int days) {
        return 50 * heavy * days;
    }
}
