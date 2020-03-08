package TaxStrategy;

import java.math.BigDecimal;

public class Context {
    private Tax tax;

    public Context(Tax tax) {
        this.tax = tax;
    }

    public BigDecimal calculateTax(Invoice invoice) {
        return tax.calculate(invoice);
    }
}
