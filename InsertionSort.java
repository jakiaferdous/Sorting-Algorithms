package com.company;

/**
 * Created by tuntun on 4/25/17.
 */
public class InsertionSort {

    public int[] inserTionSort(int[] list) {

        int k, temp;

        for (int i = 1; i < list.length; i++) {

            k = list[i];
            int j = i - 1;

            while (j >= 0 && k < list[j]) {

                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;

            }
        }
        return list;
    }
}
