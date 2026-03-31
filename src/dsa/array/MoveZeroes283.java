package dsa.array;

import java.util.Arrays;

public class MoveZeroes283 {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        while(n>j){
            if(nums[i]==0 && nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j++;
            }else if(nums[i]==0 && nums[j]==0){
                j++;
            }else{
                i++;
                j++;
            }
        }
    }
}
