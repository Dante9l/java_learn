package lessonJava.ch4;

public class Wolf extends Animal{
    @Override
    public void walk() {
        System.out.println("I walk on four legs");
    }

    @Override
    public void eat(){
        System.out.println("I eat meat");
    }
}
