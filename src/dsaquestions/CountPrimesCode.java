package dsaquestions;


//Given an integer n, return the number of prime numbers that are strictly less than n.
//
//		 
//
//Example 1:
//
//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//Example 2:
//
//Input: n = 0
//Output: 0
//Example 3:
//
//Input: n = 1
//Output: 0
// 
//
//Constraints:
//
//0 <= n <= 5 * 106

public class CountPrimesCode {

	public static void main(String[] args) {
		System.out.println(countPrimes(2));
	}
	
	public static int countPrimes(int n) {
        if(n < 3)
            return 0;
        int cnt = 0;
        boolean[] prime= new boolean[n];
        for(int i = 2 ; i < n ; i++)
            prime[i] = true;
        for(int i = 2 ; i * i < n ; i++)
        {
            if(prime[i]){
                for(int j = i * i ; j < n ; j += i)
                    prime[j] = false;
            }
        }
        for(int i = 2 ; i < n ; i++)
            if(prime[i])
                cnt++;
        return cnt;
    }

}
