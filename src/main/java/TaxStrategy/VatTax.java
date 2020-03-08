package TaxStrategy;

import java.math.BigDecimal;

public class VatTax implements Tax {
    public BigDecimal calculate(Invoice invoice) {
        return invoice.getCost()
                .multiply(BigDecimal.valueOf(0.10));
    }
}
