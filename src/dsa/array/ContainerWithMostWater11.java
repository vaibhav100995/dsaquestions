package dsa.array;

public class ContainerWithMostWater11 {

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(j>i){
            int small;
            if(height[i]>height[j]){
                small=height[j];
            }else{
                small=height[i];
            }
            int area = (j-i)*small;
            max=Math.max(max,area);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
