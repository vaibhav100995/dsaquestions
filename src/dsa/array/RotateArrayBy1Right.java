package dsa.array;

import java.util.Arrays;

public class RotateArrayBy1Right {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(a,a.length)));
    }

    public static int[] rotate(int arr[], int n)
    {
        int[] c= new int[n];
        for (int i = 0; i < arr.length; i++)
            c[i] = arr[i];
        int B = 1;
        for(int i=0;i<n;i++){
            arr[i] = c[(i+n-B)%n];
        }
        return arr;
    }
}


