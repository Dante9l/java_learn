package lessonJava.ch4;

public class Sheep extends Animal{
    @Override
    public void walk() {
        System.out.println("I walk on four legs");
    }

    @Override
    public void eat() {
        System.out.println("I eat grass");
    }
}
