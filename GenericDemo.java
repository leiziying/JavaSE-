import java.util.ArrayList;
import java.util.Iterator;

/*
集合当中存储元素的数据类型就称之为泛型（未知类型）
当我们不知道使用什么数据类型的时候，可以使用泛型
泛型也可以看作是一个变量，用来接收数据类型
E  e:Element 元素
T  t:Type类型
ArrayList集合在定义的时候，不知道集合中都会存储什么类型的数据，所以类型使用泛型
E:代表未知的数据类型
public  class ArrayList<E>{
         public boolean add(E  e){}
         public E  get(int index){}
         }
         创建集合对象的时候就会确定泛型的数据类型
         ArrayList<String>  list=new ArrayList<String>();
 */
public class GenericDemo {
    public static void main(String[] args) {
      //  show01();
        show02();
    }
/*
创建集合对象，不使用泛型
好处：
     1.避免了转换的麻烦，存储的是什么类型，取出的就是什么类型
     2.把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候，就会报错）
弊端：
     泛型是什么类型，只能存储什么类型的数据
 */
    private static void show02() {
        ArrayList<String>  list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        //list.add(3);报错，只能存String 类型的数据 java.lang.Integer cannot be cast to java.lang.String
        //使用迭代器遍历list集合
        Iterator<String>  it=list.iterator();
        while(it.hasNext()){
           String s= it.next();
            System.out.println(s+"-->"+s.length());
        }
    }
    /*
    创建集合对象，不使用泛型
    好处：集合不使用泛型，它默认的类型就是Object类型，可以存储任意类型的数据
    弊端：集合不安全《会引发异常
     */
   /* private static void show01() {
        ArrayList  list=new ArrayList();//不写<>，默认的是Object类型
        list.add("abc");
        list.add(1);
        //使用迭代器遍历list集合
        //获取迭代器
        Iterator  it=list.iterator();
        //使用迭代器中的方法hasNext和next遍历集合
        while(it.hasNext()){
            //取出元素也是Object类型
            Object  obj= it.next();
            System.out.println(obj);
            //想要使用String类特有的方法，length获取字符串的长度，不能使用，多态 Object  obj="abc";
            //需要向下转型
            //会抛ClassCastException类型转换异常，不能把Integer类型转化为String类型
            String  s=(String)obj;
            System.out.println(s.length());
        }
    }
    */
    }
