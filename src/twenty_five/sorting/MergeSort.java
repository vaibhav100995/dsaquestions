package twenty_five.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {4,1,3,9,7};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /*
    * first pick mid of the array
    * then call below recursive function first for low->mid, then mid+1->high
    * at end call merge function to join low to high
    * */
    private static void mergeSort(int arr[], int l, int r) {
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    /*
    * left point to first left index of array(l)
    * right point to first right index of array(mid+1)
    * compare left index value with right index, whichever is smaller add in temp array and increase index of smaller element
    *
    * at end iterate on temp array from l->r and
    * insert temp array value into real arr array
    * */
    private static void merge(int[] arr, int low, int mid, int high){
        int temp[] = new int[high-low+1];
        int left=low;
        int right=mid+1;
        int i=0;
        while(left<=mid && right<=high){
            if(arr[left]>arr[right]){
                temp[i]=arr[right];
                right++;
            }else{
                temp[i]=arr[left];
                left++;
            }
            i++;
        }
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        for(int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }
}
