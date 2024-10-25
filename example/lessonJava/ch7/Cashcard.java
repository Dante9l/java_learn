package lessonJava.ch7;

public class Cashcard {
    String id;
    int blance;

    public Cashcard(String id, int blance) {
        this.id = id;
        this.blance = blance;
    }

    public Cashcard(int blance) {
        this.blance = blance;
    }

    public boolean deposit(int i) throws IllegalAccessException {
        if (!(i >= 0)){
            throw new NagativeFundsException("金额不能为负数");
        }
        this.blance = i;
        return true;
    }
    public boolean withdraw(int i){
        if (i > this.blance || i < 0){
            throw new InsufficentException("金额不足");
        }
        this.blance -= i;
        return true;
    }
}
class TestForCashcard{
    public static void main(String[] args) {
        Cashcard c1 = new Cashcard(5000);
        Cashcard c2 = new Cashcard(3000);
        Cashcard c3 = new Cashcard(2000);
        try {
            c1.deposit(-100);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        try {
            c2.withdraw(80000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            c3.deposit(1000);
            c3.withdraw(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}