package dsaquestions.allarrayelementequals;

//Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
//
//In one move, you can INCREMENT N - 1 ELEMENTS of the array by 1.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: 3
//Explanation: Only three moves are needed (remember each move increments two elements):
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
//Example 2:
//
//Input: nums = [1,1,1]
//Output: 0
// 
//
//Constraints:
//
//n == nums.length
//1 <= nums.length <= 105
//-109 <= nums[i] <= 109
//The answer is guaranteed to fit in a 32-bit integer.

public class MinimumMovesToEqualArrayElements {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(minMoves(nums));
	}
	
	public static int minMoves(int[] nums) {
        int count=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            count=count+(nums[i]-min);
        }
        return count;
    }

}
