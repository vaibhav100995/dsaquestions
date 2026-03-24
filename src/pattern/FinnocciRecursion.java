package pattern;

public class FinnocciRecursion {

    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            System.out.println(fibnocci(i));
        }
//        System.out.println(fibnocci(3));
    }

    private static int fibnocci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibnocci(n-1)+fibnocci(n-2);
        }
    }


}
