package dsa.array;

import java.util.Arrays;

public class FindKthSmalletInArray {

    public static void main(String[] args) {
        int[] a = {1,2,5,8,4};
        kSmallest(a,2);
    }

    private static void kSmallest(int[] a, int k){
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }

}
