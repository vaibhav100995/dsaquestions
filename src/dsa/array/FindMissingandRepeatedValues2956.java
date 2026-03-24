package dsa.array;

public class FindMissingandRepeatedValues2956 {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,7,8};
        int[][] arr = {{9,1,7},{8,9,2},{3,4,6}};
        int i = arr[0][0] ^ arr[0][1] ^ arr[0][2];
        int l= arr[1][0] ^ arr[1][1] ^ arr[1][2];
        int m= arr[2][0] ^ arr[2][1] ^ arr[2][2];
        int h = i ^ l ^ m;
        int xor = 1;
        for(int j=2;j<5;j++){
            xor = xor ^ j;
        }
        for(int k=6;k<10;k++){
            xor = xor ^ k;
        }

        xor = xor ^ 9;

        System.out.println(findMissingAndRepeatedValues(arr));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length];
        return arr;

    }
}
