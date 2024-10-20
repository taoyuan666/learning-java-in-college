public class 方法案例1 {
    public static void main(String[] args) {
//        int a=10;
//        change(a);
//        System.out.println(a);



//        int[] arrs=new int[]{1,2,3,4,5};
//        chang(arrs);
//        System.out.println("tryr"+arrs[1]);



        //打印int类型的数组内容
//        int[] arrs1={13,14,14};
//        int[] arrs2={13,14,14};
//        System.out.println(equals(arrs1,arrs2));
//        int[] arr2=null;
//        printarry(arrs);
//        printarry(arr2);

fire();
fire("wewe");
fire("ew",4);



    }
    public static void change(int a){
        System.out.println(a);
        a=20;
        System.out.println(a+10);
    }
    public static void chang(int [] arrs){
        System.out.println("rwwr"+arrs[1]);
        arrs[1]=222;
        System.out.println("rwerwr"+arrs[1]);
    }
    public static void printarry(int [] arrs){
        if (arrs == null) return;
        System.out.print("[");
        for (int i = 0; i < arrs.length; i++) {
//            if (i==arrs.length-1){
//                System.out.print(arrs[i]);
//            }
//            else {
//                System.out.print(arrs[i] + "  ");
//            }
            System.out.print(i== arrs.length-1 ? arrs[i]: arrs[i]+" ，");
            //简化写法
        }
        System.out.println("]");
    }
    public static boolean equals(int[] arrs1,int[] arrs2){
        if (arrs1.length != arrs2.length) return false;
        if (arrs1==null && arrs2==null) return true;
        if(arrs1==null || arrs2==null) return false;
        for (int i = 0; i < arrs1.length; i++) {
            if (arrs1[i] != arrs2[i]) return false;


        }
        return true;

    }
    public static void fire(){fire("日本");}
    public  static void fire(String Country) {
        fire(Country,1);
    }
    public  static void fire(String Country,int number) {
        System.out.println("给" + Country+"发射了" + number);
    }
}//return 用于直接跳出当前方法 后续主程序仍可自由执行
