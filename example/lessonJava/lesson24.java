package lessonJava;

public class lesson24 {
    public int fenZi;
    public int fenMu;
    public lesson24(int fenZi, int fenMu){
        this.fenZi = fenZi;
        this.fenMu = fenMu;
    }
    public lesson24 add (lesson24 a){
        int fenZi0 = a.fenZi * this.fenMu + this.fenZi * a.fenMu;
        int fenMu0 = a.fenMu * this.fenMu;
        lesson24 result = new lesson24(fenZi0, fenMu0);
        return result.yuefen();
    }
    public lesson24 sub (lesson24 a){
        int fenZi0 = this.fenZi * a.fenMu- a.fenZi * this.fenMu;
        int fenMu0 = a.fenMu * this.fenMu;
        lesson24 result = new lesson24(fenZi0, fenMu0);
        return result.yuefen();
    }
    public lesson24 mul (lesson24 a){
        int fenZi0 = a.fenZi * this.fenZi;
        int fenMu0 = a.fenMu * this.fenMu;
        lesson24 result = new lesson24(fenZi0, fenMu0);
        return result.yuefen();
    }
    public lesson24 div (lesson24 a){
        int fenZi0 = this.fenZi * a.fenMu;
        int fenMu0 = this.fenMu * a.fenZi;
        lesson24 result = new lesson24(fenZi0, fenMu0);
        return result.yuefen();
    }
    public lesson24 yuefen(){
        int gcd = gcd(fenZi, fenMu);
        fenZi /= gcd;
        fenMu /= gcd;
        return this;
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        lesson24 a = new lesson24(-1, 2);
        lesson24 b = new lesson24(1, 2);
        lesson24 c = a.add(b);
        System.out.println(c.fenZi + "/" + c.fenMu);
        lesson24 d = a.sub(b);
        System.out.println(d.fenZi + "/" + d.fenMu);
        lesson24 e = a.mul(b);
        System.out.println(e.fenZi + "/" + e.fenMu);
        lesson24 f = a.div(b);
        System.out.println(f.fenZi + "/" + f.fenMu);
    }
}
