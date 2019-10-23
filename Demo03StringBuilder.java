public class Demo03StringBuilder {
    /*
    StringBuilder和String可以相互转换：
      String-->StringBuilder:可以使用StringBuilder的构造方法
      StringBuilder-->String:可以使用StringBuilder中的toString方法
     */
    public static void main(String[] args) {
        //字符串转换成StringBuilder
        String  str="hello";
        System.out.println("str:"+str);
        StringBuilder  bu=new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:"+bu);
        //StringBuilder转换成String
        String  s=bu.toString();
        System.out.println("s:"+s);
    }
}
