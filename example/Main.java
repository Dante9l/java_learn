package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("1. 登录系统");
        System.out.println("2. 退出");
        System.out.println("***************************");
        System.out.println("请输入:");
        while (true) {
            Scanner s = new Scanner(System.in);
            if (s.hasNextInt()) {
                int i =s.nextInt();
                Next(i);
            } else {
                System.out.println("非法输入,请重新输入");
            }
        }
    }
    public static String Next (int i){
        if (i == 1){
            System.out.println("1. 客户信息管理");
            System.out.println("2. 购物结算");
            System.out.println("3. 真情回馈");
            System.out.println("4. 注销");
            return "登录成功";
        } else if (i == 2) {
            System.exit(0);
            return "退出成功";
        }
        return "";
    }
}