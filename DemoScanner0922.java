import java.util.Scanner;

/*
题目：
键盘输入三个int数字，然后求出其中的最大值
思路：
1.既然是键盘输入，肯定要使用到Scanner
2.Scanner三个步骤：导包，创建，使用nextInt()方法
3.既然是三个数字，那么调用三次nextInt()方法,d得到三个int变量
4.无法同时比较三个数
 */
public class DemoScanner0922 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数字");
        int c=sc.nextInt();
        int temp=a>b ? a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值："+max);

    }
}
