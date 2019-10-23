import java.util.ArrayList;

/*
增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
JDK1.5之后出现的新特性
增强for循环：用来遍历集合跟数组
格式：
    for(集合/数组的数据类型  变量名：  集合名/数组名){
                 sout(变量名);
         }
 */
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
//使用增强for循环遍历集合
    private static void demo02() {
        ArrayList<String>  list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String  s:list){
            System.out.println(s);
        }
    }

    //使用增强for循环遍历数组
    private static void demo01() {
        int[]  array={1,2,3,4,5};
        for(int i:array){
            System.out.println(i);
        }
    }
}
