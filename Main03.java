import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Contact03  contact03=new Contact03();
        while(true){
            //1.打印操作界面
            menu();
            //2.用户输入选择
            int  selected=scanner.nextInt();
            scanner.nextLine();
            //3.根据用户的选择，执行不同的操作
            switch (selected){
                case 1:
                    add(contact03,scanner);break;
              /*  case 2:
                    seaerch(scanner);break;
                case 3:
                    remove(scanner);break;
                case 4:
                    update(scanner);*//*break;*/
                    default:
                        System.out.println("指令错误！");
            }
        }
    }

    private  static void add(Contact03 contact03,Scanner scanner){
        System.out.println("请输入姓名：");
        String  name=scanner.nextLine();
        System.out.println("请输入手机：");
        String mobilePhone=scanner.nextLine();
        System.out.println("请输入办公室电话：");
        String officePhone=scanner.nextLine();
        try{
            contact03.add(name,mobilePhone,officePhone);
            System.out.println("添加成功!");
        }catch (NameExistException03  e){
            System.out.println("添加失败！用户已存在");
        }finally {
            System.out.println("*****************************");
        }
    }

    private  static void menu(){
        System.out.println("|   比特专用通讯录");
        System.out.println("|   1.添加");
        System.out.println("|   2.查找");
        System.out.println("|   3.删除");
        System.out.println("|   4.更新");
        System.out.println("请选择正确的选项：");
    }
}
