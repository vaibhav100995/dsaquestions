package dsa.array;

import java.util.Arrays;

public class GcdArray {
    public static void main(String[] args) {
        int[] arr = {16,15};
        System.out.println(gcd(2,arr));
    }

    public static int gcd(int n, int a[]) {
        // code here.

        int num=0;
        Arrays.sort(a);
        int max=a[0];
//        for(int i=0;i<n;i++){
//            num=0;
//            for(int j=0;j<n;j++){
//                if(i!=j) {
//                    if (a[i] > a[j]) {
//                        num = getGcd(a[i], a[j]);
//                    } else {
//                        num = getGcd(a[j], a[i]);
//                    }
//                }
//                if(num==1) break;
//            }
//            if(num<max){
//                max=num;
//            }
//        }

        for(int i=1;i<n;i++){
            num = getGcd(a[i],max);
            if(num<max){
                max=num;
            }
        }
        return max;
    }

    private static int getGcd(int a, int b){
//        if(b==0){
//            return a;
//        }else{
//            return getGcd(b,a%b);
//        }
        while(a%b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return b;
    }
}
