package mingtoy.domain.screen.policy;

import mingtoy.domain.screen.Money;
import mingtoy.domain.screen.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
