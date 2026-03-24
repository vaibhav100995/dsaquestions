package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArraySum {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,7,8};
        int[] arr = {1,0};
        System.out.println(checkSubarraySum(arr,2));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,0);

        int sum = 0;

        for(int i=0; i<nums.length; i++){

            sum += nums[i];

            if(!map.containsKey(sum % k)){
                map.put(sum % k, 1);
            }else{
                 if(map.get(sum % k) < i){
                return true;
                 }
            }

        }

        return false;
    }
}
