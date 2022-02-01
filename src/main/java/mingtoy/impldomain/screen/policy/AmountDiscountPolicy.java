package mingtoy.impldomain.screen.policy;

import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Screening;
import mingtoy.domain.screen.policy.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discount, DiscountCondition... conditions) {

        super(conditions);
        this.discountAmount = discount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {

        return discountAmount;
    }
}
