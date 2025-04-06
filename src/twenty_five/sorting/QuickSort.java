package twenty_five.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int partition = findPartition(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }

    /*
    * pick low element as pivot element
    * initiate 2 variable i and j, assign low in i and high in j
    * run a while loop i<j
    * check if a[i] element is lower or equal to pivot element increase i counter
    * check if a[j] element is greater than pivot element decrease j counter
    * after above 2 check if j is greater than i swap a[i] element with a[j] element
    *
    * after ending main while loop swap a[j] element with pivot/low element
    * return j;
    * */
    private static int findPartition(int[] arr, int low, int high){
        int pivot=low;
        int i=low;
        int j=high;
        while (i<j){
            while (i<=high && arr[i]<=arr[pivot]){
                i++;
            }
            while (j>=low && arr[j]>arr[pivot]){
                j--;
            }
            if(j>i){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp1=arr[low];
        arr[low]=arr[j];
        arr[j]=temp1;
        return j;
    }
}
