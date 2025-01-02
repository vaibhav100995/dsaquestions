package dsa.array;


//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//
//        Return the index of the peak element.
//
//        Your task is to solve it in O(log(n)) time complexity.
//
//        Example 1:
//        Input: arr = [0,1,0]
//        Output: 1
//
//        Example 2:
//        Input: arr = [0,2,1,0]
//        Output: 1
//
//        Example 3:
//        Input: arr = [0,10,5,2]
//        Output: 1
//
//        Constraints:
//        3 <= arr.length <= 105
//        0 <= arr[i] <= 106
//        arr is guaranteed to be a mountain array.
public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        String str = "My name is VAIBHAV";
//        System.out.println(str.);
        int[] a = {55,59,63,99,97,94,84,81,79,66,40,38,33,23,22,21,17,9,7};
//        int[] a = {24,69,100,99,79,78,67,36,26,19};
//        int[] a = {18,29,38,59,98,100,99,98,90};
//        int[] a = {3,5,3,2,0};
//        int[] a = {3,9,8,6,4};
//        System.out.println(peakIndexInMountainArray(a));
        System.out.println(peakIndexInMountainArray1(a));
    }

    public static int peakIndexInMountainArray(int[] a) {

        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         return i;
        //     }
        // }
        int start=0;
        int end=a.length-1;
        int mid=0;
        while(start<end){
            mid=(start+end)/2;
            if(start==mid || end==mid){
                if(mid>0) {
                    if (a[mid - 1] < a[mid] && a[mid] > a[mid + 1]) {
                        return mid;
                    } else if (a[mid - 1] > a[mid]) {
                        return mid - 1;
                    }
                }
                return mid+1;
            }
            if(a[mid]>a[end] && a[mid]>a[start]){
               if(a[mid-1]>a[mid]){
                   end=mid-1;
               } else if(a[mid+1]>a[mid]){
                   start=mid+1;
               }else{
                   return mid;
               }
            }else if((a[mid]>=a[end] && a[start]<a[mid]) || a[start]<a[mid]){
                start=mid;
            }else if(a[start]>=a[mid]){
                end=mid;
            }
        }
        return mid;
    }

    public static int peakIndexInMountainArray1(int[] A) {
        int start = 0, end = A.length - 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (A[mid] < A[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
}
