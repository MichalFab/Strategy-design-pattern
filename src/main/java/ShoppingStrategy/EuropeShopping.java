package ShoppingStrategy;

import ShoppingStrategy.Model.Currency;
import ShoppingStrategy.Model.Product;
import ShoppingStrategy.Model.Size;

import java.util.List;

public class EuropeShopping implements Shopping {

    private final double DUTY_TAX = 1.5;
    private double DELIVERY_COST = 11;

    @Override
    public double calculatePrice(List<Product> products) {
        double totalPrice = 0;
        for(Product product : products) {
            totalPrice += product.getPrice() * DUTY_TAX;
            if(product.getSize() == Size.XL)
                DELIVERY_COST += 10;
        }
        return totalPrice;
    }

    @Override
    public Currency getCurrency() {
        return Currency.EUR;
    }
}

