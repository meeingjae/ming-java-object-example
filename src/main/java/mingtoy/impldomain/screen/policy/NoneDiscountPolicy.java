package mingtoy.impldomain.screen.policy;

import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Screening;
import mingtoy.domain.screen.policy.DiscountPolicy;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {

        return Money.ZERO;
    }
}
