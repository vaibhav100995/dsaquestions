package dsaquestions;
//2148. Count Elements With Strictly Smaller and Greater Elements 
//
//Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
//
//Example 1:
//
//Input: nums = [11,7,2,15]
//Output: 2
//Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
//Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
//In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
//
//Example 2:
//
//Input: nums = [-3,3,3,90]
//Output: 2
//Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
//Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
public class SmallerAndGreaterCount {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		System.out.println(countElements(nums));

	}
	
	public static int countElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int cnt=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=max && nums[j]!=min){
                cnt++;
            }
        }
        return cnt;
    }

}
