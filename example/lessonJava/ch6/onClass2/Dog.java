package lessonJava.ch6.onClass2;

public class Dog implements Pet{
    String name, color;
    int age;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }
}
