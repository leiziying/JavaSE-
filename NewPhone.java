package demo02;

public class NewPhone extends  Phone{
    @Override
    public void  show(){
        super.show();//把父类的show方法拿过来重复利用
        //System.out.println("显示号码");
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
