package com.play.Sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr)
    {
        int[] sortedArr = new int[arr.length];

        for(int i=1; i<arr.length ; i++){
            int temp;
            for(int j=i;j>0; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
