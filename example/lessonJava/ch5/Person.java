package lessonJava.ch5;

public abstract class Person {
    String name, phone, password;
    int age;
    public abstract void operation(String name, String password);
    public abstract void sayHello();
    public abstract void call();
}
