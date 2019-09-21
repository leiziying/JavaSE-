关键字的特点：
1.完全小写的字母
  public  static void
2.标识符
3.ArrayList(集合)
  ArrayList和数组Array最大的区别：
    数组的长度是不可以发生改变的
	ArrayList集合的长度是可以随意变化的，使用（查API）,在java.util包中
	ArrayList<E>  ArrayList可以存储多种数据，用E来占位
	方法：add()  往里添加元素
	对于ArrayList来说有<E>代表泛型。
	泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
	注意：泛型只能是引用类型，不能是基本类型。
	public static void main(String[]  args){
	  ArrayList<String>  list=new  ArrayList<>();
	  //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
	  //备注：从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
	  注意事项：
	     对于ArrayList集合来说，直接打印得到的不是地址，而是内容。
		 如果内容是空，得到的是空的中括号[]
		 import java.util.ArrayList;
    public class TESt {
    public static void main(String[] args) {
       ArrayList<String>  list=new ArrayList<>();
       list.add("赵丽颖");
       list.add("迪丽热巴");
       list.add("古力娜扎");
       //list.add(100);//错误的，<>中是String 不能放其他类型
        System.out.println(list);
    }
}

	常用方法：public boolean add(E e);向集合当中添加元素，参数的类型和泛型一致
	          public E get(int index);从集合当中获取元素，参数是索引编号，返回只就是对应位置的元素
			  public E  remove(int index);从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
			  public int size();获取集合的尺寸长度，返回值就是集合中包含的元素个数
    import java.util.ArrayList;
    import java.util.Arrays;
    public class TESt {
    public static void main(String[] args) {
       ArrayList<String>  list=new ArrayList<>();//创建集合
        //向集合中添加元素
       boolean success= list.add("柳岩");//0
       list.add("高圆圆");//1
       list.add("赵又廷");//2
        System.out.println(list);
      //从集合中获取元素用get(),索引值从0开始
      String name=  list.get(2);
        System.out.println("第二号索引的位置："+name);
        //从集合中删除元素
        String whoRemoved=list.remove(2);//参数是一个int值
        System.out.println("被删除的人："+whoRemoved);
        System.out.println(list);
        //获取集合的长度尺寸，也就是其中元素的个数
        int  size=list.size();
        System.out.println("集合的长度："+size);
        ArrayList<Integer> max=new ArrayList<>();
        max.add(100);
        max.add(200);
        System.out.println(max);
        int num=max.get(0);
        System.out.println("第1个元素是："+num);
        //遍历集合
        for(int i=0;i<list.size();i++){//数组的遍历for(int i=0;i<array.length;i++)
            System.out.println(list.get(i));//get(i)就拿到了第i号元素
        }
       // ArrayList<int> listB=new ArrayList<int>();//这种写法是错误的，int是基本数据类型，<>里面是类类型
        //泛型只能是引用类型,不能是基本类型
        //集合里面保存的都是地址，而基本数据类型没有地址
        //如果希望向集合ArrayList当中存储基本类型，必须要使用基本类型对应的包装类
        //包装类：把基本数据类型包装成一个对象，包装类跟基本类型有一个对应关系，包装类实际上是引用类型，而且全都位于java.lang包下，所以不用导包
        //自动装箱：基本类型自动变为引用类型
        //自动拆箱：包装类型自动变为基本类型
    }
  }
  
 题目一： 产生6个随机数字
  import java.util.ArrayList;
import java.util.Random;
/*生成6个1-33之间的随机整数，添加到集合，并遍历集合
 思路：需要存储6个数字，创建一个集合，<Integer>
       产生随机数需要用到Random
       用循环6次来产生6个随机数字，for循环
       循环内调用r.nextInt(int n)参数是33,0-32整体加一才是33
       把数字添加到集合中：add
       遍历集合for  size  get
 */
public class Demo01ArrayLiRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
           int num= r.nextInt(33)+1;//nextInt(33)实际上是0-32
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


//方法重载
//方法重载
/*方法重载与下因素有关
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同
方法重载与下列因素无关
1、与参数的名称无关
 */
import java.util.ArrayList;
public class Test02ArrayList {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
    }
    public static  int  sum(int  a,int b){
        return a+b;
    }
    /*public static int sum(int x,int y){
    return x+y;
    }  错误写法，与参数的名称无关
    */
    /*
    public static double sum(int a,int b){
    return a+b+0.0;
    }
    错误写法，和返回值无关
     */
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static  int sum(double a,double b){
        return   (int)(a+b);
    }
    public static int sum(int a,double b){
        return (int)(a+b);
    }
    public static int sum(double a,int b){
        return (int)(a+b);//参数的多类型顺序不同
    }
}

方法重载例题练习
/*
方法重载例题练习
题目要求
比较两个数据是否相等
参数；类型分别为两个byte类型，两个short类型，两个int类型，两个long类型
并在main方法中进行测试
 */
public class Demo02MethodloadSame {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)10,(short)20));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,20L));
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte参数的方法执行");
        boolean same;
        if(a==b){
            same=true;
        }else{
            same=false;
        }
        return same;
    }
    public static boolean isSame(short a,short b){
        System.out.println("两个short参数的方法执行");
        boolean same=a==b?true:false;
        return same;
    }
    public static boolean isSame(int a,int b){
        System.out.println("两个int参数的方法执行");
        return a==b;
    }
    public static boolean isSame(long a,long b){
        System.out.println("两个long参数的方法执行");
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}


//byte short int long float double char boolean
//在调用输出语句的时候println方法其实就是进行了多种参数类型的重载
public class Demo04Overload {
    public static void main(String[] args) {
         myPrint(100);
         myPrint("hello");

    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(char zifu){
        System.out.println(zifu);
    }
    public static void myPrint(boolean is){
        System.out.println(is);
    }
    public static void myPrint(String str){
        System.out.println(str);
    }
}

数组
/*数组
数组是一个容器，可以同时存放多个数据值
数组的特点，数组是一种引用数据类型，基本数据类型只有八种
数组当中的多个数据，类型必须统一
数组的长度在程序运行期间不可改变
数组的初始化，在内存当中创建一个数组，并且向其中赋予一些默认值
两种常见的初始化方式：
1.动态初始化（指定长度）
2.静态初始化（指定内容）
动态初始化数组的格式
数据类型[]  数组名称=new 数据类型[数组长度];
解析含义：
左侧数据类型，也就是数组当中保存的数据，全都是统一的什么类型
左侧的中括号，代表我是一个数组
左侧数组的名称，给数组取一个名字
右侧的new 代表创建数组的动作
右侧的数据类型必须和左边的数据类型保持一致
右侧中括号的长度，也就是数组当中，到底可以保存多少个数据，是一个int数字
 */
public class Demo01Array {
    public static void main(String[] args) {
         int score1=100;
         int score2=98;
         int score3=99;
         //数据类型是一样的
        System.out.println(score3);
        score3=100;
        System.out.println(score3);//说明一个变量只能存一个数据
        int[]  arrayA=new int[300];//创建了一个数组，数据类型是int里面可以放300个int类型的数据
        double[]  arrayB=new double[10];
        String[]  arrayC=new String[5];
        //静态初始化和动态初始化的区别
        /*
        动态初始化：在创建数组的时候，直接指定数组当中的数据元素个数
        静态初始化：在创建数组的时候，不直接指定数据个数多少，而是直接将具体的数据内容进行指定
        静态初始化：
        数据类型[]  数组名称 =new 数据类型[] {元素1，元素2，....};
         */
        //直接创建一个数组里面装的全都是int数字，具体是5,15,25
        int[]  arrayD=new int[]  {5,15,25};
        //创建一个数组用来装字符串”hello“,"world","Java"
        String[]  arrayE=new String[]{"hello","world","Java"};//长度就是3
        //注意事项：虽然惊天初始化没有直接告诉长度，但是根据大括号里面元素内容也可以自动推算出来长度
    }
}


import java.util.Arrays;
/*面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个具有该功能的人，来帮我做事
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[]  array={10,20,30,40};
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
                System.out.println();
            } else {
                System.out.print(array[i]+" ,");
            }
        }
        System.out.println("===============");
        System.out.println(Arrays.toString(array));
    }
	
	
	类和对象
	/*
通常情况下，一个类并不是直接使用，需要根据类创建一个对象，才能使用
创建对象：
1.导包（也就是指出需要使用的类，在什么位置）
   import 包名称.类名称
   import java.util.Arrays;
   对于和当前类属于同一个包的情况，可以省略导包语句不写
2.创建
  类名称 对象名=new 类名称（）；
  Student  stu=new Student();
3.使用
  使用成员变量    对象名.成员变量名
  使用成员方法    对象名.成员方法名（参数）
  也就是想用谁就用对象名点谁
 */
/*
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样
 */
public class Demo02Student {
    public static void main(String[] args) {
        //导包  需要用的Student类，和自己Demo02Student位于同一个包下，所以省略导包语句不写
        //创建
        Student stu=new Student();//根据Student类，创建了一个名为stu的对象
        //使用其中的成员变量
        System.out.print(stu.name+" ");//null
        System.out.println(stu.age);//0
        //改变对象当中的成员变量数值内容
        stu.name="赵丽颖";//将右侧的字符串赋值交给stu对象当中的name成员变量
        stu.age=18;
        System.out.println("==================");
        System.out.print(stu.name+" ");
        System.out.println(stu.age);
        stu.eat();
        stu.sleep();
        stu.study();
    }
}


//手机类
public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类创建一个名为one的对象
        Phone one=new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null
        System.out.println("=========================");
        one.brand="苹果";
        one.price=8888;
        one.color="黑色";
        System.out.println(one.brand);//苹果
        System.out.println(one.price);//8888.0
        System.out.println(one.color);//黑色
        System.out.println("===========================");
        one.call("乔布斯");
        one.sendMessage();
    }
}


public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="苹果";
        one.price=8888.0;
        one.color="黑色";
        method(one);//传递进去的参数实际上是地址值
    }
    //带有static的方法是一个普通方法，普通方法不需要对象就可以调用
    public  static void  method(Phone  param){
        System.out.println(param.brand);//苹果
        System.out.println(param.price);//8888.0
        System.out.println(param.color);//黑色
    }
}


局部变量与成员变量
/*
局部变量和成员变量
1.定义的位置不一样【重点】
   局部变量：在方法的内部
   成员变量：在方法的外部，直接写在类中
2.作用范围不一样【重点】
  局部变量：只有方法当中才可以使用，出了方法就不能再用
  成员变量：整个类全都可以使用
3.默认值不一样【重点】
   局部变量：没有默认值，如果要想使用，必须手动进行赋值
   成员变量：如果没有赋值，规则和数组一样
4.内存的位置不一样（了解）
  局部变量：位于占内存
  成员变量：位于堆内存
5.生命周期不一样
   局部变量：随着方法进栈而诞生，随着方法出栈而消失
   成员变量：随着对象创建而诞生能够，随着对象垃圾回收而消失
 */
public class DemoVariableDiffrence {
    String name;//成员变量
    public void mehtodA(){
        int num=20;//局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void mothodB(int param){//方法的参数就是局部变量
        int age;
        //System.out.println(num);//错误写法
        System.out.println(name);
       // System.out.println(age);//不赋值的局部变量不能用
        System.out.println(param);//参数在方法调用的时候自然会被赋值的
         }
}


/*
面向对象三大特征：
封装，继承，多态
封装在Java中的体现：
1.方法就是一种封装
2.关键字private也是一种封装
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 100};
       int max=getMax(array);
        System.out.println("最大值："+max);//100
    }
   //给我一个数组，我还给你一个最大值
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
//封装就是将一些细节信息隐藏起来，对于外界不可见



/*
当方法的局部变量和类中的成员变量重名的时候，根据“就近原则”，优先使用局部变量
如果需要访问本类中的成员变量，需要使用格式
this.成员变量名
通过谁调用的方法，谁就是this
*/


构造方法
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
public  类名称（参数类型  参数名称）{
   方法体
}
注意事项：
1.构造方法的名称要和所在的类名称完全一样，就连大小写也要一样
2.构造方法不要写返回值类型，连void都不要写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，方法体什么事情都不做
  public  Student(){
  }
5.一旦编写了至少一个构造方法，那么编译器将不再赠送
6.构造方法也是可以重载的，方法名称相同，形参列表不同
 */
public class Student {
    private String  name;
    private  int age;
    public Student(){
        System.out.println("无参构造方法执行了");
    }
    public  Student(String name,int age){
        this.name=name;
        this.age=age;//默认的无参构造将不会赠送
        System.out.println("有/全参构造方法执行了");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
public class Demo02Student {
    public static void main(String[]  args){
        Student stu=new Student();//new 对象就是在调用构造方法
        Student stu1=new Student("赵丽颖",20);//全参构造
        System.out.println("姓名："+stu1.getName()+".年龄"+stu1.getAge());
        //如果需要改变对象当中的成员变量的内容，仍然需要使用setXxx方法
        stu1.setAge(24);
        System.out.println("姓名："+stu1.getName()+".年龄"+stu1.getAge());
    }
}


/*
一个标准的类通常要拥有下面四个组成部分
1.所有的成员变量都要使用private关键字修饰
2.为每一对成员变量编写一对儿Getter/Setter方法
3.编写一个无参的构造方法
4.编写一个全参数的构造方法
这样的类也叫作  Java Bean
 */
public class Student0921 {
    private  String name;//姓名
    private  int age;//年龄

    public Student0921() {//无参数的构造方法
    }

    public Student0921(String name, int age) {//全参构造方法
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Demo05Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("迪丽热巴");
        stu.setAge(25);
        System.out.println("姓名："+stu.getName()+",年龄:"+stu.getAge());
       Student stu2=new Student("古力娜扎",47);
        System.out.println("姓名："+stu2.getName()+",年龄:"+stu2.getAge());
        stu2.setAge(23);
        System.out.println("姓名："+stu2.getName()+",年龄:"+stu2.getAge());
    }
}
