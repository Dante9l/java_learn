package lessonJava.ch4;

public class AnimalTest {
    public static void main(String[] args) {
        Animal wolf = new Wolf();
        Animal sheep = new Sheep();
        wolf.eat();
        sheep.eat();
        wolf.walk();
        sheep.walk();
    }
}
