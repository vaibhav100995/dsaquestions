package dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountBiggerArraysElements {

    public static void main(String[] args) {
        int[] arr = {60,14,3,39,49,43,53,24,33,13,32,93,65,26,77,55,2,28,2,50,18,4,92,20,57,90,64,86,54,69,28,80,88,66,57,28,67,83,3,50,86};
        int[] a = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(a));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // Arrays.sort(nums);
        int[] a = new int[nums.length];
        // Initialize indices
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i];
        }
        Arrays.sort(a);
        int[] arr= new int[nums.length];
        int i=nums.length-1;
        int count=0;
        Map<Integer,Integer> map = new HashMap();
        while(i>0){
            if(a[i]==28){
                System.out.println(a[i]);
            }
            if(a[i]==a[i-1]){
                count++;
                i--;
            }else{
                if(count>0){
                    if(!map.containsKey(a[i])){
//                        map.put(a[i],i-count+1);
                        map.put(a[i],i);
                    }
                    i--;
                }else{
                    if(!map.containsKey(a[i])){
                        map.put(a[i],i);
                    }
                    i--;
                }
                count=0;
            }
        }
        if(!map.containsKey(a[0])){
            map.put(a[0],0);
        }

        for(int l=0;l<nums.length;l++){
            arr[l]=map.get(nums[l]);
        }
        return arr;
    }
}
