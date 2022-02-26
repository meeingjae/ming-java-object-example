package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class RateDiscountableRegularPhone extends RegularPhone {

    private Money discountAmount;

    public RateDiscountableRegularPhone(Money money, Duration seconds, Money discountAmount,
            FixedFeePolicy fixedFeePolicy) {

        super(money, seconds, fixedFeePolicy);
        this.discountAmount = discountAmount;
    }
}
