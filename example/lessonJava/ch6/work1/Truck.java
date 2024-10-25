package lessonJava.ch6.work1;

public class Truck extends Vehicle implements Maintenance{

    public Truck(String no, String brand, String master) {
        super(no, brand, master);
    }

    @Override
    public void transport() {
        System.out.println("货物运输中...");
    }
    public void re(){
        System.out.println("运货人" + this.master + "驾驶的编号为" + this.no + "的" + this.brand +"已归还");
        maintenance();
    }

    @Override
    public void maintenance() {
        System.out.println("货物运输车辆保养完毕");
    }
}