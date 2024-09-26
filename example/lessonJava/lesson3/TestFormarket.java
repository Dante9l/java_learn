package lessonJava.lesson3;

public class TestFormarket {
    public static void main(String[] args) {
        Market market = new Market("华联");
        Person person = new Person("张三");
        person.purchess(market, Products.APPLE);
        person.purchess(market, Products.ORANGE);
    }
}
