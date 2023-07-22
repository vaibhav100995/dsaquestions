package dsa.array;

public class MaxAndMinElementofarray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,9,2,0};
        maxAndMin(a);
    }

    private static void maxAndMin(int[] a){
        int n = a.length;
        int min=a[0];
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Max Element is -> "+max+" & Min Element is -> "+min);
    }
}
