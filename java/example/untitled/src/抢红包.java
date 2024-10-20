import java.util.Random;
import java.util.Scanner;

public class 抢红包 {
    public  static void main(String[] args) {
    int[] moneys={9,188,520,666,999};
   start(moneys);
    }
    public static void start(int[] moneys){
        Scanner sc=new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入任意内容进行抽奖");
          sc.next();
            int a=(random.nextInt(5) );
            while(moneys[a]==0){
                a= (random.nextInt(5) );//
                //制作时忽略的点数组的位数
            }
            System.out.println("您的抽奖结果是"+moneys[a]);
            moneys[a]=0;
           }
        System.out.println("活动结束");
        }
}
