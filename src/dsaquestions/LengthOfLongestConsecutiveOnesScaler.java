package dsaquestions;


//Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
//
//
//Input Format
//
//The only argument given is string A.
//Output Format
//
//Return the length of the longest consecutive 1’s that can be achieved.
//Constraints
//
//1 <= length of string <= 1000000
//A contains only characters 0 and 1.
//For Example
//
//Input 1:
//    A = "111000"
//Output 1:
//    3
//
//Input 2:
//    A = "111011101"
//Output 2:
//    7

public class LengthOfLongestConsecutiveOnesScaler {

	public static void main(String[] args) {
		System.out.println(solve("111011101"));
	}
	
	public static int solve(String A) {
	        int flip=0;
	        int j=0;
	        int ans=0;
	        int i=0;
	        int onecount=0;
	        while(i<A.length()){
	            if(A.charAt(i)=='0'){
	                flip++;
	            }else{
	                onecount++;
	            }
	            while(flip>1){
	                if(A.charAt(j)=='0'){
	                    flip--;
	                }
	                j++;
	            }
	            
	            ans=Math.max(ans,i-j+1);
	            i++;
	        }
	        if(ans>onecount){
	            return onecount;
	        }
	        return ans;
	    }

}
