package lessonJava.ch6.onClass1;

public class Door implements Doorbell,Lock{
    @Override
    public void ring() {
        System.out.println("ring ring...");
    }

    @Override
    public void lock() {
        System.out.println();
    }

    @Override
    public void unlock() {

    }
}
