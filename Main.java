import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Laptop(1, "MacBook Air M3", 28_990_000, "Apple"));
        products.add(new Laptop(2, "Dell XPS 13", 34_990_000, "Dell"));
        products.add(new Smartphone(3, "iPhone 16", 22_990_000, 170));
        products.add(new Smartphone(4, "Samsung Galaxy S25", 20_990_000, 162));
        products.add(new Tablet(5, "iPad Air", 16_490_000, 11));

        System.out.println("PRODUCT LIST");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
