package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class CountGoodSubstrings1876 {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {
//        int count=0;
        int k=3;
//        int distinctCount=0;
//        int[] chars = new int[26];
//        char[] strChar = s.toCharArray();
//        for(int i=0;i<k;i++){
//            if(chars[strChar[i]-'a']==0){
//                chars[strChar[i]-'a']++;
//                count++;
//            }
//        }
//        if(count==k){
//            distinctCount++;
//        }
//
//        for(int i=k;i<s.length();i++){
//            chars[strChar[i-k]-'a']--;
//            if(chars[strChar[i-k]-'a']==0){
//                count--;
//            }
//            if(chars[strChar[i]-'a']==0){
//                count++;
//            }
//            chars[strChar[i]-'a']++;
//            if(count==k){
//                distinctCount++;
//            }
//        }
//
//        return distinctCount;
        int[] freq = new int[26]; // only lowercase English letters
        int distinct = 0, count = 0;

        // Initialize first window
        for (int i = 0; i < k; i++) {
            int idx = s.charAt(i) - 'a';
            if (freq[idx] == 0) distinct++;
            freq[idx]++;
        }
        if (distinct == k) count++;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            int addIdx = s.charAt(i) - 'a';
            int removeIdx = s.charAt(i - k) - 'a';

            // Remove outgoing char
            freq[removeIdx]--;
            if (freq[removeIdx] == 0) distinct--;

            // Add incoming char
            if (freq[addIdx] == 0) distinct++;
            freq[addIdx]++;

            // Check distinctness
            if (distinct == k) count++;
        }

        return count;

    }
}
