import java.util.Scanner;
/*
Scanner类的功能，可以实现键盘输入数据，到程序中
引用类型的一般使用过程
1.导包
import 包路径.类名称;
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
只有java.lang包下的内容不需要导包，其他的包都需要import语句
2.创建
类名称  对象名=new  类名称（）;
3.使用
对象名.成员方法名（）;
获取键盘输入的int数字  int  num=sc.nextInt;
获取键盘输入的一个字符  String str=sc.next();

 */
public class DemoScanner {
    public static void main(String[] args) {
        //创建
        Scanner sc=new  Scanner(System.in);//System.in代表从键盘输入
        //获取键盘输入的int数字
        //int num=sc.nextInt();
        //获取键盘输入的字符串
        String  str=sc.next();
        System.out.println("输入的int数字是："+str);

    }
}
