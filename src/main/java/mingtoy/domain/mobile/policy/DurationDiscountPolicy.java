package mingtoy.domain.mobile.policy;

import mingtoy.domain.mobile.Call;
import mingtoy.domain.mobile.DurationDiscountRule;
import mingtoy.domain.screen.Money;

import java.util.ArrayList;
import java.util.List;

public class DurationDiscountPolicy extends BasicRatePolicy {

    private List<DurationDiscountRule> rules = new ArrayList<>();

    public DurationDiscountPolicy(List<DurationDiscountRule> rules) {

        this.rules = rules;
    }

    @Override
    protected Money calculateCallFee(Call call) {

        Money result = Money.ZERO;
        rules.forEach(rule -> result.plus(rule.calculate(call)));

        return result;
    }
}
