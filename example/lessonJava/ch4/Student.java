package lessonJava.ch4;

public class Student {
    public int number;
    public String name;
    public Student(int num, String name){
        this.name = name;
        this.number = num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.number == ((Student)obj).number;
    }
}
