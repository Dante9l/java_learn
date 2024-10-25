package lessonJava.ch6.onClass2;

public class Cat implements Pet{
    String name;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    String color;
    int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getAge() {
        return age;
    }
}
