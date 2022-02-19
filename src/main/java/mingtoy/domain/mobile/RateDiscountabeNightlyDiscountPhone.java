package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class RateDiscountabeNightlyDiscountPhone extends NightlyDiscountPhone {

    private Money discountAmount;

    public RateDiscountabeNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds,
            Money discountAmount, RegularPolicy regularPolicy) {

        super(nightlyAmount, regularAmount, seconds, regularPolicy);
        this.discountAmount = discountAmount;
    }
}
