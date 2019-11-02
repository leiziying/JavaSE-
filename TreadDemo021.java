import java.util.Scanner;

class Fibonacci2{
    public static long calc(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return calc(n-1)+calc(n-2);
        }
    }
}
class FibonacciTread extends  Thread{
    private int n;
    FibonacciTread(int n){
        this.n=n;
    }
    @Override
    public void run(){
        long result=Fibonacci2.calc(n);
        System.out.printf("第%d项斐波那契数为：%d%n",n,result);
    }
}
public class TreadDemo021 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入要计算第几项的斐波那契数:");
            int  n=scanner.nextInt();
            Thread thread=new FibonacciTread(n);
            thread.start();
        }
    }
}
