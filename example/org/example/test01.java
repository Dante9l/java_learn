package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String name = null;
        int age = 0;
        double height = 0;
        try {
            System.out.println("请输入姓名: ");
            name = s.next();
            System.out.println("请输入年龄: ");
            age = s.nextInt();
            System.out.println("请输入身高: ");
            height = s.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("输入类型不匹配");
            System.exit(0);
        }
        System.out.println("基本信息");
        System.out.println("-------------------------");
        System.out.println("姓名："+name+ '\t' +"年龄："+age+ '\t' +"身高："+height);
    }
}
