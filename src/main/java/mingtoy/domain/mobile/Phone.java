package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.util.ArrayList;
import java.util.List;

abstract class Phone {

    private List<Call> calls = new ArrayList<>();

    public void call(Call call) {

        calls.add(call);
    }

    public Money calculateFee() {

        Money result = Money.ZERO;

        for (Call call : calls) {
            result = calculateCallFee(call);
        }
        return result;
    }

    protected Money afterCalculated(Money fee) {
        return fee;
    }

    protected abstract Money calculateCallFee(Call call);
}
