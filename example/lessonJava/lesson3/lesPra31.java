package lessonJava.lesson3;

public class lesPra31 {
    String pinpai;
    public lesPra31(String pinpai){
        this.pinpai = pinpai;
    }
    public lesPra31(){}
    public void charge() {
        System.out.println(pinpai + "牌的电池充电中");
    }

    public static void main(String[] args) {
        lesPra31 les = new lesPra31("南孚");
        les.charge();
    }
}
