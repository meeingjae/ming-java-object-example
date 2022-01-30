package mingtoy.domain.screen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Money {

    public static final Money ZERO = Money.ones(0);

    private BigDecimal amount;

    public static Money ones(long amount) {

        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money ones(double amount) {

        return new Money(BigDecimal.valueOf(amount));
    }

    public Money plus(Money amount) {

        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {

        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent) {

        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessthan(Money other) {

        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {

        return amount.compareTo(other.amount) >= 0;
    }

}
