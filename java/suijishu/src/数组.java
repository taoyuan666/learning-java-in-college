import java.util.Random;
import java.util.Scanner;

public class 数组 {
    public static void main(String[] args) {
//        int[] ages=new int[]{12,24,36};
//        double[] scores={67,43,87};
//        int ag[]={12,34,23};
//        System.out.println(ages);
//        System.out.println(ages[ages.length-1]);
//        //shuzuming.fori 自动写好后续


//        double[] fenshu=new double[6];
//        Scanner sc=new Scanner(System.in);
//        double a=0;
//        for (int i = 0; i < fenshu.length; i++) {
//            fenshu[i]=sc.nextDouble();
//        }
//        for (int i = 0; i < fenshu.length; i++) {
//            a+=fenshu[i];
//        }
//        System.out.println(a);


// 某个数组变量地址为null时，不能对数组进行具体访问
        //不要空指针


//        int[] face={12,34,43,343,54};
//        int max=face[0];
//        for (int i = 0; i < face.length; i++) {
//            if (max<face[i]) {
//                max=face[i];
//            }
//        }
//        System.out.println(max);


//        int p;
//           int as[]={10,20,30,40,50};
//        for (int i = 0; i < (int)as.length/2; i++) {
//            p=as[4-i];
//        as[4-i]=as[i];
//            as[i]=p;
//            }
//        for (int i = 0; i < as.length; i++) {
//            System.out.println(as[i]);
//        }


        int num[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工的工号");
           //拼接字符串用加号
            num[i] = scanner.nextInt();

        }
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            int p = random.nextInt(num.length);
            int temp = num[i];
            num[i] = num[p];
            num[p] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
