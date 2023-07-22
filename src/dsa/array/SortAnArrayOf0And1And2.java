package dsa.array;

import java.util.Arrays;

public class SortAnArrayOf0And1And2 {

    public static void main(String[] args) {
        int[] a = {0,0,1,0,2,1,1,2};
        System.out.println(Arrays.toString(sort012(a, a.length)));
    }

    public static int[] sort012(int[] a, int n)
    {
        int count0=0;
        int count1=0;
//        int count2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count0++;
            }else if(a[i]==1){
                count1++;
            }
//            else{
//                count2++;
//            }
        }

        int k;
        for(k=0;k<count0;k++){
            a[k]=0;
        }
        for(; k<count0+count1; k++){
            a[k]=1;
        }
        for(;k<n;k++){
            a[k]=2;
        }
        return a;
    }
}
