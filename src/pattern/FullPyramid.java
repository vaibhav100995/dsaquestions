package pattern;

public class FullPyramid {
    public static void main(String[] args) {
        printPyramid(6,6);
    }

    private static void printPyramid(int r, int c){
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<c;j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
