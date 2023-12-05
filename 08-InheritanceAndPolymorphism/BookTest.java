public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Edito","Łódź","Flaw(less)", "M. Łabęcka");
        b1.display();

        Ebook eb1 = new Ebook("Fabryka Słów","Lublin","The Inheritance Game", "J.L.Barnes", "the_inheritance_game.epub");
        eb1.display();
        eb1.setTitle("The Inheritance Game 2");
        eb1.display();

        Audiobook ab1 = new Audiobook("Nasza Księgarnia","Kraków","Hobbit - Chapter 1", "J.R.R. Tolkien", 73, 4);
        ab1.display();

        Library library = new Library();
        library.addBook(ab1);
        library.addBook(eb1);
        library.display();
    }
}
