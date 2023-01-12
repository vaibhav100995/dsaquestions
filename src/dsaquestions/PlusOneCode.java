package dsaquestions;

import java.util.Arrays;

//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
//
// 
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
// 
//
//Constraints:
//
//1 <= digits.length <= 100
//0 <= digits[i] <= 9
//digits does not contain any leading 0's.

public class PlusOneCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3};
		System.out.println(Arrays.toString(plusOne(digits)));

	}
	
	public static int[] plusOne(int[] digits) {
        boolean rem=false;
        int n=digits.length;
        int[] ans = new int[n+1];
        if(digits[n-1]==9){
            ans[n]=0;
            rem=true;
        }else{
            ans[n]=digits[n-1]+1;
            rem=false;
        }
        for(int i=n-2;i>=0;i--){
            if(rem){
                if(digits[i]==9){
                    ans[i+1]=0;
                    rem=true;
                }else{
                    ans[i+1]=digits[i]+1;
                    rem=false;
                }
            }else{
                ans[i+1]=digits[i];
            }
        }
        if(rem){
            ans[0]=1;
        }
        int nz = 0;
        for(int k=0;k<ans.length;k++){
            if(ans[k]==0){
                nz++;
            }else{
                break;
            }
        }
        return Arrays.copyOfRange(ans, nz, ans.length);
    }

}