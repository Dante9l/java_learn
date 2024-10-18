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
    public int calRent(int day) {
        return (this.seatCount> 16 ? 1500 : 800) * day;
    }
}
