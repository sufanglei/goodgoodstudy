package com.su.study;

/**
 * Created by Administrator on 2015/9/19.
 */
public class BubbleSort {

    public static void printResult(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i]);
            }
        }
    }

    public static void sortArray(int[] a, String type) {
        if (type.equals("min")) {
            //每次比最少次数
            for (int i = 0; i < a.length; i++) {
                for (int j = 0, k = a.length - 1; j < k; j++, k--) {
                    if (a[j] > a[j + 1]) {
                        a[j] = a[j] + a[j + 1];
                        a[j + 1] = a[j] - a[j + 1];
                        a[j] = a[j] - a[j + 1];
                    }
                }
            }
        }
    }

    public static void sortArray(int[] a) {
        //每次都比9次
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }
    }

}
