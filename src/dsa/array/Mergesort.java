package dsa.array;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] arr = {4,5,3,8};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int l, int r){
        System.out.println("ll="+l+",rr="+r);
        if(r>l){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merger(arr,l,mid,r);
        }
    }

    private static void merger(int[] arr, int l, int mid, int r){
        System.out.println("l="+l+",r="+r+",mid="+mid);
        int[] temp = new int[r+1-l];
        int i=0;
        int left=l;
        int right=mid+1;
        while(mid>=left && r>=right){
            if(arr[left]>arr[right]){
                temp[i] = arr[right];
                right++;
            }else {
                temp[i] = arr[left];
                left++;
            }
            i++;
        }

        while(mid>=left){
            temp[i] = arr[left];
            left++;
            i++;
        }

        while(r>=right){
            temp[i] = arr[right];
            right++;
            i++;
        }

        for(int j=l;j<=r;j++){
            arr[j]=temp[j-l];
        }
    }
}
