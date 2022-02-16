package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class RateDiscountableRegularPhone extends RegularPhone{

    private Money discountAmount;

    public RateDiscountableRegularPhone(Money money, Duration seconds, Money discountAmount) {

        super(money, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    public Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
