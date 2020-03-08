package TaxStrategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Invoice invoice = new Invoice(new BigDecimal("1500"));

        Context federal = new Context(new FederalTax());
        Context vat = new Context(new VatTax());
        Context duty = new Context(new DutyTax());

        System.out.println(federal.calculateTax(invoice));
        System.out.println(vat.calculateTax(invoice));
        System.out.println(duty.calculateTax(invoice));

//        Result:
//        105.00
//        150.0
//        270.00
    }
}
