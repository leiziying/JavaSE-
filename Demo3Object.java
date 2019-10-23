import java.util.Objects;

public class Demo3Object {
    public static void main(String[] args) {
        String s1=null;//.NullPointerException
        String s2="abc";
        //boolean b=s1.equals(s2);//null是不能调用方法的，就会抛出空指针异常
        /*
        Objects类中的equals方法：两个对象进行比较，防止空指针异常
         */
        boolean b2= Objects.equals(s1,s2);
       // System.out.println(b);
        System.out.println(b2);
    }
}
