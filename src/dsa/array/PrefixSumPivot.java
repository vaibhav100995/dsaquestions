package dsa.array;

public class PrefixSumPivot {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,7,8};
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int n=nums.length;
        int rightSum=nums[0];
        int l=1;
        while(l<n){
            rightSum=nums[l]+rightSum;
            l++;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            rightSum=rightSum-nums[i];
            if(rightSum==leftSum){
                return i;
            }
            leftSum=leftSum+nums[i];
        }
        return -1;
    }
}
