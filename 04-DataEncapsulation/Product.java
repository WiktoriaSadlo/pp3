package bin;

public class Product {
    private String name;
    private boolean vege;

    public String getName() {
        return name;
    }
    public boolean isVege() {
        return vege;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVege(boolean vege) {
        this.vege = vege;
    }

    String display() {
        return String.format("Product: %s,\nIs vegetarian: %b\n", name,vege);
    }
    
}
