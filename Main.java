package com.company;

public class Main {

    public static void main(String[] args) {

        int[] p = {3,5,8,2,4};

        //InsertionSort is = new InsertionSort();
        //SelectionSort ss = new SelectionSort();
        MergeSort ms = new MergeSort();


       // int[] a =is.inserTionSort(array);
       // int[] b = ss.selectionSort(array);
        int[] c = ms.splitArray(p);

       for (int i = 0; i < p.length; i++){
           System.out.println(c[i]);
        }




    }
}
