public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello" + "" + "word";
        String s=new String("hello");//s不在常量池
        String t=s.intern();//t是在常量池的
        System.out.println(s1);
    }
}
