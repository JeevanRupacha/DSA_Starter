package com.play.Search;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTest {

    @Test
    public void binarySearch(){
        int arr[] = {1,4,5,6,9,10,34};
        Assert.assertEquals(BinarySearch.binarySearch(arr,0,arr.length - 1,34),1);
       Assert.assertEquals(BinarySearch.binarySearch(arr,0,arr.length - 1,1),1);
        Assert.assertEquals(BinarySearch.binarySearch(arr,0,arr.length - 1,6),1);
        Assert.assertEquals(BinarySearch.binarySearch(arr,0,arr.length - 1,40),-1);
        Assert.assertEquals(BinarySearch.binarySearch(arr,0,arr.length - 1,-1),-1);
    }
}
