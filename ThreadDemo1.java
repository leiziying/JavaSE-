public class ThreadDemo1 {
    public  static class MyThread extends  Thread{
        @Override
        public void run()
        {
           while(true){
               System.out.println("我在method2中打印");
               try{
                   Thread.sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
        }
    }
    private  static void method2(){
        Thread thread=new MyThread();
        thread.start();
    }
    public static void main(String[] args)  throws  InterruptedException{
        method2();
        while(true){
            System.out.println("我在main中打印");
            //进程会暂停运行一秒
            Thread.sleep(1000);
        }
    }
    private static void method1()  throws  InterruptedException{
        while(true){
            System.out.println("我在method1中打印");
            //进程会暂停运行一秒
            Thread.sleep(1000);
        }
    }
}
