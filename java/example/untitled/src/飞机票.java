import java.util.Scanner;

public class 飞机票 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = sc.nextInt();
        System.out.println("请输入当前月份");
        int mouth = sc.nextInt();
        System.out.println("请输入舱型. 1.头等舱 2.经济舱");
        int type=sc.nextInt();
        caculate(price,mouth,type);

    }
    public  static  String caculate(double price,int mouth,int type){
        if (mouth>=5&&mouth<=10){
            switch (type){
                case 1:
                    System.out.println("机票价格"+price*0.9);
                    break;
                case 2:
                    System.out.println("机票价格"+price*0.85);
                    break;
            }
        }
        if (mouth>10||mouth<=4){

            switch (type){
                case 1:
                    System.out.println("机票价格"+price*0.7);
                    break;
                case 2:
                    System.out.println("机票价格"+price*0.65);
                    break;
            }
        }
        return "查询完成";
    }
}