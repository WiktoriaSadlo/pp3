package bin;

public class Book {
    String title;
    String author;
    int pages,year;

    
    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }


    void display() {
        System.out.printf("Title: %s,\nAuthor: %s,\nPages: %d\n",title,author,pages);
    }

    public static void main(String[] args) {
        //Book b1 = new Book("Flawless", null, 0, 0);
        //b1.display();
    }
}