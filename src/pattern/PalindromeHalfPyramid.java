package pattern;

public class PalindromeHalfPyramid {

    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
