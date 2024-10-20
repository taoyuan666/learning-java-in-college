import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       System.out.println("Hello World!");
       Scanner scanner = new Scanner(System.in);
       Person person2 = new Person();
       person2.setName("啊");
       person2.setAge(11);
       person2.getName();
       person2.getAge();
    Person person1 = new Person();

       person1.setName("aaa");
       person1.setAge(11);
       person1.getName();
       person1.getAge();
      Perso aaa=new Perso();
      System.out.println(aaa.equals(person1));
      System.out.println(person1.equals(person2));
       System.out.println(aaa.getClass());


       System.out.println(person2.toString());

   }
}
