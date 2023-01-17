package dsaquestions;


//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.
//
// 
//
//Example 1:
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
//
//
//Example 2:
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false
// 
//
//Constraints:
//
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 100
//-104 <= matrix[i][j], target <= 104


public class Searcha2DSortedMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6}};
		System.out.println(searchMatrix(matrix,5));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==target){
                return true;
            }else if(matrix[i][0]>target){
                row=i-1;
                break;
            }else if(i==matrix.length-1){
                row=i;
            }
        }

        if(matrix[row][matrix[0].length-1]<target){
            return false;
        }else{
            for(int y=0;y<matrix[0].length;y++){
                if(matrix[row][y]==target){
                    return true;
                }
            }
        }
        return false;
    }

}
