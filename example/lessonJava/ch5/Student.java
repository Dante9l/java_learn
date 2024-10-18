package lessonJava.ch5;

public class Student extends Person{

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
