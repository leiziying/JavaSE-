package demo;

/*
从java 8开始，接口里允许定义默认方法
格式：
    public  default 返回值类型 方法名称（参数列表）{
    方法体
    }

    接口当中的默认方法，可以解决接口升级的问题
    1.接口的默认方法，可以通过接口实现类对象直接调用
    2.接口的默认方法，也可以被接口实现类进行覆盖重写
 */
public interface MyInterfaceDefault {
    public abstract  void methodAbs1();
    //public abstract  void methodAbs2();
    //新添加的方法改成默认方法
    public default  void methodDefault(){
        System.out.println("这是新添加的默认的方法");
    }
}
