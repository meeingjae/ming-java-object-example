package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {

    private double taxRate;

    public TaxableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount,
            Duration seconds, double taxRate, RegularPolicy regularPolicy) {

        super(nightlyAmount, regularAmount, seconds, regularPolicy);
        this.taxRate = taxRate;
    }

}