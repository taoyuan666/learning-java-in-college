import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委数");
        int number = sc.nextInt();
        System.out.println("当前选手得分是"+dafen(number));
    }

    public static double dafen(int number) {
        int[] scores = new int[number];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请录入第" + (i + 1)+ "个评委的分数");
            scores[i] = sc.nextInt();
        }
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
            }
        double avg = (sum-max-min) / (scores.length-2.0);
            //

             //
        // 之前c语言碰到过的，整数除法结果若为小数且输出，则须分子分母有一者转换为小数形式


        return avg;}
}

