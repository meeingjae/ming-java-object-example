package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

import java.util.ArrayList;
import java.util.List;

abstract class Phone {

    private List<Call> calls = new ArrayList<>();
    private double     taxRate;

    public void call(Call call) {

        calls.add(call);
    }

    protected void setTaxRate(double taxRate) {

        this.taxRate = taxRate;
    }

    public Money calculateFee() {

        Money result = Money.ZERO;

        for (Call call : calls) {
            result = calculateCallFee(call);
        }
        return result.plus(result.times(taxRate));
    }

    protected abstract Money calculateCallFee(Call call);
}
