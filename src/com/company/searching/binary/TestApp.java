package com.company.searching.binary;

public class TestApp {
    public static void binarySearch (int [] arr, int lo, int hi, int elem)
    {
        if (lo > hi) {
            System.out.println("Item not found");
            return;
        }
        int mid = lo + (( hi - lo) / 2);
        if (arr[mid] == elem) {
            System.out.println("Item found");
            return;
        }
        if (elem > arr[mid])
            binarySearch(arr, mid + 1, hi, elem);
        if (elem < arr[mid])
            binarySearch(arr, lo, mid -1, elem);

    }
    public static void main (String [] args)
    {
        int arr [] = new int [10];
        for (int i = 0; i < 10; ++i)
        {
            arr[i] = i;
        }

        binarySearch(arr, 0, 9, 8);
    }
}
