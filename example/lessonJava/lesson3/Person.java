package lessonJava.lesson3;

public class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
    public void purchess(Market mar,Products pro){
        for (Products p:mar.products){
            if (p.equals(pro)) {
                System.out.println(this.name + "在" + mar.name + "买到了" + pro);
                return;
            }
        }
        System.out.println(this.name + "白跑了一趟，在" + mar.name +"什么也没买到");
    }
}
