package com.su.study;

/**
 * Created by Administrator on 2015/9/27.
 */
public class SelectSort {
    public static void printResult(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i]);
            }
        }
    }

    public static void sortArray(int[] a) {
            for (int i = 0; i < a.length-1; i++) {
                int x = a[i];
                int index = a.length;
                for (int y = i; y < a.length-1 ; y++) {
                    if (a[y+1] < x) {
                        x = a[y+1];
                        index = y+1;
                    }
                }
                if(index != a.length) {
                    a[i] = a[i] + a[index];
                    a[index] = a[i] - a[index];
                    a[i] = a[i] - a[index];
                    //printResult(a);
                }
            }
    }

}
