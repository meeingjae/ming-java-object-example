package mingtoy.domain.mobile.policy;

import mingtoy.domain.mobile.Phone;
import mingtoy.domain.screen.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
