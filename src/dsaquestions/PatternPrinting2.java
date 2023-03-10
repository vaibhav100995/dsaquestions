package dsaquestions;

import java.util.Arrays;

//Print a Pattern According to The Given Value of A.
//
//Example: For A = 3 pattern looks like:
//
//    1
//  2 1
//3 2 1
//
//
//Problem Constraints
//
//1 <= A <= 1000
//
//
//Input Format
//
//First and only argument is an integer denoting A.
//
//
//
//Output Format
//
//Return a two-dimensional array where each row in the returned array represents a row in the pattern.
//
//

//Example Input
//
//Input 1:
//
// A = 3
//Input 2:
//
// A = 4
//
//
//Example Output
//
//Output :1
//
// [ 
//   [0, 0, 1]
//   [0, 2, 1]
//   [3, 2, 1]
// ]
//Output 2:
//
// [ 
//   [0, 0, 0, 1]
//   [0, 0, 2, 1]
//   [0, 3, 2, 1]
//   [4, 3, 2, 1]
// ]
//
//
//Example Explanation
//
//Explanation 2:
//
// 
// For A = 4 pattern looks like:  
//                                   1
//                                 2 1
//                               3 2 1
//                             4 3 2 1
// So we will return it as two-dimensional array. 
// Row 1 contains 3 spaces and 1 integer so spaces will be considered as 0 in the output.


public class PatternPrinting2 {

	public static void main(String[] args) {
		int[][] arr = solve(4);
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public static int[][] solve(int A) {
        int[][] arr = new int[A][A];
        int k=A-1;
        for(int i=0;i<A;i++){
            int count=1;
            for(int j=A-1;j>=k;j--){
                arr[i][j]=count;
                count++;
            }
            k--;
        }
        return arr;
    }

}
