package dsaquestions;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(5));
	}
	
	public static int mySqrt(int x) {
		int l=1;
        int r=x;
        if(x==0){
            return 0;
        }
        int ans=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid>x/mid){
                r=mid-1;
            }else{
                l=mid+1;
                ans=mid;
            }
        }
        return ans;
    }

}
