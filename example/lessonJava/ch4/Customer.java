package lessonJava.ch4;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int calTotalRent(MotoVehicle[] motos, int days){
        int count = 0;
        for (MotoVehicle moto : motos) {
            count += moto.calRent(days);
        }
        return count;
    }
}
