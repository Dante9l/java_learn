package lessonJava.ch8;

public class OutEven2 extends Thread{
    int parm = 1;
    @Override
    public void run() {
        while (parm <= 100){
            if (parm % 2 == 0) {
                System.out.print(parm++ + " ");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else parm++;
        }
        System.out.println();
    }
}
class OutOdd2 extends Thread{
    int parm = 1;
    @Override
    public void run() {
        while (parm <= 100){
            if (parm % 2 != 0) {
                System.out.print(parm++ + " ");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else parm++;
        }
        System.out.println();
    }
}
class Test2{
    public static void main(String[] args) {
        new OutEven2().start();
        new OutOdd2().start();
    }
}