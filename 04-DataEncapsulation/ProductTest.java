package bin;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Oat Milk");
        p1.setVege(true);
        System.out.println(p1.display());
    }
}
