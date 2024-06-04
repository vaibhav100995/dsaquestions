package dsa.array;



/*You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

        Return the single element that appears only once.

        Your solution must run in O(log n) time and O(1) space.

        Example 1:

        Input: nums = [1,1,2,3,3,4,4,8,8]
        Output: 2
        Example 2:

        Input: nums = [3,3,7,7,10,11,11]
        Output: 10


        Constraints:

        1 <= nums.length <= 105
        0 <= nums[i] <= 105*/
public class SingleElementInASortedArray {
    public static void main(String[] args) {
      int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=1;
        if(nums.length==1){
            return nums[0];
        }
        while(i<nums.length){
            if(j>=nums.length){
                return nums[i];
            }
            if(nums[i]!=nums[j]){
                return nums[i];
            }
            i=i+2;
            j=j+2;
        }
        return 0;
    }

}
