/*
* 主线程：执行主方法的线程
* 单线程程序：java程序中只有一个线程
*             执行从main方法开始，从上到下依次执行
* */
public class DemoMainThread {
    public static void main(String[] args) {
        Person1109  p1=new Person1109("小强");
        p1.run();
        Person1109 p2=new Person1109("旺财");
        p2.run();
    }
}
