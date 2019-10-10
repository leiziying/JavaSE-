package demo;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodAbs1();//调用抽象方法，实际运行的是右侧实现类
        a.methodDefault();//是从接口当中来的，调用默认方法，如果实现类当中没有，会向上找接口的
        System.out.println("====================");
        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodAbs1();
        b.methodDefault();
    }
}
