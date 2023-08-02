package dsa.array;

import java.util.Arrays;

public class MoveNegativeToOneSideOfArray {

    public static void main(String[] args) {
        int[] a = {-23, 48, -13, 31, -12, 6, -42, 23, 14, 33, -33, -21, 0, 25, -39, -31};
        System.out.println(Arrays.toString(arrangeArray(a)));
    }

    public static int[] arrangeArray(int[] a){
        int start=0;
        int end=a.length-1;
        while(end>=start){
            if(a[start]<0 && a[end]<=0){
                start++;
            }else if(a[start]>0 && a[end]>=0){
                end--;
            }else if(a[start]>0 && a[end]<0){
                int temp = a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }else{
                start++;
                end--;
            }
        }
        return a;
    }
}
