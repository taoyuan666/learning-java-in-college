import java.util.Random;
import java.util.Scanner;

public class random持续 {
    public static void main(String[] args) {
        Random r = new Random();
        int lucjnumber=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入猜录的数字");
            int guess=sc.nextInt();
            if (lucjnumber==guess){
                System.out.println("猜对了");
                break;
            } else if (lucjnumber>guess) {
                System.out.println("猜小了");
            }
            else if (lucjnumber<guess){
                System.out.println("猜大了");

            }
        }

    }
}
