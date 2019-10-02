package demo03;
public class DemoZi extends  DemoFu {
    int num=10;
    public DemoZi  (){
        //super();//这一行不再赠送
        this(123);//本类的无参构造，调用本类的有参构造
      //  this(1,2);报错，必须是构造方法的第一个语句，唯一一个。

    }
    public DemoZi(int n){
        this(1,3);
    }
    public DemoZi(int n,int m){
    }
    public void showNum(){
        int num=20;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        //methodA();
        this.methodA();//来源于本类当中，起到强调的字面的作用
        System.out.println("BBB");
    }
}
