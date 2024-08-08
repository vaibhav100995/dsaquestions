package pattern;

public class DiagonalsPattern {
    public static void main(String[] args) {
        printPattern(7);
    }

    private static void printPattern(int n){
        int count=0;
        boolean increment=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
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
