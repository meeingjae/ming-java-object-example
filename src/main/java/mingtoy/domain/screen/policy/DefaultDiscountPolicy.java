package mingtoy.domain.screen.policy;

import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Screening;
import mingtoy.domain.screen.policy.condition.DiscountCondition;

import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private List<DiscountCondition> conditions;

    public DefaultDiscountPolicy(DiscountCondition... counditions) {

        this.conditions = Arrays.asList(counditions);
    }

    public Money calculateDiscountAmount(Screening screening) {

        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
