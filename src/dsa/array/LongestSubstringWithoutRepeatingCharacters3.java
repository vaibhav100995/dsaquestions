package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
        int left=0;
        int max=0;
        int right=0;
        for(;right<s.length();right++){
            int indx = map.getOrDefault(s.charAt(right),-1);
            if(indx!=-1 && indx >= left){
                max=Math.max(max, right-1-left+1);
                left=indx+1;
            }

            map.put(s.charAt(right),right);
        }
        return Math.max(max, right-1-left+1);
    }
}
