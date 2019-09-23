/*
一旦使用了static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的。
如果没有static关键字，那么必须要创建对象，然后通过对象才能使用它
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它
无论是成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用
成员变量：类名称.静态变量
静态方法：类名称你.静态方法（）；
注意事项：
1.静态只能访问静态，不能直接访问非静态
  原因：因为在内存当中是先有的静态内容，后有的非静态内容。
  “先人不知道后人，但是后人知道先人”
2.静态方法当中不能用this
  原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj=new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();
        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用。
        obj.methodStatic();//正确的，不推荐，通过对象名称来调用，会误以为是一个普通的成员方法，这样的写法在编译之后也会被Javac翻译成"类名称.静态方法"
        MyClass.methodStatic();//正确，推荐
        //对于本类当中的静态方法，可以省略类名
        myMethod();
        Demo02StaticMethod.myMethod();//完全等效
    }
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
public class MyClass {
    int num;//成员变量
    static int numStatic;//静态变量
    //成员方法
    public void method(){
        System.out.println("这是一个普通的成员方法。");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }
    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态不能直接访问非静态【重点】
        //System.out.println(num);错误的写法
        //静态方法中不能使用this关键字
       // System.out.println(this);错误写法

    }
}

静态代码块
/*
静态代码块的格式是：
public class 类名称{
     static{
     //静态代码块的内容
     }
}
特点：当第一次用到本类时，静态代码块执行唯一的一次
 */
public class Person {
    //静态代码块
          static {
        System.out.println("静态代码块执行！");
    }
    public Person(){
        System.out.println("构造方法执行！");
    }
}
public class Demo04Static {
    public static void main(String[] args) {
        //静态内容总是优先于非静态，所以静态代码块比构造方法先执行
         Person one =new Person();
    }
}


Arrays
import java.util.Arrays;

/*java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。
public  static String toString(数组)，将参数数组变成字符串（按照默认格式[元素1，元素2，元素3...]）
public  static void sort(数组);按照默认升序（从小到大）对数组的元素进行排序
备注：
  1.如果是数值，sort默认按照升序从小到大
  2.如果是字符串，sort默认按照字母升序
  3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
*/
public class DemoArrays {
    public static void main(String[] args) {
        int[] intArrary={10,20,30};
        //将int[]数组按照默认格式变成字符串
        String intstr= Arrays.toString(intArrary);
        System.out.println(intstr);
        int[]  array1={2,1,3,4,7,5,0,8};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] array2={"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}




/*
题目：
请使用Arrays相关的API,将一个随机字符串中的所有字符升序排列，并倒序打印
 */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String  str="dajhdjnjfnweelwjxnpegx";
        //如何进行升序排列，sort
        //必须是一个数组，才能用Arrays.sort方法
        //String--->数组 ，用toCharArray
        char[]   chars=str.toCharArray();
        Arrays.sort(chars);
        //需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}


/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
public static  double obs(double  num);获取绝对值
public static  double ceil(double  num);向上取整
public  static double floor(double  num);向下取整
public static long   round(double  num); 四舍五入
Math.PI代表近似的圆周率常量
 */
public class DemoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        //向下取整：抹零
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));
        //四舍五入(不带小数点)
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.5));
        System.out.println(Math.round(23.8));
    }
}
