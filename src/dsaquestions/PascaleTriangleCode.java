package dsaquestions;

import java.util.ArrayList;
import java.util.List;


//Given an integer numRows, return the first numRows of Pascal's triangle.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//
// 
//
//Example 1:
//
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//Example 2:
//
//Input: numRows = 1
//Output: [[1]]
// 
//
//Constraints:
//
//1 <= numRows <= 30


public class PascaleTriangleCode {

	public static void main(String[] args) {
		generate(5).stream().forEach(z-> System.out.println(z));
	}
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList();
        int j=1;
        for(int i=0;i<numRows;i++){
            List<Integer> newList = new ArrayList();
            newList.add(1);
            for(int k=1;k<j;k++){
                if(k!=j-1){
                    newList.add(list.get(i-1).get(k-1)+list.get(i-1).get(k));
                }else{
                    newList.add(1);
                }
            }
            list.add(newList);
            j++;
        }
        return list;
    }

}
