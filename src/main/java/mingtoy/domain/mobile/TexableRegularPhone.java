package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class TexableRegularPhone extends RegularPhone {

    private double taxRate;

    public TexableRegularPhone(Money money, Duration seconds, double taxRate, RegularPolicy regularPolicy) {

        super(money, seconds, regularPolicy);
        this.taxRate = taxRate;
    }
}
