import java.util.Scanner;

class Fibonacci{
    public static  long calc(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return  calc(n-1)+calc(n-2);
        }
    }
}
public class TreadDemo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("请输入要计算第几项的斐波那契数：");
            int n=scanner.nextInt();
            long result=Fibonacci.calc(n);
            System.out.printf("第%d项斐波那契数为：%d",n,result);
            System.out.println();
        }
    }
}
