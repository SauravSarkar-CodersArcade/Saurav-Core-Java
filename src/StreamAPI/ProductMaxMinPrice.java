package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductMaxMinPrice {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Product 1", 100.0),
                new Product(2, "Product 2", 200.0),
                new Product(3, "Product 3", 50.0),
                new Product(4, "Product 4", 300.0)
        );

        // Finding the max product price
        Product maxPriceProduct = products.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);

        System.out.println("Max Price Product: " + maxPriceProduct);

        // Finding the min product price
        Product minPriceProduct = products.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);

        System.out.println("Min Price Product: " + minPriceProduct);
    }
}



