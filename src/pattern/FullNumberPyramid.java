package pattern;

public class FullNumberPyramid {
    public static void main(String[] args) {
        printPyramid(4);
    }

    private static void printPyramid(int n){
        int i, j, count = 0, count1 = 0, k = 0;
        for(i = 1; i <= n; ++i)
        {
            for(j = 1; j <= n-i; ++j)
            {
                System.out.print(" ");
                ++count;
            }
            while(k != 2*i-1)
            {
                if (count <= n-1)
                {
                    System.out.print(i+k + " ");
                    ++count;
                }
                else
                {
                    ++count1;
                    System.out.print((i+k-2*count1) + " ");
                }
                ++k;
            }
            count1 = count = k = 0;
            System.out.println();
        }
    }
}
