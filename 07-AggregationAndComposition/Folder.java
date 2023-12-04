package bin;

import java.util.ArrayList;

import java.util.Iterator;

public class Folder {
    String name,address;
    int size;
    ArrayList<File> files = new ArrayList<>();

    public Folder(String name, String address, int size) {
        this.name = name;
        this.address = address;
        this.size = size;
    }

    void addFile(String name,String address,String content, int size) {
        files.add(new File(name, address, content, size));
    }

    void displayFiles() {
        for(File file:files) {
            System.out.println(file.name);
        }
    }

    void removeFile(String fileName) {
        Iterator itr = files.iterator();
        while (itr.hasNext()) {
        File file = (File)itr.next();
            if (file.name == fileName) {
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
        Folder f1 = new Folder("aa", "C:/Desktop", 37890);
        f1.addFile("a1", "C:/Desktop/aa", "Ala ma kota", 4580);
        f1.addFile("a2", "C:/Desktop/aa", "Kot ma na imię Pan Mruczek", 5540);
        f1.displayFiles();
        f1.removeFile("a1");
        f1.displayFiles();
    }
}
