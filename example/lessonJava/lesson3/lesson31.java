package lessonJava.lesson3;

public class lesson31{
    double a ,b ,c;
    public lesson31(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public int getDiscriminant(){
        int i = (int)(Math.pow(b ,2) - 4 * a * c);
        return Math.max(i, 0);
    }
    public double getRoot1 (){
            return (-b + Math.sqrt(getDiscriminant())
            ) / 2*a;
    }
    public double getRoot2 (){
            return (-b - Math.sqrt(getDiscriminant())
            ) / 2*a;
    }
    public void getResult(){
        if (getDiscriminant() > 0 ){
            System.out.println("r1 = " + getRoot1() + "r2 = " + getRoot2());
        }else if (getDiscriminant() == 0){
            System.out.println("r1 = " + getRoot1());
        }else System.out.println("无根");
    }

    public static void main(String[] args) {
        lesson31 l = new lesson31(1, -3, 2);
        l.getResult();
        lesson31 i = new lesson31(1, 2, 3);
        i.getResult();
    }
}