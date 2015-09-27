package com.su.study;

import java.util.Random;

/**
 * Created by Administrator on 2015/9/20.
 */
public class Main {
    public static void main(String[] args) {
        //int a[] = {43,2432,5435,76,234,7857567,32423,7,313,5435,7,3232,843,23423,79,546,234,856,35,845};
        //BubbleSort.printResult(a);
        //BubbleSort.sortArray(a, "min");
        //BubbleSort.sortArray(a);
        //BubbleSort.printResult(a);
        int a[] = new int[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            a[i] = r.nextInt(1000);
        }
        SelectSort.printResult(a);
        SelectSort.sortArray(a);
        SelectSort.printResult(a);
        BubbleSort.sortArray(a);
        BubbleSort.printResult(a);
    }
}
