package mingtoy.domain.screen.policy;

import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Screening;

public class NoneDiscountPolicy implements DiscountPolicy{

    @Override
    public Money calculateDiscountAmount(Screening screening) {

        return Money.ZERO;
    }
}
