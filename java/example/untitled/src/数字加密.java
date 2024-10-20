import java.util.Scanner;

public class 数字加密 {
    public static void main(String[] args) {
        int[] mima=new int[4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
           mima[i]=sc.nextInt();
        }
        jiamisuanfa(mima);//数组处理写法


    }
    public static void jiamisuanfa(int[] mima){
        for (int i = 0; i < mima.length; i++) {
            int a=(mima[i]+5)%10;
            mima[i]=a;
        }
        for (int i = 0; i < mima.length/2; i++) {
            int a=mima[i];
            mima[i]=mima[mima.length-i-1];
            mima[mima.length-i-1]=a;
        }
        for (int i = 0; i < mima.length; i++) {
            System.out.print(mima[i]);
        }
    }
}
