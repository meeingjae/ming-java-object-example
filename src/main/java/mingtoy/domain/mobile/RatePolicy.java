package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
