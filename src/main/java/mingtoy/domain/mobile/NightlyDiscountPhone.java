package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {

    private static final int LATE_NIGHT_HOUR = 22;

    private Money    nightlyAmount;
    private Money    regularAmount;
    private Duration seconds;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds,
            FixedFeePolicy fixedFeePolicy) {

        super(fixedFeePolicy);
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }
}
