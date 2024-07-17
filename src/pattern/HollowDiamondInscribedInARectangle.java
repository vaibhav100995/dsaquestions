package pattern;

public class HollowDiamondInscribedInARectangle {

    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n){
        int count=n;
        boolean zero=false;
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=2*n;j++){
                if(count>=j){
                    System.out.print("*");
                }else if(2*n-count<j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(zero){
                count++;
            }else{
                count--;
            }
            if(count==0){
                zero=true;
                count=1;
            }
            System.out.println();
        }
    }
}
