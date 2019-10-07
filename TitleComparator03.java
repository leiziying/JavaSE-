package demo03;

import java.util.Comparator;

public class TitleComparator03 implements Comparator<Book03> {
    @Override
    public int compare(Book03 o1, Book03 o2) {
        return o1.title.compareTo(o2.title);
    }
}
