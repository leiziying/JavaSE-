package demo03;

import java.time.chrono.IsoChronology;

public class Book03 implements Comparable<Book03> {
    String ISBN;
    String  author;
    int price;
    int sales;
    int comments;
    String title;

    public Book03(String ISBN, String author, int price, int sales, int comments, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.comments = comments;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book03{" +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", comments=" + comments +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book03 o) {
        return ISBN.compareTo(o.ISBN);
    }
}
