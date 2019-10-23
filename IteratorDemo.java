import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    /*
    Java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用的方法：
    boolean  hasNext() 如果仍有元素可以迭代，则返回true    判断集合中有没有下一个元素，有就返回true,没有就返回false
    E  next()    返回迭代的下一个元素  取出集合当中的下一个元素
    Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
    Collection接口中有一个方法叫Iterator(),这个方法返回的就是迭代器的实现类对象
    Iterator<E>  iterator()  返回在此Collection的元素上进行迭代的迭代器
    迭代器的使用步骤（重点）：
    1.先试用集合当中的方法iterator()  获取迭代器的实现类对象，使用Iterator接口接受（多态）
    2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
    3.使用Iterator接口中的方法next取出集合中的下一个元素
     */
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String>  coll=new ArrayList<>();
        //往集合中添加元素
        ((ArrayList<String>) coll).add("姚明");
        ((ArrayList<String>) coll).add("科比");
        ((ArrayList<String>) coll).add("麦迪");
        ((ArrayList<String>) coll).add("詹姆斯");
        ((ArrayList<String>) coll).add("艾佛森");
        /*
        1.先试用集合当中的方法iterator()  获取迭代器的实现类对象，使用Iterator接口接受（多态）
           Iterator<E>  接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        Iterator<String>  it=coll.iterator();//多态  接口=实现类
        /*
        发现使用迭代器取出集合中元素的代码，是一个重复的过程
        所以，我们可以使用循环优化
        不知道集合当中有多少元素，用while循环
        已知循环次数使用for，不知循环次数使用while循环
         循环结束的条件:hasNext方法返回false
         */
     /*   while(it.hasNext()){
           String e= it.next();
            System.out.println(e);
        }*/
        System.out.println("------------------------");
        for(Iterator<String> it2= coll.iterator();it2.hasNext();){
            String e=it2.next();
            System.out.println(e);
        }
        //    2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
  /*    boolean b=it.hasNext();
        System.out.println("b:"+b);
          String s=it.next();
        System.out.println(s);
        b=it.hasNext();
        System.out.println("b:"+b);
        s=it.next();
        System.out.println(s);
        b=it.hasNext();
        System.out.println("b:"+b);
        s=it.next();
        System.out.println(s);
        b=it.hasNext();
        System.out.println("b:"+b);
        s=it.next();
        System.out.println(s);
        b=it.hasNext();
        System.out.println("b:"+b);
        s=it.next();
        System.out.println(s);
        b=it.hasNext();
        System.out.println("b:"+b);//没有元素返回false
        s=it.next();//没有元素，再取出元素会抛出NoSuchElementException没有元素异常
        System.out.println(s);*/

    }
}
