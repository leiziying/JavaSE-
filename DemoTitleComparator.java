package demo;

import java.util.Comparator;

public class DemoTitleComparator implements Comparator<DemoBook> {
    @Override
    public int compare(DemoBook o1, DemoBook o2) {
        return o1.title.compareTo(o2.title);
    }
}
