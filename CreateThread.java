public class CreateThread {
    private static class MyThread extends  Thread{
        @Override
        public void run(){

        }
    }
    private static class   MyRunnale implements  Runnable{

        @Override
        public void run() {

        }
    }
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnale());
        Thread thread3 = new Thread(new MyThread());
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        //常见的方法（匿名类）
        Thread thread4 = new Thread() {
            @Override
            public void run() {

            }
        };
        Thread thread5=new Thread(()->{
            //覆写run方法的代码
        });
    }
}
