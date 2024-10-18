package lessonJava.ch5;

public abstract class Computer {
    int[] i;
    public Computer(int[] i){
        this.i = i;
    }
    public abstract double average();
}
