package lessonJava.ch6.work2;

public class Manager extends Employee implements IEmployee{
    int bonus = 3000, holiday = 60;
    @Override
    public void addSalary(Employee emp) {
        emp.salary += IEmployee.price;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
