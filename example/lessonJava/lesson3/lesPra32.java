package lessonJava.lesson3;

public class lesPra32 extends lesPra31{
    String pinpai;
    //子类重写父类方法
    public void downloadMusic(){
        System.out.println("下载音乐");
    }
    public void download(){
        System.out.println("下载中");
    }
    public lesPra32(String pinpai) {
        super(pinpai);
        this.pinpai = pinpai;
    }
    public void change(){
        super.charge();
    }

    public static void main(String[] args) {
        lesPra32 lesPra32 = new lesPra32("华为");
        lesPra32.downloadMusic();
        lesPra32.download();
        lesPra32.change();
    }
}
