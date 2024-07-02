package pattern;

public class StarWithNumber {

    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n){
        int i, j, count = 1, num = 0, star = 8;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= star; j++) {
                if (i + j <= star + 1)
                    System.out.print("*");
            }
            num++;
            for (j = 1; j <= i; j++)
            {
                System.out.print(num);
                if (i > 1 && count < i)
                {
                    System.out.print("*");
                    count++;
                }
            }
            for (j = 1; j <= star; j++) {
                if (i + n <= j + n)
                    System.out.print("*");
            }
            System.out.println();
            count = 1;
        }
    }
}
