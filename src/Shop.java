import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> inventory;

    public Shop() {
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void removeProduct(Product product) {
        inventory.remove(product);
    }

    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId().equals(updatedProduct.getId())) {
                inventory.set(i, updatedProduct);
                break;
            }
        }
    }

    public Product getProduct(String productId) {
        for (Product product : inventory) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return inventory;
    }
}
