import java.util.*;

public class DemoMain07 {
    public static void main(String[] args) {
        List<Book>  books=new ArrayList<>();
        books.add(new Book("67","qk","wod",5,89,90));
        List<Book> copy;
        //按自然顺序（ISBN）排序
        System.out.println("按ISBN排序：");
        copy=new ArrayList<>(books);
       Sort.sort(copy);
        System.out.println(copy);
        //按书名排序
        System.out.println("按书名排序：");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new TitleComparator());
        System.out.println(copy);
        //按价格排序-从小到大
        System.out.println("按价格-从小到大排序：");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new PriceComparator(true));
        System.out.println(copy);
        //按价格-从大到小
        System.out.println("按价格-从大到小排序：");
        copy=new ArrayList<>(books);
        Sort.sort(copy,new PriceComparator(false));
        System.out.println(copy);
        }
    }
