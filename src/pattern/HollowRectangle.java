package pattern;

public class HollowRectangle {

    public static void main(String[] args) {
        printPattern(3,5);
    }

    private static void printPattern(int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || i==r-1){
                    System.out.print("* ");
                }else{
                    if(j==0 || j==c-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
