package pattern;

public class SolidDiamod {

    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
