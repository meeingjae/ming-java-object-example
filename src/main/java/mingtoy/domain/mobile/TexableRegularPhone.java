package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class TexableRegularPhone extends RegularPhone {

    private double taxRate;

    public TexableRegularPhone(Money money, Duration seconds, double taxRate) {

        super(money, seconds);
        this.taxRate = taxRate;
    }

    @Override
    public Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
