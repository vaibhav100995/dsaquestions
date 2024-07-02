package pattern;

public class SolidRectangle {

    public static void main(String[] args) {
        int r=3;
        int c=5;
        printPattern(r,c);
    }

    private static void printPattern(int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
