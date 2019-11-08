import java.util.Scanner;

public class Test110803 {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        String  str=scanner.next();
        char[] array=str.toCharArray();
        int l=0,r=0;
        int maxL=1,maxR=r;
        int max=0;
        while(r!=array.length){
            if(l==r){
                if(array[l]>='a'&&array[l]<='z'){
                    l++;
                    r++;
                }else{
                    r++;
                }
            }else{
                if(array[r]>='a'&&array[r]<='z'){
                    if(r-1>max){
                        max=r-1;
                        maxL=l;
                        maxR=r;
                    }
                    l=r;
                }else {
                    r++;
                    if(r==array.length){
                        if(r-1>max){
                            max=r-1;
                            maxL=l;
                            maxR=r;
                        }
                    }
                }
            }
        }
    }
}
