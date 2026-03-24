package dsa.array;

public class MinSizeSubarraySum209 {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,7,8};
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int[] prefixSum = new int[n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }
        int i=n;
        int j=n-1;
        int min=Integer.MAX_VALUE;
        while(j>=0 && i>j && i>=0){
            int rem=prefixSum[i]-prefixSum[j];
            if(rem>target){
                i--;
            }else if(target>rem){
                j--;
            }else{
                int diff=i-j;
                if(diff==1){
                    return 1;
                }
                if(diff<min){
                    min=diff;
                }
                i--;
                j--;
            }
        }
        if(min==Integer.MAX_VALUE){
            min=0;
        }
        return min;
    }
}
