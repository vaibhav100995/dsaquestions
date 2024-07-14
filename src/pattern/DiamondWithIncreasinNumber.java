package pattern;

public class DiamondWithIncreasinNumber {
    public static void main(String[] args) {
        printPattern(4);
    }

    private static void printPattern(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==i){
                    System.out.print(count);
                }else{
                    System.out.print(count+"*");
                }
                count++;
            }
            System.out.println();
        }

        count=count-n;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(j==i){
                    System.out.print(count);
                }else{
                    System.out.print(count+"*");
                }
                count++;
            }
            System.out.println();
            count=count-(i)-(i-1)-2;
        }
    }
}
