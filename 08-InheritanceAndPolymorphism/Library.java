import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    void addBook(Book book) {
        books.add(book);
    }

    void display() {
        int x = 1;
        System.out.println("Library contain: ");
        for (Book book:books) {
            System.out.println(x);
            book.display();
            x++;
        }
    }

}
