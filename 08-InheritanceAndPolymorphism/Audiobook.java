public class Audiobook extends Book{
    int minuts,secounds;

    public Audiobook(String name, String city, String title, String author, int minuts, int secounds) {
        super(name, city, title, author);
        this.minuts = minuts;
        this.secounds = secounds;
    }

    void display() {
        System.out.printf("Book title: %s,\nAuthor: %s,\nTime: %d min and %d sec,\nPublisher: %s\n\n",getTitle(),getAuthor(),minuts,secounds,getName());
    }

    //seters and getters

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public int getSecounds() {
        return secounds;
    }

    public void setSecounds(int secounds) {
        this.secounds = secounds;
    }

   

    
}
