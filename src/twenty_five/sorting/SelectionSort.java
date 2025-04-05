package twenty_five.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1,6,2,8,5};
        selectionSortAlgo(a);
        System.out.println(Arrays.toString(a));
    }

    /*
    * Pick the smallest element from array
    * then swap that element with the first loop index(means from i index from below example)
    * Repeat above steps for each element
    * */
    private static void selectionSortAlgo(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=a[i];
            int minIndex=i;
            for(int j=i;j<n;j++){
                if(min>a[j]){
                    min=a[j];
                    minIndex=j;
                }
            }
            if(min!=a[i]){
                int temp=a[i];
                a[i]=a[minIndex];
                a[minIndex]=temp;
            }
        }
    }
}
