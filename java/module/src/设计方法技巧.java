import java.util.Scanner;

public class 设计方法技巧 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int p=scanner.nextInt();
        jiou(p);


    }
    public static int add(int n){
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return  sum;
    }
    public static void jiou(int n){
        if(n%2==0){
            System.out.println("偶数");
        }
        if(n%2!=0){
            System.out.println("奇数");
        }

    }
}
