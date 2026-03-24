package dsa.array;

import java.util.Arrays;

public class Solution {

    static int[] prefixSum;
    static int n;
    public Solution(int[] w) {
        n=w.length;
        prefixSum = new int[n];
        prefixSum[0]=w[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+w[i];
        }
    }

    public static int pickIndex() {
        int num= (int) (Math.random()%prefixSum[n-1]);
        return upperBound(prefixSum, num);
    }

    public static int upperBound(int[] preSum, int key) {
        int index = Arrays.binarySearch(preSum, key);
        if (index < 0) {
            // If not found, binarySearch returns (-(insertion point) - 1)
            index = -(index + 1);
        } else {
            // If found, move to the next greater element
            while (index < preSum.length && preSum[index] == key) {
                index++;
            }
        }
        return index; // This is the "upper bound" index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3};
        Solution solution = new Solution(arr);
        System.out.println("Upper bound index: " + pickIndex()); // Output: 5
//        System.out.println("Element at upper bound: " + arr[ub]); // Output: 6
    }


}
