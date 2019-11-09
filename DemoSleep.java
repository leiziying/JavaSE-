public class DemoSleep {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=60;i++){
            //模拟秒表
            System.out.println(i);
            //使用Thread类的sleep方法让程序睡眠1秒钟
            Thread.sleep(1000);
        }
    }
}
