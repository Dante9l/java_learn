package lessonJava.ch6.onClass1;

public class Theftproofdoor implements Doorbell,Lock {
    @Override
    public void ring() {
        System.out.println("ring ring...");
        this.shot();
    }
    private void shot(){
        System.out.println("picture shoted");
    }

    @Override
    public void lock() {
        System.out.println("door locked");
    }

    @Override
    public void unlock() {
        System.out.println("door unlock");
    }

    public static void main(String[] args) {
        Theftproofdoor theftproofdoor = new Theftproofdoor();
        theftproofdoor.lock();
        theftproofdoor.ring();
        theftproofdoor.unlock();
    }
}
