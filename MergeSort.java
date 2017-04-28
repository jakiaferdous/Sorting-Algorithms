package com.company;

/**
 * Created by tuntun on 4/25/17.
 */
public class MergeSort {


    public int[] splitArray(int[] a) {

        int len = a.length;
        int mid = len / 2;

        int[] LeftArray = new int[mid];
        int[] RightArray = new int[len - mid];


        if (len <= 1) {
            return a;
        } else {



            for (int i = 0; i < mid; i++) {

                LeftArray[i] = a[i];
            }

            for (int x = 0, i = mid; i < len; i++, x++) {
                if (x < len) {
                    RightArray[x] = a[i];
                }
            }

        }
            RightArray = splitArray(RightArray);
            LeftArray = splitArray(LeftArray);

            a =mergeSort(LeftArray, RightArray);

            return a;



    }


    public int[] mergeSort(int[] LA, int[] RA) {

        int[] a = new int[LA.length + RA.length];
        int k = 0, i = 0, j = 0;

        while (i < LA.length || j < RA.length) {

            if (i < LA.length && j < RA.length) {
                if (LA[i] <= RA[j]) {
                    a[k] = LA[i];
                    k++;
                    i++;
                } else {
                    a[k] = RA[j];
                    k++;
                    j++;
                }
            } else if (i < LA.length) {
                a[k] = LA[i];
                k++;
                i++;
            } else if (j < RA.length) {
                a[k] = RA[j];
                k++;
                j++;
            }
        }
        return a;
    }
}
