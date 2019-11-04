public class CreateThread1105 {
    private static class MyThread extends  Thread{
        @Override
        public void run(){
            //让该线程去做的事情
        }
    }
    private static class MyRunnable implements  Runnable{
        @Override
        public void run(){
            //让该线程去做的事情
        }
    }

    public static void main(String[] args) {
        //创建好了Thread的对象，描述
        Thread thread1=new MyThread();
        Thread thread2=new Thread(new MyRunnable());
        Thread thread3=new Thread(new MyThread());
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        //常见的方法-继承Thread(匿名类/lambda)
        Thread thread4=new Thread(){
            @Override
            public void run(){
                //覆写run方法的代码
            }
        };
        //常见的方法-继承Runnable(匿名类/lambda)
        Thread thread6=new Thread(new Runnable() {
            @Override
            public void run() {
                //覆写run方法的代码
            }
        });
        Thread thread7=new Thread(()->{
            //覆写run方法的代码
        });
    }
}
