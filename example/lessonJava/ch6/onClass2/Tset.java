package lessonJava.ch6.onClass2;

import java.math.BigInteger;
import java.util.Scanner;

public class Tset {
    public static void main(String[] args) {
        PetShop ps = new PetShop(10);
//五个宠物
        ps.add(new Cat("白猫","白色的",2));
        ps.add(new Cat("黑猫","黑色的",3));
        ps.add(new Cat("金渐层猫", "金色的",3));
        ps.add(new Dog("拉布拉多", "黄色的",3));
        ps.add(new Dog("金毛","金色的",3));
        ps.add(new Dog("黑狗","黑色的",3));
        System.out.println("宠物商店的宠物：");

        System.out.println("----------------------------");
        System.out.println("请输入关键字：");
        Scanner scanner=new Scanner(System.in);
        String string = scanner.next();
        System.out.println("查询结果：");
        new PetShop(ps.search(string)).printPets();

    }
}
