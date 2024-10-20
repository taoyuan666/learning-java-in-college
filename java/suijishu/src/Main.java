import java.util.Random;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();//导包
        for (int i = 0; i < 20; i = i + 1) {
            int data = rand.nextInt(10);//0-9
            System.out.println(data);
            System.out.println(data);
        }
        System.out.println("-------------");
        for (int i = 0; i < 20; i = i + 1) {
            int p = rand.nextInt(10) + 1;//1-10
            System.out.println(p);
        }
        System.out.println("-------------");
        for (int i = 0; i < 20; i = i + 1) {
            int j = rand.nextInt(15) + 3;//3-17
            System.out.println(j);///////////////////////////减加法
        }
    }
}