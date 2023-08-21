import java.util.List;

public class InventoryApp {



        public static void main(String[] args) {
            Shop shop = new Shop();

            Product product1 = new Product("P001", "Product A", 10.99);
            Product product2 = new Product("P002", "Product B", 15.99);

            shop.addProduct(product1);
            shop.addProduct(product2);

            System.out.println("All Products:");
            List<Product> allProducts = shop.getAllProducts();
            for (Product product : allProducts) {
                System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
            }

            Product foundProduct = shop.getProduct("P001");
            if (foundProduct != null) {
                System.out.println("Found Product: " + foundProduct.getName());
            } else {
                System.out.println("Product not found.");
            }
        }


    }
