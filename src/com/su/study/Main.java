package com.su.study;

/**
 * Created by Administrator on 2015/9/20.
 */
public class Main {
    public static void main(String[] args) {
        //int a[] = {43,2432,5435,76,234,7857567,32423,7,313,5435,7,3232,843,23423,79,546,234,856,35,845};
        //Bubble.printResult(a);
        //Bubble.sortArray(a, "min");
        //Bubble.sortArray(a);
        //Bubble.printResult(a);
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] i : a){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
        int b[][] = new int[3][3];
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a[i].length;j++) {
                b[j][i] = a [i][j];
            }
        }
        for (int[] i : b){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
