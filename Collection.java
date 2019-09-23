import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class Demo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        System.out.println(list.size());//0
        System.out.println(list.isEmpty());//true
        ((ArrayList<String>) list).add("我");
        ((ArrayList<String>) list).add("爱");
        ((ArrayList<String>) list).add("Java");
        System.out.println(list.size());//3
        System.out.println(list.isEmpty());//false
        Object[]  array=list.toArray();
        System.out.println(Arrays.toString(array));//我爱Java
        for(String s:list){
            System.out.println(s);
        }
        list.remove("爱");
        for(String s:list){
            System.out.println(s);
        }
        list.clear();//清空
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
