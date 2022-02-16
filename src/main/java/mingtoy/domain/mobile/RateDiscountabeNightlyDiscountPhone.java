package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class RateDiscountabeNightlyDiscountPhone extends NightlyDiscountPhone{

    private Money discountAmount;

    public RateDiscountabeNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds,
            Money discountAmount) {

        super(nightlyAmount, regularAmount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    public Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
