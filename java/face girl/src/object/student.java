package object;

public class student {
    String name;
    int age;
    double chinese;
    double english;
    double math;
    public void  printtotalscore(){
        System.out.println(name+"的总成绩是"+(chinese+english+math));
    }
    public void printaveragescore(){
        System.out.println(name+"的平均成绩是"+(chinese+english+math)/3.0);//此处没有。0返回值可能会取整
    }
}
