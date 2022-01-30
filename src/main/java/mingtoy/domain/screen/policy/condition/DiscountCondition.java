package mingtoy.domain.screen.policy.condition;

import mingtoy.domain.screen.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
