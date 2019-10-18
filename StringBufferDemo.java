public class StringBufferDemo {
    public  static  void main(String[]  args){
        StringBuilder sb1=new StringBuilder();
        StringBuilder  sb2=new StringBuilder("提前的字符串");
        //append(int i)
        //将 int参数的字符串表示法附加到此序列。
        sb1.append(10);
        sb1.append(10.0);
        sb1.append(10L);
        sb1.append("helllo");
        sb1.append('c');
        String t=sb1.toString();
        System.out.println(t);
        sb1.reverse();
        System.out.println(sb1.toString());
        sb1.replace(1,3,"ABC");
        System.out.println(sb1.toString());
    }
    }
