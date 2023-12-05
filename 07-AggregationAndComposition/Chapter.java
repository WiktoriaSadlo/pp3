package bin;

public class Chapter {
    String chapterTitle;
    int pages,startingPage;

    public Chapter(String chapterTitle, int pages, int startingPage) {
        this.chapterTitle = chapterTitle;
        this.pages = pages;
        this.startingPage = startingPage;
    }

    void display() {
        System.out.printf("Chapter title: %s,\nPages: %d,\nStarting page: %d\n\n",chapterTitle,pages,startingPage);
    }
}
