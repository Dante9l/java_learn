package lessonJava.ch6.onClass2;

import java.util.HashSet;
import java.util.Set;

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
