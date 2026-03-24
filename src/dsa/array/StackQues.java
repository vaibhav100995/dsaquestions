package dsa.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackQues {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,7,8};
        int[] arr = {2,3,4};
        System.out.println(betterApproach(arr,4));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // list.add("Push");
        int count=0;
        int i=0;
        while(i<n){
            if(!stack.isEmpty()){
                if(stack.peek()==target[target.length-1]){
                    return list;
                }
                if(stack.peek()==target[count]){
                    count++;
                }else{
                    int j=count;
                    while(!stack.isEmpty() && j>=0 && stack.peek()!=target[j]){
                        stack.pop();
                        list.add("Pop");
                        j--;
                    }
                }
            }
            stack.push(i+1);
            list.add("Push");
            i++;
        }
        return list;
    }

    public static List<String> betterApproach(int[] target, int n){
        List<String> list = new ArrayList<>();
        int i=0;
        for(int num=1; num<=n && i<target.length; num++){
            list.add("Push");

            if(target[i]==num){
                i++;
            }else{
                list.add("Pop");
            }
        }
        return list;
    }
}
