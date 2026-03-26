package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString438 {

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int[] p1=new int[26];
        int[] s1=new int[26];
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        if(k>s.length()){
            return list;
        }
        int i;
        for(i=0;i<k;i++){
            p1[p.charAt(i)-'a']++;
            s1[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(p1,s1)){
            list.add(i-k);
        }
        for(int j=k;j<s.length();j++){
            s1[s.charAt(j-k)-'a']--;
            s1[s.charAt(j)-'a']++;
            if(Arrays.equals(p1,s1)){
                list.add(j+1-k);
            }
        }
        return list;
    }
}
