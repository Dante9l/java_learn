package org.example;

public class number {
    public static void main(String[] args) {
        find();
    }
    public static void  find(){
        for (int i = 100; i < 1000; i++) {
            int a, b, c;
            a = i % 10;
            b = i % 100 / 10;
            c = i / 100;
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == i){
                System.out.print(i + " ");
            }
        }
    }
}
