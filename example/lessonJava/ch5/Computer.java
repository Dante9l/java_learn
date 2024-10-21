package lessonJava.ch5;

public abstract class Computer {
    int[] in;
    public Computer(int[] i){
        this.in = i;
    }
    public abstract double average();
}
class SongGame extends Computer{
    public SongGame(int[] grade) {
        super(grade);
    }

    @Override
    public double average() {
        int Min = Integer.MAX_VALUE, Max = Integer.MIN_VALUE, sum = 0;
        for (int i : super.in){
            sum += i;
            Min = Math.min(i, Min);
            Max = Math.max(i, Max);
        }
        sum = sum - Min - Max;
        return (double) sum / (super.in.length - 2);
    }
}
class Testforcomputer{
    public static void main(String[] args) {
        int[] i = {5,9,3,5,4,8,3,1,45,6};
        Computer c = new SongGame(i);
        System.out.println(c.average());
    }
}