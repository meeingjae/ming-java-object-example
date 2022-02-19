package mingtoy.domain.mobile;

import lombok.Getter;
import mingtoy.domain.screen.Money;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Phone {

    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {

        this.ratePolicy = ratePolicy;
    }

    public void call(Call call) {

        calls.add(call);
    }

    public Money calculateFee() {

        return ratePolicy.calculateFee(this);
    }
}
