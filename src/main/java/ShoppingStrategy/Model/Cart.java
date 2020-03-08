package ShoppingStrategy.Model;

import ShoppingStrategy.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Shopping shopping;
    private List<Product> products;

    public Cart(Shopping shopping) {
        this.shopping = shopping;
        products = new ArrayList();
    }

    public double getTotalPrice() {
        return shopping.calculatePrice(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}