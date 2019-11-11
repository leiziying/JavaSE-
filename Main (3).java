import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int y1,y2,y3,y4;
        float a,b,c;
        while(scanner.hasNext()){
           y1=scanner.nextInt();
           y2=scanner.nextInt();
           y3=scanner.nextInt();
           y4=scanner.nextInt();
           a=(y1+y3)/2;
           b=(y3-y1)/2;
           c=(y4-y2)/2;
           if((a-((y1+y3)/2))!=0){
               System.out.println("no");
               return;
           }
           if((b-(y3-y1)/2)!=0||(b-(y4+y2)/2)!=0){
               System.out.println("no");
               return;
           }
           if((c-(y4-y2)/2)!=0){
               System.out.println("no");
               return ;
           }
            System.out.print((int)a +" ");
            System.out.print((int)b+" " );
            System.out.print((int)c );
        }
    }
}
