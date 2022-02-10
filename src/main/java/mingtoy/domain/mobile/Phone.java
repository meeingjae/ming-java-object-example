package mingtoy.domain.mobile;

import lombok.Getter;
import mingtoy.domain.screen.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Phone {

    private Money      money;
    private Duration   seconds;
    private double taxRate;
    private List<Call> calls = new ArrayList<>();

    public Phone(Money money, Duration seconds) {

        this.money = money;
        this.seconds = seconds;
    }

    public void call(Call call) {

        calls.add(call);
    }

    public Money calculateFee() {

        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(money.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        }
        return result.plus(result.times(taxRate));
    }
}
