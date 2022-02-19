package mingtoy.domain.mobile;

import mingtoy.domain.screen.Money;

public class TaxablePolicy extends AdditionalRatePolicy {

    private double taxRate;

    public TaxablePolicy(double taxRate, RatePolicy next) {

        super(next);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {

        return fee.plus(fee.times(taxRate));
    }
}
