package bin;

public class File {
    String name,address,content;
    int size;

    public File(String name, String address, String content, int size) {
        this.name = name;
        this.address = address;
        this.content = content;
        this.size = size;
    }

    void displayContent() {
        System.out.println(content);
    }
}
