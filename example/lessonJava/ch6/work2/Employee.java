package lessonJava.ch6.work2;

import java.util.Date;

public class Employee extends People{
    int salary;
    String  hireDay;
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + this.getSalary() +
                ", hireDay='" + hireDay + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getHireDay() {
        return hireDay;
    }
}
