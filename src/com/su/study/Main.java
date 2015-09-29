package com.su.study;

import java.util.Random;

/**
 * Created by Administrator on 2015/9/20.
 */
public class Main {
    public static void main(String[] args) {
        long start,end;
        int a[] = new int[100000];
        int b[] = new int[100000];
        Random r = new Random();
        for (int i = 0; i<a.length; i++){
            a[i] = r.nextInt(1000000);
            b[i] = a[i];
        }

        //SelectSort.printResult(a);
        start = System.currentTimeMillis();
        SelectSort.sortArray(a);
        end = System.currentTimeMillis();
        //SelectSort.printResult(a);
        System.out.println("选择排序：开始时间为" + start + "，结束时间为" + end + "，消耗时间为" + (end - start));

        //BubbleSort.printResult(b);
        start = System.currentTimeMillis();
        BubbleSort.sortArray(b);
        end = System.currentTimeMillis();
        //BubbleSort.printResult(b);
        System.out.println("冒泡排序：开始时间为"+start+"，结束时间为"+end+"，消耗时间为"+(end - start));

    }
}
