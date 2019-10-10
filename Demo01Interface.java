package demo;

public class Demo01Interface {
    public static void main(String[] args) {
       // MyInterfaceAbs inter=new MyInterfaceAbs() ;错误写法，不能直接new接口对象使用
        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();

    }
}
