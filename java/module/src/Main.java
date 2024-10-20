
package com.itheima.define;
public class Main{
    public static void main(String[] args) {

        int rs = sum(10, 20);
        System.out.println(rs);
    }//函数写在主函数之外
    public static int sum(int a,int b){
//        pubilc static方法的修饰符 int返回类型，若申明，则函数内必须使用 return返回值
        //void 可不用返回值
        int c=a+b;
        return c;
    };//括号里是行餐，和c语言差不多
}
