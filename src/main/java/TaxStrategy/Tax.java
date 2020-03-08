package TaxStrategy;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculate(Invoice invoice);
}
