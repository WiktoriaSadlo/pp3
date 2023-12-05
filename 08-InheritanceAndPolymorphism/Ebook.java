public class Ebook extends Book{
    private String fileName;

    public Ebook(String name, String city, String title, String author, String fileName) {
        super(name, city, title, author);
        this.fileName = fileName;
    }

    void display() {
        System.out.printf("Book title: %s,\nAuthor: %s,\nFile name: %s,\nPublisher: %s\n\n",getTitle(),getAuthor(),fileName,getName());
    }
    
    //getters and setters

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
  
    
}
