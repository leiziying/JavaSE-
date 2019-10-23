public class Demo02StringBuilder {
    /*
    StringBuilder的常用方法：
     */
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu=new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象（哪个对象调用方法，this就是哪个对象，this==bu）
      StringBuilder bu2=  bu.append("abc");//把bu的地址赋值给了bu2
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu==bu2);//比较的是地址
        //使用append方法无须接受返回值
        //链式编程：方法返回值是一个对象，可以继续调用方法
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu.append("abc").append(1).append(true).append(8.8).append("好");
        System.out.println(bu);
    }
}
