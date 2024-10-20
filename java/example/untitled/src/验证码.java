import java.util.Random;
import java.util.Scanner;

public class 验证码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入验证码位数");
        int n = sc.nextInt();
        System.out.println(creatcode(n));
        //记得输出来

    }
    public static String creatcode(int n){
        Random random = new Random();
        String code="";//字符串
        for (int i = 0; i < n; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    code+=random.nextInt(10);
                    break;
                case 1:
                    char ch1=(char) (random.nextInt(26)+65);
                    code+=ch1;
                    break;
                case 2:
                    char ch2=(char) (random.nextInt(26)+97);
                    code+=ch2;
                    break;
            }
        }
        return code;
    }
}
