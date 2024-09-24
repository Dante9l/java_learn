package org.example;

public class division {
    public static void main(String[] args) {
        canBeDivided(15);
    }
    public static void canBeDivided(int i) {
        if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
            System.out.println(i + "能够被3 5 7整除");
        } else {
            System.out.println("不能被3 5 7整除");
        }
    }
}
