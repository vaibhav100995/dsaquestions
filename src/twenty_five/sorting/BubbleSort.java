package twenty_five.sorting;

import java.util.Arrays;


public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {4,1,9,2,1,0};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    /*
    * check current element with next element,
    * if current element is greater than next element then swap elements
    * iterate above steps
    * */
    private static void bubbleSort(int a[]) {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean everythingSorted=true;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    everythingSorted=false;
                }
            }
            if(everythingSorted){
                break;
            }
        }
    }
}
