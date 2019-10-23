import java.util.ArrayList;
import java.util.Collection;

/*
  JAVASE提供了满足各种需求的API(类和接口)
  了解继承与接口操作架构
 */
public class DemoAPI {
    public static void main(String[] args) {
        //创建集合对象，可以使用对象
        Collection<String>  coll=new ArrayList<>();//接口指向实现类就是一个多态
        System.out.println(coll);//重写了toString方法
        //public boolean  add(E  e):把给定的对象添加到当前集合中，返回值是一个boolean类型，一般返回true,一般不用接收
       boolean b1=coll.add("张三");
        System.out.println("b1:"+b1);//b1:true
        System.out.println(coll);//"张三"
        ((ArrayList<String>) coll).add("李四");
        ((ArrayList<String>) coll).add("王五");
        ((ArrayList<String>) coll).add("赵六");
        ((ArrayList<String>) coll).add("田七");
        System.out.println(coll);
        /*
        public  boolean  remove(E  e):把给定的对象在当前集合中删除
        返回值是一个boolean值，集合中存在元素，删除元素，返回true
                                   不存在元素，删除失败，返回false
         */
        coll.remove("赵六");
        System.out.println(coll);
        coll.remove("张三");
        System.out.println(coll);
     /*
     public  boolean contains(E  e):判断当前集合中是否包含给定的对象
     包含：返回true
     不包含：返回false;
      */
    boolean  b2= coll.contains("李四");
        System.out.println("b2:"+b2);
        /*
        public boolean  isEmpty():判断当前集合是否为空，集合为空：返回true，集合不为空：返回false
         */
        boolean  b3=coll.isEmpty();
        System.out.println("b3:"+b3);
       Object[]  arr= coll.toArray();//toArray把集合变成数组
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //public  void clear():清空集合中所有的元素，但是不删除集合，集合还是存在
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
