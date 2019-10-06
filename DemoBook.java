package demo;

public class DemoBook implements Comparable<DemoBook> {
String ISBN;
String title;
String  author;
int price;
int sales;
int comments;

    public DemoBook(String ISBN, String title, String author, int price, int sales, int comments) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "DemoBook{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", comments=" + comments +
                '}';
    }

    @Override
    public int compareTo(DemoBook o) {
        return ISBN.compareTo(o.ISBN);
    }
}
