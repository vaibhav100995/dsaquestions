package twenty_five.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {4,4,1,98,0,2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    /*
    * compare current element with previous element
    * if previous element is greater than current element then swap with each other,
    * then decrease index(j--) and again repeat the step by when
    * either j reaches to 0 or current element is smaller than previous element
    *
    * and repeat complete process for each element
    * */
    private static void insertionSort(int a[]) {
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
}
