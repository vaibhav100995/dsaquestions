package dsa.array;

import java.util.Stack;

public class MonotonicStack {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,7,8};
        int[] arr = {2,1,2};
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n=heights.length;
        int max=heights[0];
        stack.push(0);
        int count=0;
        if(max==0){
            count=0;
        }else{
            count=1;
        }
        for(int i=1;i<=n;i++){
            int j=i-1;
            while((i==n && !stack.isEmpty()) || (j>=0 && i!=n && heights[i]<heights[j])){
                int k = stack.pop();
                int h = heights[k];
                int w = i - k;
                if((h*w)>max){
                    max=h*w;
                }
                j--;
            }
            stack.push(i);
            if(i!=n){
                if(heights[i]==0){
                    if(max<count){
                        max=count;
                    }
                    count=0;
                }else{
                    count++;
                }
            }
        }
        if(count>max){
            max=count;
        }
        return max;
    }
}
