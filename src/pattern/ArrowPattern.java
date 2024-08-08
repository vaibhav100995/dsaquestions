package pattern;

public class ArrowPattern {
    public static void main(String[] args) {
        printPattern(9);
    }

    private static void printPattern(int n){
        int count=0;
        boolean increment=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2){
                    System.out.print("*");
                }else if(j==count || n-1-count==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(n/2==count){
                increment=false;
            }
            if(increment){
                count++;
            }else{
                count--;
            }
            System.out.println();
        }
    }
}
