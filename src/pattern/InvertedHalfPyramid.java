package pattern;

public class InvertedHalfPyramid {

    public static void main(String[] args) {
        invertedHalfPyramid(6,6);
    }

    private static void invertedHalfPyramid(int r, int c){
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
