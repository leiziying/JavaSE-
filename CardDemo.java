public class CardDemo{
    public int rank;//牌面值
    public String suit;//花色
    @Override
    public  String  toString(){
        return String.format("[%s   %d]",suit,rank);
    }
}

