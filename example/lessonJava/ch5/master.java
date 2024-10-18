package lessonJava.ch5;

public class master {
    String name;
    int money;

    public master(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void play(Pet pet){
        if (pet instanceof Dog)
            ((Dog) pet).catchingFlyDisc();
        if (pet instanceof Penguin)
            ((Penguin) pet).swimming();
    }
    public Pet getPet(String typId){
        return typId.charAt(0) - '0' == 1 ? new Dog("", "") : typId.charAt(0) - '0' == 2 ? new Penguin("", "") : null;
    }
}
