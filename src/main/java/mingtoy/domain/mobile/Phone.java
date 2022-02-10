package mingtoy.domain.mobile;

import lombok.Getter;
import mingtoy.domain.screen.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Phone {

    private static final int LATE_NIGHT_HOUR = 22;

    private Money      amount;
    private Money      regularAmount;
    private Money      nightlyAmount;
    private Duration   seconds;
    private double     taxRate;
    private PhoneType  type;
    private List<Call> calls = new ArrayList<>();


    enum PhoneType {
        REGULAR,
        NIGHTLY
    }

    public Phone(Money amount, Duration seconds) {

        this.amount = amount;
        this.seconds = seconds;
    }

    public Phone(Money regularAmount, Money nightlyAmount, Duration seconds) {

        this.regularAmount = regularAmount;
        this.nightlyAmount = nightlyAmount;
        this.seconds = seconds;
    }

    public Phone(PhoneType type, Money amount, Money regularAmount, Money nightlyAmount, Duration seconds) {

        this.type = type;
        this.amount = amount;
        this.regularAmount = regularAmount;
        this.nightlyAmount = nightlyAmount;
        this.seconds = seconds;
    }

    public void call(Call call) {

        calls.add(call);
    }

    public Money calculateFee() {

        Money result = Money.ZERO;

        for (Call call : calls) {
            if (type == PhoneType.REGULAR) {
                result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
            } else {
                if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
                    result = result.plus(nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
                } else {
                    result = result.plus(regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
                }
            }
        }
        return result;
    }
}
