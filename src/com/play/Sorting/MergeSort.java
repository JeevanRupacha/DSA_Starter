package com.play.Sorting;

public class MergeSort {
    static int[] array;
    static int[] tempArr;
    public static void mergeSort(int[] arr){
        /** creating temp array that size of original array */
        tempArr = new int[arr.length];
        array = arr;
        int low = 0;
        int high = arr.length -1;
        divideArr(low,high);
    }

    public static void divideArr(int low,int high){
        int middle = (low+high)/2;

        /**check if array index goes out of bound */
        if(low<high){
            divideArr(low,middle);
            divideArr(middle+1, high);
            mergeArr(low,high,middle);
        }
    }

    public static void mergeArr(int low,int high, int middle){

        /** copying the all array element of original array */
        for(int i =low ; i<=high; i++){
            tempArr[i] = array[i];
        }

        int i =low;
        int j = middle+1;
        //// k is for indexing sorted array
        int k =low;

        /** checking the array ==i== for ==left divided array === ==j== for == right divided array */
        while( i <= middle && j <= high){
            if(tempArr[i] <= tempArr[j]){
                array[k] = tempArr[i];
                i++;
            }else{
                array[k] = tempArr[j];
                j++;
            }
            k++;
        }

        while(i<= middle){
            array[k] = tempArr[i];
            i++;
            k++;
        }
        while(j<= high){
            array[k] = tempArr[j];
            j++;
            k++;
        }
    }
}
