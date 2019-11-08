import java.util.Scanner;
public class Test1108 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(buyNApple(n));
    }

    public static int  buyNApple(int n) {
        if(n%2!=0||n==10||n<6)
            return -1;
        if(n%8==0)
            return n/8;
        return 1+n/8;
    }
}
