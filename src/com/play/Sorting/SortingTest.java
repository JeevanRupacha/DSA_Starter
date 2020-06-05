package com.play.Sorting;

import org.junit.Test;

public class SortingTest {

    public static void print(int arr[]){
        for(int num: arr){
            System.out.print("  "+ num);
        }
        System.out.println("");
    }


    @Test
    public void insertionSortTest(){
            int []arr = {2,9,5,7,3,9,1};
            int []arr2 = {2,0,5,7,-13,9,-11};
            InsertionSort.insertionSort(arr);
            InsertionSort.insertionSort(arr2);
            print(arr);
            System.out.println(" --------");
            print(arr2);
    }

    @Test
    public void selectionSortTest(){
        int []arr = {2,9,5,7,3,9,1};
        int []arr2 = {2,0,5,7,-13,9,-11};
        SelectionSort.selectionSort(arr);
        SelectionSort.selectionSort(arr2);
        print(arr);
        System.out.println(" --------");
        print(arr2);
    }

    @Test
    public void bubbleSortTest(){
        int []arr = {2,9,5,7,3,9,1};
        int []arr2 = {2,0,5,7,-13,9,-11};
        BubbleSort.bubbleSort(arr);
        BubbleSort.bubbleSort(arr2);
        print(arr);
        System.out.println(" --------");
        print(arr2);
    }

    @Test
    public void mergeSort(){
        int []arr = {2,9,5,7,3,9,1};
        int []arr2 = {2,0,5,7,-13,9,-11};
        MergeSort.mergeSort(arr);
        MergeSort.mergeSort(arr2);
        print(arr);
        System.out.println(" --------");
        print(arr2);
    }
}
