package dsa.array;

import java.util.Arrays;

public class Insertionsort {

    public static void main(String[] args) {
        int[] arr = {5,9,8,4,2};
        System.out.println(Arrays.toString(insertion(arr)));
    }

    private static int[] insertion(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
