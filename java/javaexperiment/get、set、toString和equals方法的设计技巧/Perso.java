import java.util.Objects;
 public class Perso {
    private int ageee;//private为一个访问修饰符，用于限制访问性，修饰成员只可在定义他们类的内部访问
    private int age;
    public int getAgeee(){
        return ageee;
    }
    public void setAgeee(int agree){
        this.ageee = ageee;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
