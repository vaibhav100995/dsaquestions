package dsaquestions;

public class Pow {

	public static void main(String[] args) {
		System.out.println(myPow(2.00000, -2));
	}
	
	public static double myPow(double x, int n) {
		double o=1;
        if(n==0 || x==1.00000){
            return 1.00000;
        }else if(x==-1.00000){
            if(n%2==0){
                return 1.00000;
            }else{
                return -1.00000;
            }
        }else if(n>0){
            for(int i=0;i<n;i++){
                o=(o*x);
            }
        }else{
        	if(n==Integer.MIN_VALUE) {
        		return 0;
        	}
            int m = n*(-1);
            for(int i=0;i<m;i++){
                o=o/x;
            }
        }
        return o;
    }

}
