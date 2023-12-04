package bin;

public class FolderLesson {
    private String address;
    private int size;
    private FileLesson file;
    private String folderName;

    public FolderLesson(String address, int size, FileLesson file, String folderName) {
        this.address = address;
        this.size = size;
        this.file = file;
        this.folderName = folderName;
    }

    static void deleteFolder(Folder f) {
        f = null;
    }

    void displayAddress() {
        System.out.println(address);
    }

    void displayData() {
        System.out.printf("Folder name: %s,\nAddress: %s,\nSize: %d B \n",folderName,address,size);
    }

    void RenameFolder(String name) {
        this.folderName = name;
    }

    void addFile(FileLesson file) {
        this.file = file;
        this.size += size;
    }

    void deleteFile() {
        this.size -= file.getSize();
        file = null; //nie istnieje typowe usuwanie w javie
    }

    //setters and getters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public FileLesson getFile() {
        return file;
    }

    public void setFile(FileLesson file) {
        this.file = file;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
}
