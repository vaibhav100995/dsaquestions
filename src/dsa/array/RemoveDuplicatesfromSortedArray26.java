package dsa.array;

public class RemoveDuplicatesfromSortedArray26 {

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count=1;
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=a){
                nums[count]=nums[i];
                count++;
                a=nums[i];
            }
        }
        return count;
    }
}
