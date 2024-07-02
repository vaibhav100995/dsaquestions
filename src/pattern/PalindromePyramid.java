package pattern;

public class PalindromePyramid {

    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n){
        for(int i=n;i>0;i--){
            int count=1;
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print(count+" ");
                    count++;
                }else{
                    System.out.print("  ");
                }
            }
            count=n-i;
            for(int k=i;k<n;k++){
                System.out.print(count+" ");
                --count;
            }
            System.out.println();
        }
    }

}
