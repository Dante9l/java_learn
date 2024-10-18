package lessonJava.ch5;

public class SongGame extends Computer{
    public SongGame(int[] grade) {
        super(grade);
    }

    @Override
    public double average() {
        int Min = Integer.MAX_VALUE, Max = Integer.MIN_VALUE, sum = 0;
        for (int i : super.i){
            sum +=super.i[i];
            Min = Math.min(i, Min);
            Max = Math.max(i, Max);
        }
        sum = sum - Min - Max;
        return sum / 1.0 / (super.i.length - 2);
    }
}
