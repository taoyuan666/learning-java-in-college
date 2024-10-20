import java.util.Random;
import java.util.Scanner;

public class 双色球 {
    public static void main(String[] args) {
        int[] xuanhao = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入选的第" + (i+1) + "个红色球数");
            xuanhao[i] = sc.nextInt();
        }
        int b;
        System.out.println("请输入所选的蓝色球数字");
        b = sc.nextInt();
        kaijiang(xuanhao,b);

    }

    public static void kaijiang(int[] xuanhao, int b) {
        Random random = new Random();
        int c = random.nextInt(16) + 1;
        int x = 0;
        if (c == b) {
            x = 1;
        }
        int[] jiangchi = new int[6];
        for (int i = 0; i < 6; i++) {
            jiangchi[i] = random.nextInt(33) + 1;
        }

        int w = 0;//记数
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                if (jiangchi[j] == xuanhao[i]) {
                    w = w + 1;
                }
            }
        }
        if (x == 1) {
            if (w == 0) {
                System.out.println("1111不中");
            }
            if (w == 1) {
                System.out.println("1111中");
            }
            if (w == 2) {
                System.out.println("1115中");
            }
            if (w == 3) {
                System.out.println("11110中");
            }
            if (w == 4) {
                System.out.println("11110中");
            }
            if (w == 5) {
                System.out.println("111200中");
            }
            if (w == 5) {
                System.out.println("1111300中");
            }
            if (w == 6) {
                System.out.println("11111000中");
            }
        }
        if (x == 0) {
            if (w == 0) {
                System.out.println("不中");
            }
            if (w == 1) {
                System.out.println("1中");
            }
            if (w == 2) {
                System.out.println("5中");
            }
            if (w == 3) {
                System.out.println("10中");
            }
            if (w == 4) {
                System.out.println("10中");
            }
            if (w == 5) {
                System.out.println("200中");
            }
            if (w == 5) {
                System.out.println("300中");
            }
            if (w == 6) {
                System.out.println("1000中");
            }
        }
    }

    }
