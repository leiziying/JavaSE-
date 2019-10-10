package demo;
/*
接口使用步骤：
     1.接口不能直接使用，必须有一个"实现类"来实现接口
     格式：(也是子类继承一个父类，就是格式换了一下)
     public class  实现类名称  implements  父类{
         .....
     }
     2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
     实现：去掉abstract关键字，加上方法体大括号
     3.创建实现类的对象，进行使用
     注意事项：
         如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
         抽象方法所在的类就是抽象类
 */

public  abstract class   MyInterfaceAbs{
    public abstract  void methodAbs1();
    public abstract  void methodAbs2();
    public abstract  void methodAbs3();
    public abstract  void methodAbs4();

}
