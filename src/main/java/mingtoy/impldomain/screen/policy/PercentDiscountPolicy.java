package mingtoy.impldomain.screen.policy;

import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Screening;
import mingtoy.domain.screen.policy.condition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {

        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {

        return screening.getMovieFee().times(percent);
    }
}
