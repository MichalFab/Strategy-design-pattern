package ShoppingStrategy;


import ShoppingStrategy.Model.Currency;
import ShoppingStrategy.Model.Product;

import java.util.List;

public interface Shopping {

    double calculatePrice(List<Product> products);
    Currency getCurrency();
}