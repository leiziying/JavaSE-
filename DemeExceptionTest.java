public class DemeExceptionTest {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        try{
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");
        }catch (ArrayIndexOutOfBoundsException e){
            //打印出现异常的调用栈
            e.printStackTrace();
        }
        System.out.println("After try catch");
    }
}
/*
异常处理流程：
 程序先执行try中的代码
 如果try中的代码出现异常，就会结束try中的代码，看和catch 中的异常类型是否匹配
 如果没有找到匹配的异常类型，finally中的代码就会被执行到（在该方法结束之前执行）
 如果上层调用者也没有处理的了异常，就继续向上传递
 一致到main方法也没有合适的代码处理异常，就会交给JVM来进行处理，此时程序就会异常终止
 */
