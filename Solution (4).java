import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getStepNUm(n));
    }
    private static int getStepNUm(int n) {
        int  num=0,x=0;
        while(num>=0){
            if(fibonaqi(num)>=n){
                x=fibonaqi(num);
                break;
            }else{
                num++;
            }
        }
        int y=fibonaqi(num-1);
        return Math.min(Math.abs(y-n),Math.abs(x-n));
    }

    private static int fibonaqi(int num) {
            if(num==0){
                return 0;
            }else  if(num==1){
                return 1;
            }else{
                return fibonaqi(num-1)+fibonaqi(num-2);
            }
    }
}
