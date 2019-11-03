public class StopThread003 {
    private static class Worker extends  Thread{
        Worker(){
            super("李四");
        }
        @Override
        public void run(){
            while(true){
                System.out.println(Thread.interrupted());
                System.out.println(this.isInterrupted());
            }
        }
    }

    public static void main(String[] args)  throws  InterruptedException{
        Worker worker=new Worker();
        worker.start();
        worker.interrupt();
    }
}
