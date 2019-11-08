import java.util.Scanner;

public class Test11082 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String str1=scanner.next();
        scanner.nextLine();
        System.out.println("请输入第二个字符串：");
        String str2=scanner.next();
        System.out.println("删除后的字符串为："+fun(str1,str2));
    }

    private static String  fun(String str1, String str2) {
        for(int i=0;i<str2.length();i++){
            int idx=0;
            while((idx=str1.indexOf(str2.charAt(i)))!=-1){
                str1=str1.substring(0,idx)+str1.substring(idx+1);
            }
        }
        return str1;
    }
}
