package com.company;

/**
 * Created by tuntun on 4/25/17.
 */
public class BubbleSort {

    public int[] bubbleSort(int[] a) {

        for (int j = 0; j < a.length; j++) {

            for (int i = 0; i < a.length - 1 - j; i++) {

                int next = a[i + 1];
                if (a[i] > next) {

                    int tmp = a[i];
                    a[i] = next;
                    next = tmp;

                }
            }
        }
        return a;
    }
}
