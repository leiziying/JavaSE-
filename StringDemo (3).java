import java.util.Scanner;

public class StringDemo {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        //创建字符串
        String str="hello Bit";
        //方式二
        String str2=new String("hello BIt");
        //方式三
        char[]  array={'a','b','c'};
        String str3=new String(array);
        //字符串比较
        //对于整形
        int x=10;
        int y=10;
        System.out.println(x==y);//true
        //对于String类型
        String str1=new String("hello");
        String str4=new String("hello");
        System.out.println(str1==str2);//false比较的是两个引用的地址
        System.out.println(str1.equals(str2));//false  equals比较的是this==obj

        /*
        String 使用==比较并不是比较字符串内容，而是比较两个引用是否指向同一个对象(保存同一个对象的地址一定一样)
         */
        String  r1="hello haha";
        String r2="hello haha";
        System.out.println(r1==r2);//true
    }
}
/*
String类型的设计使用了共享设计模式
在JVM底层实际上会自动维护一个对象池（字符串常量池）
如果现在采用了直接赋值的模式进行String类的对象实例化操作，那么该实例化对象（字符串内容）将自动保存到这个这个对象池之中
如果下次继续使用直接赋值的模式声明String类对象，此时对象池之中如若有指定内容，将直接进行引用
如若没有，则开辟新的字符串常量对象而后将其保存在对象池之中以供下次使用
 */