package mingtoy.domain.mobile;

import mingtoy.domain.mobile.policy.FixedFeePolicy;
import mingtoy.domain.screen.Money;

import java.time.Duration;

public class RateDiscountabeNightlyDiscountPhone extends NightlyDiscountPhone {

    private Money discountAmount;

    public RateDiscountabeNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds,
            Money discountAmount, FixedFeePolicy fixedFeePolicy) {

        super(nightlyAmount, regularAmount, seconds, fixedFeePolicy);
        this.discountAmount = discountAmount;
    }
}
