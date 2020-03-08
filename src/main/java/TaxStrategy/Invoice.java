package TaxStrategy;

import java.math.BigDecimal;

public class Invoice {
    private BigDecimal cost;

    public Invoice(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
