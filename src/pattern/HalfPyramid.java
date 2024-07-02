package pattern;

public class HalfPyramid {
    public static void main(String[] args) {
        halfPyramid(6,6);
    }

    private static void halfPyramid(int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
