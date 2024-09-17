package org.example;

import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入4位会员号");
        int n = s.nextInt();
        isLucky(n);
    }

    public static void isLucky(int i){
        int lucky = (int)(Math.random()*10);
        System.out.println("Lucky number is "+ lucky);
        if(i%1000/100 == lucky){
            System.out.println("lucky");
        }else {
            System.out.println("not lucky");
        }
    }
}
