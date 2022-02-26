package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class TexableRegularPhone extends RegularPhone {

    private double taxRate;

    public TexableRegularPhone(Money money, Duration seconds, double taxRate, FixedFeePolicy fixedFeePolicy) {

        super(money, seconds, fixedFeePolicy);
        this.taxRate = taxRate;
    }
}
