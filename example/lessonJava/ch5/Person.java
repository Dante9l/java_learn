package lessonJava.ch5;

public abstract class Person {
    String name, phone, password;
    int age;
    public abstract void operation(String name, String password);
    public abstract void sayHello();
    public abstract void call();
}
class Student extends Person{

    @Override
    public void operation(String name, String password) {
        this.name = name;
        this.password = password;
    }
    @Override
    public void sayHello() {

    }
    @Override
    public void call() {
    }
}
class Teacher extends Person{
    @Override
    public void operation(String name, String password) {

    }
    @Override
    public void sayHello() {

    }
    @Override
    public void call() {

    }
}
