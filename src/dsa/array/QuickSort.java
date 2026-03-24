package dsa.array;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4,5,3,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high){
        if(high>low){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int p = low;
        int q = high;
        while(q>p){

            while (arr[p]<=pivot && p<=high){
                p++;
            }
            while (arr[q]>pivot && q>=low){
                q--;
            }

            if(q>p){
                int temp=arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
            }

        }

        arr[low] = arr[q];
        arr[q] = pivot;
        return q;
    }
}
