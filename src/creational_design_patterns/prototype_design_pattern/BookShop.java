package creational_design_patterns.prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 0; i < 6; i++) {
            Book book = new Book();
            book.setId(i);
            book.setTitle("Book" + i);
            getBooks().add(book);
        }
    }

    // deep copy
    @Override
    protected BookShop clone() {
        BookShop bs = new BookShop();
        bs.setShopName(this.shopName);

        for (Book b: this.getBooks()) {
            bs.getBooks().add(b);
        }
        return bs;
    }
//    // shallow copy
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
