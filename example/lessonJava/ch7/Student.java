package lessonJava.ch7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    String id, name;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
class TestForStudent{
    public static void main(String[] args) {
        Map l = new HashMap<String, List<Student>>();
        Student n1 = new Student("1", "小明");
        Student n2 = new Student("2", "小王");
        Student g1 = new Student("1", "小红");
        Student g2 = new Student("2", "小李");
        List normal = new ArrayList<>();
        List good = new ArrayList<>();
        normal.add(n1);
        normal.add(n2);
        good.add(g1);
        good.add(g2);
        l.put("普通班", normal);
        l.put("强化班", good);
        for (Object value : l.values()) {
            System.out.println(value);
        }
    }
}
