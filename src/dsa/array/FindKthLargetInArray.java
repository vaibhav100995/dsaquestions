package dsa.array;

import java.util.Arrays;

public class FindKthLargetInArray {

    public static void main(String[] args) {
        int[] a = {1,2,5,8,4};
        kLargest(a,2);
    }

    private static void kLargest(int[] a, int k){
        Arrays.sort(a);
        System.out.println(a[a.length-k]);
    }
}
