package dsa.array;

public class FruitIntoBaskets904 {

    public static void main(String[] args) {
        int[] a={1,2,1};
        System.out.println(totalFruit(a));
    }

    public static int totalFruit(int[] fruits) {
        int a=fruits[0];
        Integer b=null;
        int max=0;
        int j=0;
        int aLastIndex=0;
        int bLastIndex=0;
        int i;
        for(i=1;i<fruits.length;i++){
            if(fruits[i]!=a && b==null){
                b=fruits[i];
            }
            if(a!=fruits[i] && b!=fruits[i]){
                int diff=i-j;
                if(diff>max){
                    max=diff;
                }
                if(aLastIndex>bLastIndex){
                    j=bLastIndex+1;
                    b=fruits[i];
                }else{
                    j=aLastIndex+1;
                    a=fruits[i];
                }
            }
            if(fruits[i]==a){
                aLastIndex=i;
            }
            if(b!=null && fruits[i]==b){
                bLastIndex=i;
            }

        }
        max=Math.max(max,i-j);
        return max;
    }
}
