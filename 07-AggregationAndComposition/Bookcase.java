package bin;

import java.util.ArrayList;

public class Bookcase {
    ArrayList<Book> books = new ArrayList<>();

    void placedBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    void display() {
        System.out.println("Bookcase contain: ");
        int x = 1;
        for(Book book:books) {
            System.out.println(x);
            book.display();
            x++;
        }
    }

}
