package ShoppingStrategy;

import ShoppingStrategy.Model.Cart;
import ShoppingStrategy.Model.Product;
import ShoppingStrategy.Model.Region;
import ShoppingStrategy.Model.Size;

public class Main {

    public static void main(String[] args) {
        Shopping shopping;
//       Define a region for the USA.
//       This is for demo purposes only - it should be injected depending on user address.
        Region region = Region.EUR;

//      Choice of strategy according to user region
        if(region == Region.USA) {
            shopping = new AmericaShopping();
        }
        else {
            shopping = new EuropeShopping();
        }

        Cart cart = new Cart(shopping);
        cart.addProduct(new Product(0, "Dell", 125, Size.L));
        cart.addProduct(new Product(1, "Iphone", 1235, Size.S));
        cart.addProduct(new Product(2, "TV", 535, Size.XL));

        double totalPrice = cart.getTotalPrice();
        System.out.println("Total price : " + totalPrice + " " + shopping.getCurrency());
//        for region = REGION.USA the result is: Total price : 1447.5 USD
//        for region = REGION.EUR the result is: Total price : 2842.5 EUR
    }
}
