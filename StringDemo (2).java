public class StringDemo {
    /*
    StringBuilder类:字符串缓冲区
    字符串是常量，他们的值在创建之后就不能更改，字符串的底层是一个被final修饰的数组，不能改变，是一个常量
    进行字符串的额相加，内存中就会有多个字符串，占用空间，效率低下
    String  s="a"+"b"+"c"="abc";
    StringBuilder类，字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
    底层也是一个数组，但是没有被final修饰，可以改变长度
    byte[]  value=new byte[16];
     */
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder bu1=new StringBuilder();
        System.out.println("bu1:"+bu1);
        //带字符串的构造方法
        StringBuilder  bu2=new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
    }
}
