//package pattern;
//
///* Java program for diamond pattern printing using numbers */
//
//import java.util.*;
//
//public class abb
//
//{
//
//    public static void main(String[] args)
//
//    {
//
//        Scanner sc = new Scanner(System.in);
//
//        int i,j,s,N,count=0;
//
//        s = sc.nextInt();
//
//        N = sc.nextInt();
//
//        for(i=s;count<4;count++)
//
//        {
//
//            for(j=0;j<count+1;j++)
//
//                System.out.print(i);
//
//            System.out.print(“n”);
//
//            i=i+1;
//
//        }
//
//        for(i=s+N-2;count>0;count–)
//
//        {
//
//            for(j=0;j<count-1;j++)
//
//                System.out.print(i);
//
//            System.out.print(“n”);
//
//            i=i-1;
//
//        }
//
//    }
//
//}