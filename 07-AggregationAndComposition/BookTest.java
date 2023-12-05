package bin;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Clone", "A. Negrońska", 576, 2022);
        b1.display();
        b1.addChapter("Początek", 23, 9);
        b1.display();
        Bookcase bookcase = new Bookcase();
        bookcase.placedBook(b1);
        bookcase.display();
    }
}
