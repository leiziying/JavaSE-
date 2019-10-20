import java.util.Arrays;

public final class MyStringDemo {
    private final  char[]  value;
    public MyStringDemo(char[]  value){
        this.value= Arrays.copyOf(value,value.length);
    }
    public MyStringDemo(char[]  value,int offset,int count){
        this.value=Arrays.copyOfRange(value,offset,offset+count);
    }
    public char charAt(int index){
        return value[index];
    }
    public char[]  toCharArray(){
        return Arrays.copyOf(value,value.length);
    }
    @Override
    public boolean  equals(Object  o){
        if(this==o){
            return true;
        }
        if(!(o  instanceof  MyStringDemo)){
            return false;
        }
        MyStringDemo  myStringDemo=(MyStringDemo)o;
      return Arrays.equals(value,myStringDemo.value);
    }
    public int hashCode(){
        return   Arrays.hashCode(value);
    }

    public MyStringDemo toUpperCase(){
        char[]  value=toCharArray();
        for(int i=0;i<value.length;i++){
            if(Character.isLowerCase(value[i])){
                value[i]=Character.toUpperCase(value[i]);
            }
        }
        return new MyStringDemo(value);
    }

    public  boolean equalsIgnoreCase(MyStringDemo o){
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
        return  true;
    }

    public MyStringDemo contact(MyStringDemo o){
        char[] v=new char[value.length+o.value.length];
        System.arraycopy(value,0,v,0,value.length);
        System.arraycopy(o.value,0,v,value.length,o.value.length);
        return new MyStringDemo(v);
    }
}
