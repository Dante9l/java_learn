package lessonJava.ch7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入1 - 3");
        try {
            int i = s.nextInt();
            switch (i){
                case 1 -> System.out.println("英语");
                case 2 -> System.out.println("语文");
                case 3 -> System.out.println("数学");
            }
        }catch (InputMismatchException e){
            e.printStackTrace();
        }finally {
            System.out.println("欢迎你提出建议");
        }
    }
}
