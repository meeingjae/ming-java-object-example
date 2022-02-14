package mingtoy.domain.mobile;

import lombok.Getter;
import mingtoy.domain.screen.Money;

import java.time.Duration;

@Getter
public class RegularPhone extends Phone {

    private Money    money;
    private Duration seconds;

    public RegularPhone(Money money, Duration seconds, double taxRate) {

        this.money = money;
        this.seconds = seconds;
        super.setTaxRate(taxRate);
    }

    @Override
    protected Money calculateCallFee(Call call) {

        return money.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
