package lessonJava.ch4;

public class Car extends MotoVehicle{
    private String type;

    @Override
    public int calRent(int day) {
        switch (super.getBrand() + this.type){
            case "别克商务舱GL8" -> {
                return  600 * day;
            }
            case "宝马550i" -> {
                return  500 * day;
            }
            case "别克林荫大道" -> {
                return  300 * day;
            }
        }
        return 0;
    }

    public Car(String brand, String type){
        this.type = type;
        super.setBrand(brand);
    }
    public String getType(){
        return type;
    }

}
