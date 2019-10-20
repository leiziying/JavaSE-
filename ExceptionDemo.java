import jdk.nashorn.internal.objects.NativeUint8Array;

public class ExceptionDemo {
    public static void throwExceptionMethod(boolean  isThrow){
        System.out.println("抛异常之前");
        if(isThrow){
            throw  new   NullPointerException();
        }
        System.out.println("抛异常之后");
    }

    public static void main(String[] args) {
        try{
            throwExceptionMethod(true);
        }catch(NullPointerException    exc){
            System.out.println("捕获到异常");
        }finally {
            System.out.println("最终总得过来一趟");
        }
    }
}
