package org.example.lessonJava;

import static java.lang.Math.round;

public class lesson23 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (round(Math.random()));
            }
        }

        int row = 0,column = 0,maxSumRow = 0,maxSumCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            int temRow = 0;
            int temCol = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                temRow +=matrix[i][j];
                temCol +=matrix[j][i];
            }
            if (temRow > maxSumRow){
                maxSumRow = temRow;
                row = i + 1;
            }
            if (temCol > maxSumCol){
                maxSumCol = temCol;
                column = i + 1;
            }
            System.out.println();
        }

        System.out.println("The largest row sum is " + row);
        System.out.println("The largest column sum is " + column);
    }
}
