package com.play.Sorting;

import com.sun.tools.javac.Main;
import org.junit.Test;

public class SelectionSort {

    public final static  void selectionSort(int arr[]){

        for(int i =0; i<arr.length-1; i++) {
            int min = i;
            for(int j= i+1; j<arr.length; j++ ){
                if(arr[j] < arr[min]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
