package lessonJava.ch4;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "张三");
        Student s2 = new Student(2, "李四");
        Student s3 = new Student(2 ,"王五");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}
