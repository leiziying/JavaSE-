public class JoinDemo1106 {
/*    private enum Week{
        MON,TUE,WED,THU,FRI,SAT,SUN
    }*/
  private static class Print张三  implements  Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("张三");
            Thread.yield();
        }
    }
}
private  static class Print李四  implements  Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("李四");
        }
    }
}

    public static void main(String[] args) {
        Thread 张三=new Thread(new Print张三());
        Thread 李四=new Thread(new Print李四());
        张三.start();
        李四.start();
    }
}
