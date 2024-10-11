package lessonJava.ch4;

public class Bus extends MotoVehicle{
    private int seatCount;
    public Bus(int seatCount){
        this.seatCount = seatCount;
    }
    public int getSeatCount(){
        return seatCount;
    }

    @Override
    public void CalcRent(int day) {
        System.out.println("租赁费用为: " + (this.seatCount > 16 ? 1500 : 800) * day + "元");
    }
}
