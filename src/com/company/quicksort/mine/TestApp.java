package com.company.quicksort.mine;

public class TestApp {
    static void quicksort ( int [] arr, int lo, int hi)
    {
        int c;
        if (lo > hi)
            return;
        int mid = lo + (hi -lo) / 2;
        int pivot = arr[mid];
        int i =lo;
        int j = hi;

        while ( i <= j ) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j)
            {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                ++i;
                --j;
            }
        }

        if (lo < j)
            quicksort (arr, lo, j);
        if (hi > i )
            quicksort(arr, i, hi);

    }
    public static void main (String [] args)
    {
        int arr [] = {6,8,2,4,3,8,1};
        quicksort(arr, 0, arr.length - 1);
        for (int i : arr)
        {
            System.out.print(i);
        }
    }
}
