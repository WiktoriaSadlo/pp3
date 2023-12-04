package bin;

public class Author {
    String name,surname;
    Book book;
    int age;

    public Author(String name, String surname, Book book, int age) {
        this.name = name;
        this.surname = surname;
        this.book = book;
        this.age = age;
    }

    void writeBook(String title,int pages, int year) {
        Book b1 = new Book(title, this.surname, pages, year);
        book = b1;
    }
    
    public static void main(String[] args) {
        Author a = new Author("Marta", "Labecka", null, 23);
        a.writeBook("Flawless", 435, 2021);
        a.book.display();
    }
}
