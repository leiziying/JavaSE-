import java.util.Arrays;
//String类代表字符串。 Java程序中的所有字符串文字（例如"abc" ）都被实现为此类的实例。
public final class MyString {//用数组实现String
    private final char[]  value;//首先定义一个char类型数组
    public  MyString(char[]  value  ){//该数组的构造方法
        this.value= Arrays.copyOf(value,value.length);//复制指定的数组，用空值截断或填充（如有必要），以便复制具有指定的长度。
    }
    public MyString(char[]  value,int offset,int count ){
        this.value=Arrays.copyOfRange(value,offset,offset+count);//copyOfRange(boolean[] original, int from, int to)
        //将指定数组的指定范围复制到新数组中。
    }
    public char charAt(int index){
        return value[index];
    }
    public char[] toCharArraay(){
        return Arrays.copyOf(value,value.length);
    }
    @Override
    //equals如果子类中没有重写,默认调用Object类中的equals方法,比较的是地址,但是可以重写,自定义比较规则,按照内容比较对象是否相同
    //String类中的equals 是比较字符串是否相同( 被重写过的equals方法 )
    public boolean  equals(Object o){
        if(this==o){//== 比较对象的是地址是否相同
            return true;
        }
        if(!(o instanceof  MyString)){//A instanceof B ，返回值为boolean类型，用来判断A是否是B的实例对象或者B子类的实例对象。如果是则返回true,否则返回false
            return false;
        }
        MyString myString=(MyString)o;
        return Arrays.equals(value,myString.value);
    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(value);
    }
    //将小写字母转成大写字母
    public MyString toUpperCase(){
        char[] value=toCharArraay();
        for(int i=0;i<value.length;i++){
            if(Character.isLowerCase(value[i])){//isLowerCase(char ch)确定指定的字符是否是小写字符。
                value[i]=Character.toUpperCase(value[i]);//toUpperCase(char ch)使用UnicodeData文件中的案例映射信息将字符参数转换为大写
            }
        }
        return  new MyString(value);
    }

    public boolean equalsIsignoreCase(MyString o){
        if(o==null){
            return false;
        }
        if(value.length!=o.value.length){
            return false;
        }
        for(int i=0;i<value.length;i++){
            char c=Character.toUpperCase(value[i]);
            char d=Character.toUpperCase(o.value[i]);
            if(c!=d){
                return false;
            }
        }
        return true;
    }

    public MyString concat(MyString o){
        char[]  v=new char[value.length+o.value.length];
        System.arraycopy(value,0,v,0,value.length);
        System.arraycopy(o.value,0,v,value.length,o.value.length);
        return new MyString(v);
    }
}
