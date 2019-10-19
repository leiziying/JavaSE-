import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo01 {
    public static void main(String[] args) {
        Deque<String> deque=new LinkedList<>();
       deque.addFirst("学习");
        deque.addFirst("吃饭");
        ((LinkedList) deque).addFirst("睡觉");
        ((LinkedList) deque).addFirst("打豆豆");
        System.out.println(((LinkedList) deque).getFirst());
        System.out.println(((LinkedList) deque).getLast());
    }
}
