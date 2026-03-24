package dsa.array;

public class MatrixD1s {

    public static void main(String[] args) {
//        int[] arr = {1,3,4,6,7,8};
        int[][] arr = {{1,0,1},{1,1,0},{1,1,0}};
        System.out.println(numSubmat(arr));
    }

    public static int numSubmat(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int i=0;
        int sum=0;
        while(i<row-1){
            int[] num=new int[col];
            int innerCount=0;
            int innerTotalCount=0;
            for(int c=0;c<col;c++){
                num[c]=mat[i][c];
                if(num[c]==1){
                    innerCount++;
                    innerTotalCount=innerTotalCount+innerCount;
                }else{
                    innerCount=0;
                }
            }
            sum=sum+innerTotalCount;
            for(int k=i+1;k<row;k++){
                int totalCount=0;
                for(int j=0;j<col;j++){
                    num[j]=num[j]&mat[k][j];
                }
                int count=0;
                for(int l=0;l<col;l++){
                    if(num[l]==1){
                        count++;
                        totalCount=totalCount+count;
                    }else{
                        count=0;
                    }
                }
                sum=sum+totalCount;
            }
            i++;
        }
        int innerCount=0;
        int innerTotalCount=0;
        for(int c=0;c<col;c++){
            if(mat[row-1][c]==1){
                innerCount++;
                innerTotalCount=innerTotalCount+innerCount;
            }else{
                innerCount=0;
            }
        }
        sum=sum+innerTotalCount;
        return sum;
    }
}
