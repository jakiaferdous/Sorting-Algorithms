package com.company;

/**
 * Created by tuntun on 4/25/17.
 */
public class SelectionSort {

    public int[] selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            int minindex = i;
            int minvalue = a[i];

            for (int j = i; j < a.length; j++) {
                while (minvalue > a[j]) {

                    minvalue = a[j];
                    minindex = j;

                }

            }
            if (minvalue < a[i]) {
                int tmp = a[i];
                a[i] = minvalue;
                minvalue = tmp;
            }
        }
        return a;
    }
}
