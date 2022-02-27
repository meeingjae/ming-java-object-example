package mingtoy.domain.mobile.policy;

import mingtoy.domain.mobile.Call;
import mingtoy.domain.mobile.DayOfWeekDiscountRule;
import mingtoy.domain.screen.Money;

import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountPolicy extends BasicRatePolicy {

    private List<DayOfWeekDiscountRule> rules = new ArrayList<>();

    public DayOfWeekDiscountPolicy(List<DayOfWeekDiscountRule> rules) {

        this.rules = rules;
    }

    @Override
    protected Money calculateCallFee(Call call) {

        Money result = Money.ZERO;
        call.getInterval().splitByDay().forEach(
                interval -> rules.forEach(
                        rule -> result.plus(rule.calculate(interval))));

        return result;
    }
}
