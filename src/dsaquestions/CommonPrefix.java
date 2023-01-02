package dsaquestions;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flight"};
		System.out.println(getPrefix(strs));
	}
	
	private static String getPrefix(String[] strs) {
		int j=0;
        boolean check=false;
        int min=strs[0].length();
        for(int k=1; k<strs.length; k++){
            min=Math.min(min,strs[k].length());
        }
        if(strs.length<2){
            return strs[0];
        }
        while(min>j){
            for(int i=0; i<strs.length-1; i++){
                if(strs[i].length()<=j){
                    check=false;
                    break;
                }
                char a1=strs[i].charAt(j);
                char b1=strs[i+1].charAt(j);
                if(strs[i].charAt(j)!=strs[i+1].charAt(j)){
                    check=false;
                    break;
                }
                check=true;
            }
            if(check){
                j++;
            }else{
                if(j==0){
                	return "";
                }else{
                	return strs[0].substring(0,j);
                }
            }
        }
        return strs[0].substring(0,j);
	}

}
