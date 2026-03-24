package pattern;



public class Solution1 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sieve(n));
    }

    public static int[] sieve(int n) {
        // code here
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=i;
        }
        int count=0;
        for(int j=2;j<=n;j++){
            count = count + checkPrime(arr[j], arr, n);
        }
        int[] ab = new int[count];
        int m=0;
        for(int l=2;l<=n;l++){
            if(arr[l]!=0){
                ab[m]=arr[l];
                m++;
            }
        }
        return ab;

    }

    private static int checkPrime(int k, int[] arr, int n){
        if(k!=0){
            int j = k;
            for(j=j+k; j<=n; j += k){
                arr[j] = 0;
            }
            return 1;
        }
        return 0;
    }
}
