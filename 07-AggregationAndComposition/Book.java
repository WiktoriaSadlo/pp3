package bin;

import java.util.ArrayList;

public class Book {
    String title;
    String author;
    int pages,year;
    ArrayList<Chapter> chapters = new ArrayList<>();

    
    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    void addChapter(String title, int pages, int startingPage) {
        chapters.add(new Chapter(title, pages, startingPage));
    }


    void display() {
        System.out.printf("Title: %s,\nAuthor: %s,\nPages: %d,\nNumber of chapters: %d\n\n",title,author,pages,chapters.size());
        for(Chapter chapter:chapters){
            chapter.display();
        }
    }

}