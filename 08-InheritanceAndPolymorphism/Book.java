public class Book extends Publisher{
    private String title,author;

    public Book(String name, String city, String title, String author) {
        super(name, city);
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.printf("Book title: %s,\nAuthor: %s,\nPublisher: %s\n\n",title,author,getName());
    }

    //setters and getters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
}