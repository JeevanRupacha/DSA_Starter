package com.play.Search;

public class BinarySearch {

    public final static int binarySearch( int arr[], int dn, int up, int key){

        if(up >= dn){
            int mid = (int)(up+ dn)/2 ;

            if(arr[mid] == key){
                return 1;
            }
            if(key < arr[mid]){
               return binarySearch(arr, dn,mid-1,key);
            }

            return binarySearch(arr,mid+1, up,key);
        }

        return -1;
    }
}
