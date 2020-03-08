package ShoppingStrategy;

import ShoppingStrategy.Model.Currency;
import ShoppingStrategy.Model.Product;
import ShoppingStrategy.Model.Size;

import java.util.List;

public class AmericaShopping implements Shopping {

    private final double USD_TAX = 0.75;
    private final double DUTY_TAX = 1.0;
    private double DELIVERY_COST = 15;

    @Override
    public double calculatePrice(List<Product> products) {
        double totalPrice = 0;
        for(Product product : products) {
            if(product.getSize() == Size.XL) {
                totalPrice += product.getPrice() * DUTY_TAX;
                DELIVERY_COST += 10;
            }
            else {
                totalPrice += product.getPrice() * DUTY_TAX;
                DELIVERY_COST += 5;
            }
        }
        return (totalPrice + DELIVERY_COST) * USD_TAX;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}