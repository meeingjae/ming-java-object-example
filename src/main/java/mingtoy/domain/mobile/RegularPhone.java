package mingtoy.domain.mobile;

import lombok.Getter;
import mingtoy.domain.mobile.policy.FixedFeePolicy;
import mingtoy.domain.screen.Money;

import java.time.Duration;

@Getter
public class RegularPhone extends Phone {

    private Money    money;
    private Duration seconds;

    public RegularPhone(Money money, Duration seconds, FixedFeePolicy fixedFeePolicy) {

        super(fixedFeePolicy);
        this.money = money;
        this.seconds = seconds;
    }
}
