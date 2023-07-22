package dsa.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(Arrays.toString(reverseArray(a)));
    }

    private static int[] reverseArray(int[] a){
        int end = a.length-1;
        int start = 0;
        while(end>start){
            int k=a[start];
            a[start]=a[end];
            a[end]=k;
            start++;
            end--;
        }
        return a;
    }
}
