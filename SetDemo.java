import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
       Set<String> bucket=new TreeSet<>();
       bucket.add("苹果");
       bucket.add("香蕉");
       bucket.add("橘子");
       bucket.add("石榴");
        System.out.println(bucket.size());
        System.out.println(bucket);
    }

}
