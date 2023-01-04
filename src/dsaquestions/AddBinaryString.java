package dsaquestions;

//Given two binary strings a and b, return their sum as a binary string.
//
//		 
//
//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//
//Input: a = "1010", b = "1011"
//Output: "10101"
// 
//
//Constraints:
//
//1 <= a.length, b.length <= 104
//a and b consist only of '0' or '1' characters.
//Each string does not contain leading zeros except for the zero itself.

public class AddBinaryString {

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}
	
	public static String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        String finalString="";
        int rem = 0;
        while(aLength != 0 && bLength != 0){
            if(rem==0){
                if(a.charAt(aLength-1)=='0' && b.charAt(bLength-1)=='0'){
                    finalString = '0' + finalString;
                    rem=0;
                }else if(a.charAt(aLength-1)=='1' && b.charAt(bLength-1)=='1'){
                    finalString = '0' + finalString;
                    rem=1;
                }else{
                    finalString = '1' + finalString;
                    rem=0;
                }
            }else{
                if(a.charAt(aLength-1)=='0' && b.charAt(bLength-1)=='0'){
                    finalString = '1' + finalString;
                    rem=0;
                }else if(a.charAt(aLength-1)=='1' && b.charAt(bLength-1)=='1'){
                    finalString = '1' + finalString;
                    rem=1;
                }else{
                    finalString = '0' + finalString;
                    rem=1;
                }
            }
            aLength--;
            bLength--;
        }
        while(aLength!=0){
            if(rem==0){
                return a.substring(0,aLength)+finalString;
            }else{
                if(a.charAt(aLength-1)=='1'){
                    finalString = '0'+finalString;
                    rem=1;
                    aLength--;
                }else{
                    finalString = '1'+finalString;
                    return a.substring(0,aLength-1)+finalString;
                }
            }
        }
        while(bLength!=0){
            if(rem==0){
                return b.substring(0,bLength)+finalString;
            }else{
                if(b.charAt(bLength-1)=='1'){
                    finalString = '0'+finalString;
                    rem=1;
                    bLength--;
                }else{
                    finalString = '1'+finalString;
                    return b.substring(0,bLength-1)+finalString;
                }
            }
        }
        if(aLength == 0 && bLength == 0 && rem==1){
            return '1'+finalString;
        }
        return finalString;
    }
}
