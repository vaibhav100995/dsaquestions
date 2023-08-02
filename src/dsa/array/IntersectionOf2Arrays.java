package dsa.array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3};
        System.out.println(doIntersection(a,b));
    }

    public static int doIntersection(int a[], int b[])
    {

        Set<Integer> set = new HashSet<>();
        Set<Integer> hashet = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
           if(set.contains(b[i])){
               hashet.add(b[i]);
           }
        }
        return hashet.size();
    }
}
