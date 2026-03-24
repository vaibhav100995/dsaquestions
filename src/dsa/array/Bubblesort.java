package dsa.array;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] arr = {5,9,8,4,2};
        System.out.println(Arrays.toString(bubble(arr)));
    }

    private static int[] bubble(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){ //stop early if no swaps
                System.out.println("i value "+i);
                break;
            }
        }
        return arr;
    }
}
