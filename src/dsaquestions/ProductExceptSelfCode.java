package dsaquestions;

import java.util.Arrays;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
// 
//
//Constraints:
//
//2 <= nums.length <= 105
//-30 <= nums[i] <= 30
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

public class ProductExceptSelfCode {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int x=1;
        int[] ans = new int[nums.length];
        boolean zero=false;
        int zcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                x=x*nums[i];  
            }else{
                zero=true;
                zcount++;
            }
        }
        if(zcount>1){
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(zero){
                if(nums[i]!=0){
                    ans[i]=0;
                }else{
                    ans[i]=x;
                }
            }else{
                ans[i]=x/nums[i];
            }
        }
        return ans;
    }

}
