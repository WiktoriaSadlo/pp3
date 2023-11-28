public class Folder {

    private String address;
    private int size;
    private File file;
    private String folderName;

    public Folder(String address, int size, File file, String folderName) {
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

    void addFile(File file) {
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

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
}