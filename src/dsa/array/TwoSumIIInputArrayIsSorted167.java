package dsa.array;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted167 {

    public static void main(String[] args) {
        int[] a={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] ans = new int[2];
        while(j>i){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}
