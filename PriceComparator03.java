package demo03;

import java.util.Comparator;

public class PriceComparator03 implements Comparator<Book03> {
    boolean asc;

    /**
     * asc为true代表从小到大
     *asc为false代表从大到小
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Book03 o1, Book03 o2) {
        if(asc){
            return o1.price-o2.price;
        }else{
            return  o2.price-o1.price;
        }
    }
}
