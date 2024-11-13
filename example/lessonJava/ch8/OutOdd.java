package lessonJava.ch8;

public class OutOdd implements Runnable{
    int parm = 1;
    @Override
    public void run() {
        while (parm <= 100){
            if (parm % 2 != 0) {
                System.out.println(parm++);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                parm++;
            }
        }
    }
}
class OutEven implements Runnable{
    int parm = 1;
    @Override
    public void run() {
        while (parm <= 100){
            if (parm % 2 == 0) {
                System.out.println(parm++);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                parm++;
            }
        }
    }
}
class TestForThread{
    public static void main(String[] args) {
        OutOdd a = new OutOdd();
        OutEven b = new OutEven();
        a.run();
        b.run();
    }
}