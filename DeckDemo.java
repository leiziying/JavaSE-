import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeckDemo {
    public static void main(String[] args) {
        List<String>   courses=new ArrayList<>();//用顺序表实现一个List
        courses.add("C语言");
        courses.add("Java SE");
        courses.add("Java Web");
        courses.add("Java  EE");
        //和数组一样允许添加重复元素
        courses.add("C语言");
        //按照添加顺序打印
        System.out.println(courses.get(0));
        System.out.println(courses);
        courses.set(0, "计算机基础");
        System.out.println(courses);
        //截取部分[1,3)
        List<String>  subCourses=courses.subList(1,3);
        System.out.println(subCourses);
        //重新构造
        List<String>  courses2=new ArrayList<>(courses);
        System.out.println(courses2);
        List<String>  courses3=new LinkedList<>(courses);
        System.out.println(courses3);
        //引用的转换
        ArrayList<String>  courses4=(ArrayList<String>) courses2;
        System.out.println(courses4);
        //LinkedList<String>  c=(LinkedList<String>) courses2;错误的类型
        LinkedList<String>  courses5=(LinkedList<String>) courses3;
        System.out.println(courses5);
        //ArrayList<String>  c=(ArrayList<String>)  courses3;错误的类型

    }

}
