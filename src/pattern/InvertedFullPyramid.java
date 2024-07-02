package pattern;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        printPyramid(6,6);
    }

    private static void printPyramid(int r, int c){
        for(int i=0;i<r;i++){
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
