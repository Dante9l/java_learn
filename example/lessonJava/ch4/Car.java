package lessonJava.ch4;

public class Car extends MotoVehicle{
    private String type;

    @Override
    public void CalcRent(int day) {
        switch (this.type){
            case "别克商务舱GL8" -> System.out.println("租车费用为：" + 600 * day + "元");
            case "宝马550i" -> System.out.println("租车费用为：" + 500 * day + "元");
            case "别克林荫大道" -> System.out.println("租车费用为：" + 300 * day + "元");
        }
    }

    public Car(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

}
