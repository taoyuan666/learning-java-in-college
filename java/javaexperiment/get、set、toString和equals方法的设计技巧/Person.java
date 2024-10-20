import java.util.Objects;

public class Person {
    private String name;//private为一个访问修饰符，用于限制访问性，修饰成员只可在定义他们类的内部访问
    private int age;
    public String getName(){//get方法要有返回值，获取属性值
        //get优点，可以对值进行效验
        //对于一些计算开销较大的属性，可以将计算逻辑放在get方法中，只有在真正需要使用该属性值时才进行计算
        return name;
    }
    public void setName(String name){//set方法不需要返回值，设置属性值
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString() {//toString用于自定义对象的字符串表达形式，输出用
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//getclass用于比较对象的类型
        Person person = (Person) o;//将o强制转换为Person类型
        return age == person.age &&
                Objects.equals(name, person.name);
        //执行到return bool 代码后 函数就会立即停止执行，不再执行后面的代码。
    }
}
