package org.example.lessonJava;

import java.util.Scanner;

public class lesson21 {
    public static void main(String[] args) {
        System.out.println("please enter 3*3 Matrix:");
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        Scanner sc = new Scanner(System.in);
        String[] sA = sc.nextLine().split(" ");
        String[] sB = sc.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Double.parseDouble(sA[i * a[0].length + j]);
                b[i][j] = Double.parseDouble(sB[i * b[0].length + j]);
            }
        }
        double[][] c = addMatrix(a, b);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] addMatrix(double[][] a , double[][] b){
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
